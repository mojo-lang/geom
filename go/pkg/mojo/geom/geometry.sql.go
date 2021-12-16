package geom

import (
	"database/sql/driver"
	"encoding/hex"
	"fmt"
	"reflect"
)

var wktPrefixes = map[string]bool{
	"point": true,
	"lines": true,
	"polyg": true,
	"multi": true,
	"geome": true,
	"srid=": true,
	"POINT": true,
	"LINES": true,
	"POLYG": true,
	"MULTI": true,
	"GEOME": true,
	"SRID=": true,
}

func (m *Geometry) Scan(value interface{}) (err error) {
	v := reflect.ValueOf(value)
	if !v.IsValid() || (v.CanAddr() && v.IsNil()) {
		return nil
	}

	var bytes []byte
	wkt := false
	switch bs := value.(type) {
	case []byte: // wkb, using st_asbinary
		bytes = bs
	case string:
		if len(bs) >= 5 && wktPrefixes[bs[:5]] { // wkt types, using st_astext()
			bytes = []byte(bs)
			wkt = true
		} else { // default hexed binary string
			bytes, err = hex.DecodeString(bs)
			if err != nil {
				return err
			}
		}
	default:
		return fmt.Errorf("failed to Decode type %T -> %T", value, m)
	}

	if wkt {
		return m.FromWKT(string(bytes))
	} else {
		return m.FromWKB(bytes)
	}
}

func (m Geometry) Value() (driver.Value, error) {
	return m.ToWKT(), nil
}

// GormDataType gorm common data type
func (m Geometry) GormDataType() string {
	return "geometry"
}
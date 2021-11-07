package geom

import (
	"database/sql/driver"
	"fmt"
	"reflect"
)

func (m *LngLat) Scan(value interface{}) (err error) {
	v := reflect.ValueOf(value)
	if !v.IsValid() || (v.CanAddr() && v.IsNil()) {
		return nil
	}
	switch bs := value.(type) {
	case []byte:
		_, err := fmt.Sscanf(string(bs), "(%f,%f)", &m.Longitude, &m.Latitude)
		return err
	case string:
		_, err := fmt.Sscanf(bs, "(%f,%f)", &m.Longitude, &m.Latitude)
		return err
	default:
		return fmt.Errorf("failed to Decode type %T -> %T", value, m)
	}
}

func (m LngLat) Value() (driver.Value, error) {
	if m.IsEmpty() {
		return nil, nil
	}

	str := fmt.Sprintf("(%f,%f)", m.Longitude, m.Latitude)
	return str, nil
}

// GormDataType gorm common data type
func (m LngLat) GormDataType() string {
	return "point"
}

// GormDBDataType gorm db data type
//func (m LngLat) GormDBDataType(db *gorm.DB, field *schema.Field) string {
//	switch db.Dialector.Name() {
//	case "sqlite":
//		return "JSON"
//	case "mysql":
//		return "JSON"
//	case "postgres":
//		return "JSONB"
//	}
//	return ""
//}
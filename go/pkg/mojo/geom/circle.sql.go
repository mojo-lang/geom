package geom

import (
	"database/sql/driver"
	fmt "fmt"
	"reflect"
)

// Implement driver.Valuer and sql.Scanner interfaces on Brand
func (m Circle) Value() (driver.Value, error) {
	if m.Radius == 0 && m.Center.IsEmpty() {
		return nil, nil
	}

	str := fmt.Sprintf("<(%f,%f),%f>", m.Center.Longitude, m.Center.Latitude, m.Radius)
	return str, nil
}

func (m *Circle) Scan(src interface{}) error {
	v := reflect.ValueOf(src)
	if !v.IsValid() || (v.CanAddr() && v.IsNil()) {
		return nil
	}
	switch bs := src.(type) {
	case []byte:
		_, err := fmt.Sscanf(string(bs), "<(%f,%f),%f>", &m.Center.Longitude, &m.Center.Latitude, &m.Radius)
		return err
	case string:
		_, err := fmt.Sscanf(bs, "<(%f,%f),%f>", &m.Center.Longitude, &m.Center.Latitude, &m.Radius)
		return err
	default:
		return fmt.Errorf("Could not not Decode type %T -> %T", src, m)
	}
}

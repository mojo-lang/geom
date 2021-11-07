package geom

import (
	"fmt"
	jsoniter "github.com/json-iterator/go"
	"strings"
)

func ParseLngLat(lngLat string) (*LngLat, error) {
	ll := &LngLat{}
	err := ll.Parse(lngLat)
	if err != nil {
		return nil, err
	}
	return ll, nil
}

func (m *LngLat) Format() string {
	if m == nil || m.IsEmpty() {
		return ""
	}
	if m.Altitude != 0 {
		return fmt.Sprintf("%f,%f,%f", m.Longitude, m.Latitude, m.Altitude)
	} else {
		return fmt.Sprintf("%f,%f", m.Longitude, m.Latitude)
	}
}

func (m *LngLat) Parse(value string) error {
	if m == nil {
		return nil
	}

	value = strings.TrimSpace(value)
	if !strings.HasPrefix(value, "[") {
		value = "[" + value + "]"
	}
	var points []float64
	err := jsoniter.ConfigFastest.UnmarshalFromString(value, &points)
	if err != nil {
		return err
	}
	if len(points) < 2 {
		return fmt.Errorf("invalid lnglat string format: %s", value)
	}

	m.Longitude = points[0]
	m.Latitude = points[1]
	if len(points) > 2 {
		m.Altitude = points[2]
	}
	return nil
}

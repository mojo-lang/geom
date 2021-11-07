package geom

import (
	"errors"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

func NewFeature(geometry *Geometry) *Feature {
	feature := &Feature{}
	feature.Geometry = geometry
	feature.Properties = make(map[string]*core.Value)
	return feature
}

func NewPointFeatureFrom(coordinates ...float64) *Feature {
	return NewFeature(NewPointGeometryFrom(coordinates...))
}

func NewPointFeature(ll *LngLat) *Feature {
	return NewFeature(NewPointGeometry(ll))
}

func NewLineStringFeature(coordinates ...*LngLat) *Feature {
	return NewFeature(NewLineStringGeometry(coordinates...))
}

func NewPolygonFeatureFrom(coordinates ...*LngLat) *Feature {
	return NewFeature(NewPolygonGeometryFrom(coordinates...))
}

func (m *Feature) SetIntId(id uint64) {
	if m != nil {
		if m.Id == nil {
			m.Id = &core.Id{}
		}

		m.Id.SetInt(id)
	}
}

func (m *Feature) SetStringId(id string) {
	if m != nil {
		if m.Id == nil {
			m.Id = &core.Id{}
		}

		m.Id.SetString(id)
	}
}

func (m *Feature) SetProperty(key string, val *core.Value) *Feature {
	if m != nil && m.Properties != nil {
		m.Properties[key] = val
	}
	return m
}

func (m *Feature) SetBool(key string, val bool) *Feature {
	return m.SetProperty(key, core.NewBoolValue(val))
}

func (m *Feature) SetInt64(key string, val int64) *Feature {
	return m.SetProperty(key, core.NewInt64Value(val))
}

func (m *Feature) SetString(key string, val string) *Feature {
	return m.SetProperty(key, core.NewStringValue(val))
}

func (m *Feature) SetDouble(key string, val float64) *Feature {
	return m.SetProperty(key, core.NewFloat64Value(val))
}

func (m *Feature) GetPoint() *Point {
	if m != nil && m.Geometry != nil {
		return m.Geometry.GetPoint()
	}
	return nil
}

func (m *Feature) GetLineString() *LineString {
	if m != nil && m.Geometry != nil {
		return m.Geometry.GetLineString()
	}
	return nil
}

func (m *Feature) GetPolygon() *Polygon {
	if m != nil && m.Geometry != nil {
		return m.Geometry.GetPolygon()
	}
	return nil
}

func (m *Feature) GetProperty(key string) (*core.Value, error) {
	if m != nil && m.Properties != nil {
		v, ok := m.Properties[key]
		if ok {
			return v, nil
		} else {
			return nil, errors.New("NotFound")
		}
	}

	return nil, errors.New("feature is nil")
}

func (m *Feature) GetIntProperty(key string) (int64, error) {
	val, err := m.GetProperty(key)
	if err != nil {
		return 0, err
	}
	return val.GetInt64(), nil
}

func (m *Feature) GetStringProperty(key string) (string, error) {
	val, err := m.GetProperty(key)
	if err != nil {
		return "", err
	}
	return val.GetString(), nil
}

func (m *Feature) GetBoolProperty(key string) (bool, error) {
	val, err := m.GetProperty(key)
	if err != nil {
		return false, err
	}
	return val.GetBool(), nil
}

func (m *Feature) GetFloat64Property(key string) (float64, error) {
	val, err := m.GetProperty(key)
	if err != nil {
		return 0, err
	}
	return val.GetFloat64(), nil
}

func (m *Feature) GetDoubleProperty(key string) (float64, error) {
	return m.GetFloat64Property(key)
}


package shapefile

import (
	"github.com/jonas-p/go-shp"
	"github.com/mojo-lang/geom/go/pkg/mojo/geom"
	"strconv"
)

type Shapefile struct {
}

func ReadAll(filename string) (*geom.FeatureCollection, error) {
	shape, err := shp.Open(filename)
	if err != nil {
		return nil, err
	}
	defer func() { _ = shape.Close() }()

	// fields from the attribute table (DBF)
	fields := shape.Fields()
	features := &geom.FeatureCollection{}
	// loop through all features in the shapefile
	for shape.Next() {
		feat := geom.NewFeature(nil)

		n, p := shape.Shape()

		feat.Geometry, feat.Bbox, err = NewGeometry(p)
		if err != nil {
			return nil, err
		}

		for k, f := range fields {
			v := shape.ReadAttribute(n, k)
			switch f.Fieldtype {
			case 'N':
				number, err := strconv.ParseInt(v, 10, 64)
				if err != nil {
				} else {
					feat.SetInt64(f.String(), number)
				}
			case 'F':
				number, err := strconv.ParseFloat(v, 10)
				if err != nil {
				} else {
					feat.SetDouble(f.String(), number)
				}
			case 'C':
				feat.SetString(f.String(), v)
			case 'D':
				feat.SetString(f.String(), v)
			}
		}

		features.Features = append(features.Features, feat)
	}
	return features, nil
}

func WriteAll(feats []*geom.Feature, filename string) error {
	return nil
}

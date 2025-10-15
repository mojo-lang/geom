package shapefile

import (
	"errors"
	"fmt"
	"github.com/jonas-p/go-shp"
	"github.com/mojo-lang/geom/go/pkg/mojo/geom"
)

func NewGeometry(shape shp.Shape) (*geom.Geometry, *geom.BoundingBox, error) {
	if shape == nil {
		return nil, nil, nil
	}

	box := shape.BBox()
	bbox := geom.NewBoundingBox(geom.NewLngLat(box.MinX, box.MinY), geom.NewLngLat(box.MaxX, box.MaxY))

	switch s := shape.(type) {
	case *shp.Null:
		return nil, bbox, nil
	case *shp.Point:
		return geom.NewPointGeometryFrom(s.X, s.Y), bbox, nil
	case *shp.PolyLine:
		ml := newLineStrings(s.Parts, s.Points)
		if len(ml) == 1 {
			return geom.NewGeometry(ml[0]), bbox, nil
		} else if s.NumParts > 1 {
			return geom.NewMultiLineStringGeometry(ml...), bbox, nil
		}
	case *shp.Polygon:
		ml := newLineStrings(s.Parts, s.Points)
		return geom.NewPolygonGeometry(ml...), bbox, nil
	case *shp.MultiPoint:
		mp := &geom.MultiPoint{}
		for _, p := range s.Points {
			mp.Points = append(mp.Points, geom.NewPoint(geom.NewLngLat(p.X, p.Y)))
		}
		return geom.NewGeometry(mp), bbox, nil
	default:
		return nil, nil, errors.New(fmt.Sprintf("unsupported type for the Shape %T", s))
	}
	return nil, nil, nil
}

func GeometryToShape(geometry *geom.Geometry, bbox *geom.BoundingBox) (shp.Shape, error) {
	if geometry == nil {
		return nil, nil
	}

	if bbox == nil {
		bbox = geometry.BoundingBox()
	}

	switch g := geometry.Geometry.(type) {
	case *geom.Geometry_Point:
	case *geom.Geometry_MultiPoint:
	case *geom.Geometry_LineString:
	case *geom.Geometry_Polygon:
	default:
		return nil, errors.New(fmt.Sprintf("unsupported type for the Shape %T", g))
	}
	return nil, nil
}

func newLineStrings(parts []int32, points []shp.Point) []*geom.LineString {
	index := 0
	var ml []*geom.LineString
	line := &geom.LineString{}
	for i := 0; i < len(points); i++ {
		if index < len(parts)-1 && i == int(parts[index+1]) {
			ml = append(ml, line)
			line = &geom.LineString{}
			index++
		}
		line.Coordinates = append(line.Coordinates, &geom.LngLat{
			Longitude: points[i].X,
			Latitude:  points[i].Y,
		})
	}
	ml = append(ml, line)
	return ml
}

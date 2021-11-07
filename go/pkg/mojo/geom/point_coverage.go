package geom

import (
	"github.com/golang/geo/s2"
	"github.com/mmcloughlin/geohash"
)

func (m *Point) CellCovering(minLevel, maxLevel, maxCells int) s2.CellUnion {
	cell := s2.CellFromLatLng(s2.LatLngFromDegrees(m.Coordinate.Latitude, m.Coordinate.Longitude))
	cellID := cell.ID()
	if cellID.Level() > maxLevel {
		cellID = cellID.Parent(maxLevel)
	}

	cellUnion := s2.CellUnion{}
	cellUnion = append(cellUnion, cellID)
	return cellUnion
}

func (m *Point) GeoHashCovering(minLevel, maxLevel, maxHashes int) []string {
	hash := geohash.EncodeWithPrecision(m.Coordinate.Latitude, m.Coordinate.Longitude, uint(maxLevel))
	return []string{hash}
}

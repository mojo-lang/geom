package geom

import "github.com/golang/geo/s2"

func (m Circle) CellCovering(minLevel, maxLevel, maxCells int) s2.CellUnion {
	return m.ToPolygon(64).CellCovering(minLevel, maxLevel, maxCells)
}

func (m Circle) GeoHashCovering(minLevel, maxLevel, maxHashes int) []string {
	return m.ToPolygon(64).GeoHashCovering(minLevel, maxLevel, maxHashes)
}

func (m Circle) GeoHashFractionCovering(minLevel, maxLevel, maxHashes int, fraction float32) []string {
	return m.ToPolygon(64).GeoHashFractionCovering(minLevel, maxLevel, maxHashes, fraction)
}

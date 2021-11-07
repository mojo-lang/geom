package geom

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestBox_Extend(t *testing.T) {
	box1 := BoundingBox{LeftBottom:&LngLat{Longitude:121.1234, Latitude:31.11},
		RightTop:&LngLat{Longitude:122.1234, Latitude:32.11}}

	box2 := BoundingBox{LeftBottom:&LngLat{Longitude:121.1238, Latitude:31.22},
		RightTop:&LngLat{Longitude:123.1234, Latitude:33.11}}

	extend := box1.Extend(&box2)
	assert.Equal(t, 121.1234, extend.LeftBottom.Longitude)
	assert.Equal(t, 123.1234, extend.RightTop.Longitude)
}

func TestBox_GeoHashCovering(t *testing.T) {
	box := BoundingBox{LeftBottom:&LngLat{Longitude:121.47789, Latitude:31.223224},
		RightTop:&LngLat{Longitude:121.491537, Latitude:31.233279}}

	hashes := box.GeoHashCovering(5, 5, 100)
	print(hashes)
}




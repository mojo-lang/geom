package geom

import (
    jsoniter "github.com/json-iterator/go"
    "github.com/stretchr/testify/assert"
    "testing"
)

func TestPolygonCodec_Encode(t *testing.T) {
    p := &Polygon{}

    err := jsoniter.UnmarshalFromString(polygonStr, p)
    assert.Nil(t, err)

    assert.Equal(t, len(p.LineStrings), 2)
    assert.Equal(t, len(p.LineStrings[0].Coordinates), 3)

    str, _ := jsoniter.MarshalToString(p)
    assert.Equal(t, polygonStr, str)
}

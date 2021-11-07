package geom

import (
	jsoniter "github.com/json-iterator/go"
	"github.com/stretchr/testify/assert"
	"testing"
)

const (
	emptyLineString = `{"type":"LineString","coordinates":[]}`
)

func TestLineStringCodec_Encode(t *testing.T) {
	l := &LineString{}

	str, _ := jsoniter.MarshalToString(l)
	assert.Equal(t, emptyLineString, str)
}

// Code generated by mojo. DO NOT EDIT.
// Rerunning mojo will overwrite this file.
//
// Copyright 2021 Mojo-lang.org
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package geom

import (
	jsoniter "github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("geom.SpatialReference", &SpatialReferenceCodec{})
	jsoniter.RegisterTypeEncoder("geom.SpatialReference", &SpatialReferenceCodec{})
}

type SpatialReferenceCodec struct {
}

func (codec *SpatialReferenceCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	e := (*SpatialReference)(ptr)
	if any.ValueType() == jsoniter.StringValue {
		e.Parse(any.ToString())
	} else if any.ValueType() == jsoniter.NumberValue {
		value := any.ToInt32()
		if _, ok := SpatialReferenceNames[value]; ok {
			*e = SpatialReference(value)
		}
	}
}

func (codec *SpatialReferenceCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	e := (*SpatialReference)(ptr)
	stream.WriteString(e.Format())
}

func (codec *SpatialReferenceCodec) IsEmpty(ptr unsafe.Pointer) bool {
	e := (*SpatialReference)(ptr)
	return e == nil || *e == 0
}

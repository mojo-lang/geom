package geom

func NewBoundingBox(leftBottom *LngLat, rightTop *LngLat) *BoundingBox {
	if leftBottom == nil || rightTop == nil {
		return nil
	}
	return (&BoundingBox{LeftBottom: leftBottom, RightTop: leftBottom}).Extend(&BoundingBox{
		LeftBottom: rightTop,
		RightTop:   rightTop,
	})
}

func (x *BoundingBox) Vertexes() []*LngLat {
	return []*LngLat{
		x.LeftBottom,
		{Longitude: x.RightTop.Longitude, Latitude: x.LeftBottom.Latitude},
		x.RightTop,
		{Longitude: x.LeftBottom.Longitude, Latitude: x.RightTop.Latitude},
	}
}

func (x *BoundingBox) Vertex(index int) *LngLat {
	switch index {
	case 0:
		return x.LeftBottom
	case 1:
		return &LngLat{Longitude: x.RightTop.Longitude, Latitude: x.LeftBottom.Latitude}
	case 2:
		return x.RightTop
	case 3:
		return &LngLat{Longitude: x.LeftBottom.Longitude, Latitude: x.RightTop.Latitude}
	default:
		return nil
	}
}

func (x *BoundingBox) Extend(box *BoundingBox) *BoundingBox {
	if box != nil {
		var minLat, minLng, maxLat, maxLng float64
		if x.LeftBottom.Latitude > box.LeftBottom.Latitude {
			minLat = box.LeftBottom.Latitude
		} else {
			minLat = x.LeftBottom.Latitude
		}

		if x.LeftBottom.Longitude > box.LeftBottom.Longitude {
			minLng = box.LeftBottom.Longitude
		} else {
			minLng = x.LeftBottom.Longitude
		}

		if x.RightTop.Latitude < box.RightTop.Latitude {
			maxLat = box.RightTop.Latitude
		} else {
			maxLat = x.RightTop.Latitude
		}

		if x.RightTop.Longitude < box.RightTop.Longitude {
			maxLng = box.RightTop.Longitude
		} else {
			maxLng = x.RightTop.Longitude
		}

		return &BoundingBox{LeftBottom: &LngLat{Longitude: minLng, Latitude: minLat},
			RightTop: &LngLat{Longitude: maxLng, Latitude: maxLat}}
	}
	return x
}

func (x *BoundingBox) ExtendDegree(lng float64, lat float64) *BoundingBox {
	minLng := x.LeftBottom.Longitude - lng
	minLat := x.LeftBottom.Latitude - lat

	maxLng := x.RightTop.Longitude + lng
	maxLat := x.RightTop.Latitude + lat

	return &BoundingBox{LeftBottom: &LngLat{Longitude: minLng, Latitude: minLat},
		RightTop: &LngLat{Longitude: maxLng, Latitude: maxLat}}
}

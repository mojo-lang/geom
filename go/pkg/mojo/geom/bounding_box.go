package geom

func NewBoundingBox(leftBottom *LngLat, rightTop *LngLat) *BoundingBox {
	if leftBottom == nil || rightTop == nil {
		return nil
	}
	return BoundingBox{LeftBottom: leftBottom, RightTop: leftBottom}.Extend(&BoundingBox{
		LeftBottom: rightTop,
		RightTop:   rightTop,
	})
}

func (m BoundingBox) Vertexes() []*LngLat {
	return []*LngLat{
		m.LeftBottom,
		{Longitude: m.RightTop.Longitude, Latitude: m.LeftBottom.Latitude},
		m.RightTop,
		{Longitude: m.LeftBottom.Longitude, Latitude: m.RightTop.Latitude},
	}
}

func (m BoundingBox) Vertex(index int) *LngLat {
	switch index {
	case 0:
		return m.LeftBottom
	case 1:
		return &LngLat{Longitude: m.RightTop.Longitude, Latitude: m.LeftBottom.Latitude}
	case 2:
		return m.RightTop
	case 3:
		return &LngLat{Longitude: m.LeftBottom.Longitude, Latitude: m.RightTop.Latitude}
	default:
		return nil
	}
}

func (m BoundingBox) Extend(box *BoundingBox) *BoundingBox {
	if box != nil {
		var minLat, minLng, maxLat, maxLng float64
		if m.LeftBottom.Latitude > box.LeftBottom.Latitude {
			minLat = box.LeftBottom.Latitude
		} else {
			minLat = m.LeftBottom.Latitude
		}

		if m.LeftBottom.Longitude > box.LeftBottom.Longitude {
			minLng = box.LeftBottom.Longitude
		} else {
			minLng = m.LeftBottom.Longitude
		}

		if m.RightTop.Latitude < box.RightTop.Latitude {
			maxLat = box.RightTop.Latitude
		} else {
			maxLat = m.RightTop.Latitude
		}

		if m.RightTop.Longitude < box.RightTop.Longitude {
			maxLng = box.RightTop.Longitude
		} else {
			maxLng = m.RightTop.Longitude
		}

		return &BoundingBox{LeftBottom: &LngLat{Longitude: minLng, Latitude: minLat},
			RightTop: &LngLat{Longitude: maxLng, Latitude: maxLat}}
	}
	return &m
}

func (m BoundingBox) ExtendDegree(lng float64, lat float64) *BoundingBox {
	minLng := m.LeftBottom.Longitude - lng
	minLat := m.LeftBottom.Latitude - lat

	maxLng := m.RightTop.Longitude + lng
	maxLat := m.RightTop.Latitude + lat

	return &BoundingBox{LeftBottom: &LngLat{Longitude: minLng, Latitude: minLat},
		RightTop: &LngLat{Longitude: maxLng, Latitude: maxLat}}
}

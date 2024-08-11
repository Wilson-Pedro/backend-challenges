package com.example.poi.domain;

import java.io.Serializable;

public class CoordinateRequest implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer x;
	
	private Integer y;
	
	private Integer maxDistance;
	
	public CoordinateRequest() {
	}

	public CoordinateRequest(Integer x, Integer y, Integer maxDistance) {
		this.x = x;
		this.y = y;
		this.maxDistance = maxDistance;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(Integer maxDistance) {
		this.maxDistance = maxDistance;
	}
}

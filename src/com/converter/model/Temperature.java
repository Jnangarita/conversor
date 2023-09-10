package com.converter.model;

public class Temperature {
	private Double value;
	private String temperatureType;

	public Temperature(Double value, String temperatureType) {
		if(value == null) {
			throw new IllegalArgumentException("El valor de la temperatura no puede ser vacio");
		}
		this.value = value;
		this.temperatureType = temperatureType;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getTemperatureType() {
		return temperatureType;
	}

	public void setTemperatureType(String temperatureType) {
		this.temperatureType = temperatureType;
	}
}
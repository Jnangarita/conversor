package com.converter.model;

public class Coin {
	private String typeCoin;
	private Integer value;

	public Coin(String typeCoin, Integer value) {
		this.typeCoin = typeCoin;
		this.value = value;
	}

	public String getTypeCoin() {
		return this.typeCoin;
	}

	public void setTypeCoin(String typeCoin) {
		this.typeCoin = typeCoin;
	}

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("{Tipo de moneda: %s, Valor de la moneda: %d}",
				this.typeCoin, this.value);
	}
}
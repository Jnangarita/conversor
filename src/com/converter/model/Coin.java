package com.converter.model;

public class Coin {
	private String typeCoin;
	private Double value;

	public Coin(String typeCoin, Double value) {
		if(value <= 0 || typeCoin.isEmpty()) {
			throw new IllegalArgumentException("El valor o el tipo de moneda "
											 + "no son validos");
		}
		this.typeCoin = typeCoin;
		this.value = value;
	}

	public String getTypeCoin() {
		return this.typeCoin;
	}

	public void setTypeCoin(String typeCoin) {
		this.typeCoin = typeCoin;
	}

	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("{Tipo de moneda: %s, Valor de la moneda: %d}",
				this.typeCoin, this.value);
	}
}
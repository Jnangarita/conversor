package com.converter.option;

import com.converter.model.Coin;

public class CoinOption {
	public double pesosToDollars(Coin coin, Double inputValue) {
		return inputValue / coin.getValue();
	}
}
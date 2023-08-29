package com.converter.option;

import com.converter.model.Coin;

public class CoinOption {
	public Double localCoinToForeignCoin(Coin coin, Double inputValue) {
		return inputValue / coin.getValue();
	}

	public Double foreignCoinToLocalCoin(Coin coin, Double inputValue) {
		return inputValue * coin.getValue();
	}
}
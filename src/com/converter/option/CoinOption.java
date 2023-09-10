package com.converter.option;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import com.converter.model.Coin;

public class CoinOption {
	private static final String PESOS = "Pesos";
	DecimalFormat formatNumber = new DecimalFormat("0.00");

	public void coinsToConvert() {
		String inputValue = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
		try {
			String msgCoin = "Elije la moneda a la que deseas convertir tu dinero";
			String coinsTitle = "Monedas";
			String[] optionCoins = { "De pesos a Dólar", "De pesos a Euro", "De pesos a Libras", "De pesos a Yen",
					"De pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos",
					"De Yen a Pesos", "De Won Coreano a Pesos" };

			String coinsOption = (String) JOptionPane.showInputDialog(null, msgCoin, coinsTitle,
					JOptionPane.PLAIN_MESSAGE, null, optionCoins, optionCoins[0]);

			if (coinsOption.equals(optionCoins[0])) {
				convertCurrency("Dolares", 4098.46, inputValue);
			} else if (coinsOption.equals(optionCoins[1])) {
				convertCurrency("Euros", 4424.49, inputValue);
			} else if (coinsOption.equals(optionCoins[2])) {
				convertCurrency("Libras", 5156.27, inputValue);
			} else if (coinsOption.equals(optionCoins[3])) {
				convertCurrency("Yenes", 27.99, inputValue);
			} else if (coinsOption.equals(optionCoins[4])) {
				convertCurrency("Wones coreano", 3.09, inputValue);
			} else if (coinsOption.equals(optionCoins[5])) {
				convertCurrency(PESOS, 4098.46, inputValue);
			} else if (coinsOption.equals(optionCoins[6])) {
				convertCurrency(PESOS, 4424.49, inputValue);
			} else if (coinsOption.equals(optionCoins[7])) {
				convertCurrency(PESOS, 5156.27, inputValue);
			} else if (coinsOption.equals(optionCoins[8])) {
				convertCurrency(PESOS, 27.99, inputValue);
			} else if (coinsOption.equals(optionCoins[9])) {
				convertCurrency(PESOS, 3.09, inputValue);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El valor no es válido", "Error", JOptionPane.ERROR_MESSAGE);
			throw new NumberFormatException("Ingrese un valor numérico");
		}
	}

	// métodos
	public Double localCoinToForeignCoin(Coin coin, Double inputValue) {
		return inputValue / coin.getValue();
	}

	public Double foreignCoinToLocalCoin(Coin coin, Double inputValue) {
		return inputValue * coin.getValue();
	}

	public void convertCurrency(String type, Double value, String inputValue) {
		Coin coin = new Coin(type, value);
		Double convertedValue;
		if(type.equals(PESOS)) {
			convertedValue = foreignCoinToLocalCoin(coin, Double.parseDouble(inputValue));
		}else {
			convertedValue = localCoinToForeignCoin(coin, Double.parseDouble(inputValue));
		}
		JOptionPane.showMessageDialog(null, "Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(),
				"Total", JOptionPane.INFORMATION_MESSAGE);
	}
}
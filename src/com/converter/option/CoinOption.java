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
				toForeignValue("Dolares", 4098.46, inputValue);
			} else if (coinsOption.equals(optionCoins[1])) {
				toForeignValue("Euros", 4424.49, inputValue);
			} else if (coinsOption.equals(optionCoins[2])) {
				toForeignValue("Libras", 5156.27, inputValue);
			} else if (coinsOption.equals(optionCoins[3])) {
				toForeignValue("Yenes", 27.99, inputValue);
			} else if (coinsOption.equals(optionCoins[4])) {
				toForeignValue("Wones coreano", 3.09, inputValue);
			} else if (coinsOption.equals(optionCoins[5])) {
				toLocalValue(PESOS, 4098.46, inputValue);
			} else if (coinsOption.equals(optionCoins[6])) {
				toLocalValue(PESOS, 4424.49, inputValue);
			} else if (coinsOption.equals(optionCoins[7])) {
				toLocalValue(PESOS, 5156.27, inputValue);
			} else if (coinsOption.equals(optionCoins[8])) {
				toLocalValue(PESOS, 27.99, inputValue);
			} else if (coinsOption.equals(optionCoins[9])) {
				toLocalValue(PESOS, 3.09, inputValue);
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

	public void toForeignValue(String coinType, Double value, String inputValue) {
		Coin coin = new Coin(coinType, value);
		Double convertedValue = localCoinToForeignCoin(coin, Double.parseDouble(inputValue));
		JOptionPane.showMessageDialog(null, "Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(),
				"Total", JOptionPane.INFORMATION_MESSAGE);
	}

	public void toLocalValue(String coinType, Double value, String inputValue) {
		Coin coin = new Coin(coinType, value);
		Double convertedValue = foreignCoinToLocalCoin(coin, Double.parseDouble(inputValue));
		JOptionPane.showMessageDialog(null, "Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(),
				"Total", JOptionPane.INFORMATION_MESSAGE);
	}
}
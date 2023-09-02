package com.converter.option;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import com.converter.model.Coin;

public class CoinOption {
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
			// TODO: borrar el mensaje de la consola
			System.out.println("Imprime " + optionCoins[0]);

			if (coinsOption == optionCoins[0]) {
				Coin coin = new Coin("Dolares", 4098.46); // precio del dolar 2023-08-27
				Double convertedValue = localCoinToForeignCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[1]) {
				Coin coin = new Coin("Euros", 4424.49); // precio del euro 2023-08-27
				Double convertedValue = localCoinToForeignCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[2]) {
				Coin coin = new Coin("Libras", 5156.27); // precio de la libra 2023-08-27
				Double convertedValue = localCoinToForeignCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[3]) {
				Coin coin = new Coin("Yenes", 27.99); // precio del yen 2023-08-27
				Double convertedValue = localCoinToForeignCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[4]) {
				Coin coin = new Coin("Wones coreano", 3.09); // precio del won coreano 2023-08-27
				Double convertedValue = localCoinToForeignCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[5]) {
				Coin coin = new Coin("Pesos", 4098.46);
				Double convertedValue = foreignCoinToLocalCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[6]) {
				Coin coin = new Coin("Pesos", 4424.49);
				Double convertedValue = foreignCoinToLocalCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[7]) {
				Coin coin = new Coin("Pesos", 5156.27);
				Double convertedValue = foreignCoinToLocalCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[8]) {
				Coin coin = new Coin("Pesos", 27.99);
				Double convertedValue = foreignCoinToLocalCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (coinsOption == optionCoins[9]) {
				Coin coin = new Coin("Pesos", 3.09);
				Double convertedValue = foreignCoinToLocalCoin(coin, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"Tienes $" + formatNumber.format(convertedValue) + " " + coin.getTypeCoin(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
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
}
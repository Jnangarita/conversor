package com.converter.view;

import javax.swing.JOptionPane;

// clases
import com.converter.option.CoinOption;

public class ConverterView {
	CoinOption coinOption = new CoinOption();

	public void converterOptions() {
		String msg = "Seleccione una opción de conversión";
		String title = "Menú";
		String[] optionMenu = { "Conversor de Moneda", "Conversor de Temperatura" };

		String conversionOption = (String) JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE,
				null, optionMenu, optionMenu[0]);

		if (conversionOption == optionMenu[0]) {
			coinOption.coinsToConvert();
		}else if(conversionOption == optionMenu[1]) {
			System.out.println("Selecciono: " + conversionOption);
		}
	}
}
package com.converter.view;

import javax.swing.JOptionPane;

import com.converter.option.CoinOption;
import com.converter.option.TemperatureOptions;

public class ConverterView {
	CoinOption coinOption = new CoinOption();
	TemperatureOptions temperatureOptions = new TemperatureOptions();

	public void converterOptions() {
		String msg = "Seleccione una opción de conversión";
		String title = "Menú";
		String[] optionMenu = { "Conversor de Moneda", "Conversor de Temperatura" };

		String conversionOption = (String) JOptionPane.showInputDialog(null, msg, title, JOptionPane.PLAIN_MESSAGE,
				null, optionMenu, optionMenu[0]);

		if (conversionOption.equals(optionMenu[0])) {
			coinOption.coinsToConvert();
		}else if(conversionOption.equals(optionMenu[1])) {
			temperatureOptions.temperatureToConvert();
		}
	}
}
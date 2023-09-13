package com.converter.option;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

import com.converter.model.Temperature;

public class TemperatureOptions {
	private static final String FAHRENHEIT = "Fahrenheit";
	private static final String KELVIN = "Kelvin";
	private static final String CELSIUS = "celsius";

	public void temperatureToConvert() {
		String inputValue = JOptionPane.showInputDialog("Ingresa la temperatura que deseas convertir:");
		try {
			String msgTemperature = "Elije la temperatura que deseas convertir";
			String temperatureTitle = "Temperatura";
			String[] optionTemperature = { "De grados celsius a Fahrenheit", "De grados celsius a Kelvin",
					"De Fahrenheit a grados celsius", "De Kelvin a grados celsius" };

			String temperatureOption = (String) JOptionPane.showInputDialog(null, msgTemperature, temperatureTitle,
					JOptionPane.PLAIN_MESSAGE, null, optionTemperature, optionTemperature[0]);

			if (temperatureOption.equals(optionTemperature[0])) {
				convertTemperature(Double.parseDouble(inputValue), FAHRENHEIT);
			} else if (temperatureOption.equals(optionTemperature[1])) {
				convertTemperature(Double.parseDouble(inputValue), KELVIN);
			} else if (temperatureOption.equals(optionTemperature[2])) {
				convertTemperature(Double.parseDouble(inputValue), CELSIUS);
			}else if(temperatureOption.equals(optionTemperature[3])) {
				convertTemperature(Double.parseDouble(inputValue), "Default");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El valor no es válido", "Error", JOptionPane.ERROR_MESSAGE);
			throw new NumberFormatException("Ingrese un valor numérico");
		}

	}

	// métodos
	public Double celsiusToFahrenheit(Temperature temperature) {
		return ((9f / 5) * temperature.getValue()) + 32;
	}

	public Double fahrenheitToCelsius(Temperature temperature) {
		return (temperature.getValue() - 32) * (5f / 9);
	}

	public Double celsiusToKelvin(Temperature temperature) {
		return temperature.getValue() + 273.15;
	}

	public Double kelvinToCelsius(Temperature temperature) {
		return temperature.getValue() - 273.15;
	}

	public void convertTemperature(Double temp, String type) {
		DecimalFormat formatNumber = new DecimalFormat("0.00");
		Temperature temperature = new Temperature(temp, type);
		Double convertedValue;
		if (FAHRENHEIT.equals(type)) {
			convertedValue = celsiusToFahrenheit(temperature);
		} else if (KELVIN.equals(type)) {
			convertedValue = celsiusToKelvin(temperature);
		} else if (CELSIUS.equals(type)) {
			convertedValue = fahrenheitToCelsius(temperature);
		}else {
			convertedValue = kelvinToCelsius(temperature);
		}
		JOptionPane.showMessageDialog(null,
				"La temperatura es: " + formatNumber.format(convertedValue) + " " + temperature.getTemperatureType(),
				"Total", JOptionPane.INFORMATION_MESSAGE);
	}
}
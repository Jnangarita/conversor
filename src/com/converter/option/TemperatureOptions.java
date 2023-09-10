package com.converter.option;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

import com.converter.model.Temperature;

public class TemperatureOptions {
	DecimalFormat formatNumber = new DecimalFormat("0.00");
	public void temperatureToConvert() {

		String inputValue = JOptionPane.showInputDialog("Ingresa la temperatura que deseas convertir:");
		try {
			String msgTemperature = "Elije la temperatura que deseas convertir";
			String temperatureTitle = "Temperatura";
			String[] optionTemperature = { "De grados a Fahrenheit", "De grados a Kelvin" };

			String temperatureOption = (String) JOptionPane.showInputDialog(null, msgTemperature, temperatureTitle,
					JOptionPane.PLAIN_MESSAGE, null, optionTemperature, optionTemperature[0]);
			System.out.println("Imprime " + optionTemperature[0]);

			if (temperatureOption.equals(optionTemperature[0])) {
				System.out.println("Selecciono de grados a Fahrenheit");
				Temperature temperature = new Temperature(4098.46, "Grados");
				Double convertedValue = celsiusToAnotherTemperature(temperature, Double.parseDouble(inputValue));
				JOptionPane.showMessageDialog(null,
						"La temperatura es: " + formatNumber.format(convertedValue) + " " + temperature.getTemperatureType(), "Total",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "El valor no es válido", "Error", JOptionPane.ERROR_MESSAGE);
			throw new NumberFormatException("Ingrese un valor numérico");
		}
	
	}

	// métodos
	public Double celsiusToAnotherTemperature(Temperature temperature, Double inputValue) {
		return 0.0;
	}
}
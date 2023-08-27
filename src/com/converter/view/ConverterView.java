package com.converter.view;

import javax.swing.JOptionPane;

// clases
import com.converter.model.Coin;
import com.converter.option.CoinOption;

public class ConverterView {
	public void converterOptions() {
        String msg = "Seleccione una opci�n de conversi�n";
        String title = "Men�";
        String[] optionMenu = { "Conversor de Moneda", "Conversor de Temperatura" };

        String conversionOption = (String) JOptionPane.showInputDialog(null, msg,
        		title, JOptionPane.PLAIN_MESSAGE, null, optionMenu, optionMenu[0]);
        System.out.println("Selecciono: " + conversionOption);

        if(conversionOption == "Conversor de Moneda") {
        	Coin coin = new Coin("Dolar", 4098);
        	String inputValue = JOptionPane.showInputDialog("Ingresa la cantidad"
        									+ "de dinero que deseas convertir:");
            String coinsTitle = "Men�";
            String[] optionCoins = { "De pesos a D�lar", "De pesos a Euro" };

            String coinsOption = (String) JOptionPane.showInputDialog(null, msg,
            		coinsTitle, JOptionPane.PLAIN_MESSAGE, null, optionCoins, optionMenu[0]);
            System.out.println("Selecciono: " + coinsOption);
            CoinOption coinOption = new CoinOption();
            Double convertedValue = coinOption.pesosToDollars(coin, Double.parseDouble(inputValue));
            JOptionPane.showMessageDialog(null, "Tienes $" + convertedValue + " Dolares", "Total", JOptionPane.INFORMATION_MESSAGE);
        }
	}
}
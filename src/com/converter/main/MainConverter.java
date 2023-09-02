package com.converter.main;

import javax.swing.JOptionPane;

import com.converter.view.ConverterView;

public class MainConverter {
	public static void main(String[] args) {
		boolean optionContinue = true;
		ConverterView mainView = new ConverterView();

		while (optionContinue){
			mainView.converterOptions();
			int option = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (option == JOptionPane.NO_OPTION || option == JOptionPane.CANCEL_OPTION) {
				optionContinue = false;
				JOptionPane.showMessageDialog(null,
						"Programa Terminado", "Finalizar",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
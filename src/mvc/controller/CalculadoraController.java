package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.CalculadoraMediaModel;
import mvc.view.CalculadoraView;

public class CalculadoraController {
	// Objetos das classes View Model
	private CalculadoraView view;
	private CalculadoraMediaModel model;

	// contrutor
	public CalculadoraController(CalculadoraView view, CalculadoraMediaModel model) {
		this.view = view;
		this.model = model;
		// Implementar um ouvinte para o botão de view
		this.view.CalculadoraListener(new CalculadoraListener());
	}

	// calsse ouinte (Listener), quendo o botão for clicado
	class CalculadoraListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// variáveis locais
			int numero1, numero2 = 0;
			// tentativa
			try {
				numero1 = view.getNumero1();
				numero2 = view.getNumero2();
				model.somar(numero1, numero2);
				view.setResultado(model.retornarResultado());
			} catch (NumberFormatException ex) {
				view.displayErroMessage("informe dois nú,eros inteiros.");
			}
		}

	}
}

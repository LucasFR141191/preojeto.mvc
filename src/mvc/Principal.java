package mvc;

import mvc.controller.CalculadoraController;
import mvc.model.CalculadoraMediaModel;
import mvc.view.CalculadoraView;

public class Principal {
	public  static void main(String[]args) {
		//objetos das classes MVC
		CalculadoraView view = new CalculadoraView();
	    CalculadoraMediaModel model = new CalculadoraMediaModel ();
		CalculadoraController controller = new CalculadoraController(view,model);
		
		//exibir o formulario
		view.setVisible(true);
	}

}

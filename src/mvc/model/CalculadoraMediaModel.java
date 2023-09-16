package mvc.model;

public class CalculadoraMediaModel {
	// Reponsáveç pro obter o valor do cálculo
	private int resultado;

	// realizar o cálculo de soma
	public void somar(int numero1, int numero2) {
		this.resultado = numero1 + numero2;
	}

    //exibir o cálculo
	public int retornarResultado() {
		return resultado;
	}
}

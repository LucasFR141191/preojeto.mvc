package mvc.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraView extends JFrame {
	private JTextField numero1 = new JTextField(10);
	private JLabel rotuloSomar = new JLabel("+");
	private JTextField numero2 = new JTextField(10);
	private JButton botaoCalcular = new JButton("Calcular");
	private JTextField Resultado = new JTextField(20);

//construtor
	public CalculadoraView() {
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		calcPanel.add(numero1);
		calcPanel.add(rotuloSomar);
		calcPanel.add(numero2);
		calcPanel.add(botaoCalcular);
		calcPanel.add(Resultado);
		this.add(calcPanel);
	}
	// Set e Get

	public int getNumero1() {
		return Integer.parseInt(numero1.getText());
	}

	public int getNumero2() {
		return Integer.parseInt(numero2.getText());
	}

	public int Resultado() {
		return Integer.parseInt(Resultado.getText());
	}

	public void setResultado(int solution) {
		Resultado.setText(Integer.toString(solution));
	}

	// ActionListenner , responsável pelo evento do botão
	public void CalculadoraListener(ActionListener eventoBotaoCacular) {
		botaoCalcular.addActionListener(eventoBotaoCacular);
	}

	public void displayErroMessage(String mesagemErro) {
		JOptionPane.showMessageDialog(this, mesagemErro);
	}
}

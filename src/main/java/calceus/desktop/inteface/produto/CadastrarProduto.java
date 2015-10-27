package calceus.desktop.inteface.produto;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CadastrarProduto extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public CadastrarProduto() {
		setLayout(null);
		
		JButton button = new JButton("Cancelar");
		button.setBounds(523, 228, 89, 23);
		add(button);
		
		JButton button_1 = new JButton("Limpar");
		button_1.setBounds(395, 228, 89, 23);
		add(button_1);
		
		JButton button_2 = new JButton("OK");
		button_2.setBounds(271, 228, 89, 23);
		add(button_2);
		
		JLabel label_2 = new JLabel("TAMANHO");
		label_2.setBounds(10, 166, 67, 14);
		add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 163, 86, 20);
		add(textField_1);
		
		JLabel label_3 = new JLabel("GENERO");
		label_3.setBounds(247, 169, 46, 14);
		add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(315, 163, 86, 20);
		add(textField_2);
		
		JLabel label_4 = new JLabel("COR");
		label_4.setBounds(468, 169, 46, 14);
		add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(526, 163, 86, 20);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(449, 110, 108, 20);
		add(textField_4);
		
		JLabel label_5 = new JLabel("QUANTIDADE");
		label_5.setBounds(355, 113, 74, 14);
		add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(120, 107, 86, 20);
		add(textField_5);
		
		JLabel label_6 = new JLabel("PRE\u00C7O");
		label_6.setBounds(10, 113, 46, 14);
		add(label_6);
		
		JLabel label_7 = new JLabel("NOME PRODUTO");
		label_7.setBounds(10, 60, 81, 14);
		add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(120, 57, 86, 20);
		add(textField_6);
		
		JLabel label_8 = new JLabel("CATEGORIA");
		label_8.setBounds(10, 14, 67, 14);
		add(label_8);
		
		JLabel label_9 = new JLabel("MARCA");
		label_9.setBounds(355, 14, 46, 14);
		add(label_9);
		
		JLabel label_10 = new JLabel("FORNECEDOR");
		label_10.setBounds(355, 60, 74, 14);
		add(label_10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(449, 57, 108, 20);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(449, 11, 108, 20);
		add(textField_8);

	}
}

package calceus.desktop.interfaces.fornecedor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ConsultarFornecedor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTable tabelaFornecedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarFornecedor dialog = new ConsultarFornecedor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarFornecedor() {
		setTitle("Consultar Fornecedor");
		setBounds(100, 100, 811, 468);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel jpTipoConsulta = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setMinimumSize(new Dimension(17, 17));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
						.addComponent(jpTipoConsulta, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpTipoConsulta, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
					.addGap(57))
		);
		
		tabelaFornecedor = new JTable();
		tabelaFornecedor.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C�digo", "Raz�o Social","CNPJ", "Telefone", "Site", "Obs"
			}
		));
		scrollPane.setViewportView(tabelaFornecedor);
		
		JRadioButton rbRazaoSocial = new JRadioButton("Raz\u00E3o Social");
		
		JRadioButton rbCnpj = new JRadioButton("CNPJ");
		
		JRadioButton rbTodos = new JRadioButton("Todos");
		ButtonGroup bgPesquisa = new ButtonGroup();
		bgPesquisa.add(rbRazaoSocial);
		bgPesquisa.add(rbCnpj);
		bgPesquisa.add(rbTodos);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_jpTipoConsulta = new GroupLayout(jpTipoConsulta);
		gl_jpTipoConsulta.setHorizontalGroup(
			gl_jpTipoConsulta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpTipoConsulta.createSequentialGroup()
					.addContainerGap()
					.addComponent(rbRazaoSocial)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rbCnpj)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(rbTodos)
					.addGap(102))
		);
		gl_jpTipoConsulta.setVerticalGroup(
			gl_jpTipoConsulta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpTipoConsulta.createSequentialGroup()
					.addGroup(gl_jpTipoConsulta.createParallelGroup(Alignment.BASELINE)
						.addComponent(rbRazaoSocial)
						.addComponent(rbCnpj)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbTodos)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpTipoConsulta.setLayout(gl_jpTipoConsulta);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

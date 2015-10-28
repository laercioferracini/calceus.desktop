package calceus.desktop.interfaces.fornecedor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CadastrarFornecedor extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5689582140697614565L;
	private JTextField tfRazaoSocial;
	private JTextField tfDDD;
	private JTextField tfTelefone;
	private JTextField tfSite;

	/**
	 * Create the panel.
	 */
	public CadastrarFornecedor() {
		
		JLabel lblRazoSocial = new JLabel("RAZÃO SOCIAL");
		
		tfRazaoSocial = new JTextField();
		tfRazaoSocial.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		
		JFormattedTextField tfCNPJ = new JFormattedTextField();
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		
		tfDDD = new JTextField();
		tfDDD.setColumns(3);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		
		JLabel lblSite = new JLabel("SITE");
		
		tfSite = new JTextField();
		tfSite.setColumns(10);
		
		JLabel lblObs = new JLabel("OBS");
		
		JTextArea taObs = new JTextArea();
		taObs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JButton btnOk = new JButton("OK");
		
		JButton btnLimpar = new JButton("LIMPAR");
		
		JButton btnCancelar = new JButton("CANCELAR");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCnpj)
								.addComponent(lblSite)
								.addComponent(lblObs)
								.addComponent(lblTelefone)
								.addComponent(lblRazoSocial))
							.addGap(23))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnOk)
							.addGap(36)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(btnLimpar)
							.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
							.addComponent(btnCancelar))
						.addComponent(tfSite, 181, 181, Short.MAX_VALUE)
						.addComponent(tfCNPJ, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
						.addComponent(tfRazaoSocial, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tfDDD, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tfTelefone, 130, 130, 130))
						.addComponent(taObs, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
					.addGap(265))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfRazaoSocial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRazoSocial))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCnpj)
						.addComponent(tfCNPJ, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfDDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSite)
						.addComponent(tfSite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblObs)
						.addComponent(taObs, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnOk)
						.addComponent(btnLimpar))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}

package calceus.desktop.inteface.fornecedor;

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
	private JTextField tfRazaoSocial;
	private JTextField tfDDD;
	private JTextField tfTelefone;
	private JTextField tfSite;

	/**
	 * Create the panel.
	 */
	public CadastrarFornecedor() {
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social");
		
		tfRazaoSocial = new JTextField();
		tfRazaoSocial.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		tfDDD = new JTextField();
		tfDDD.setColumns(3);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		
		JLabel lblSite = new JLabel("Site");
		
		tfSite = new JTextField();
		tfSite.setColumns(10);
		
		JLabel lblObs = new JLabel("Obs");
		
		JTextArea taObs = new JTextArea();
		taObs.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JButton btnOk = new JButton("OK");
		
		JButton btnLimpar = new JButton("Limpar");
		
		JButton btnCancelar = new JButton("Cancelar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(137)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRazoSocial, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCnpj)
								.addComponent(lblTelefone)
								.addComponent(lblSite)
								.addComponent(lblObs))
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnOk)
							.addGap(36)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(btnLimpar)
							.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
							.addComponent(btnCancelar))
						.addComponent(taObs, Alignment.LEADING)
						.addComponent(tfSite, Alignment.LEADING)
						.addComponent(formattedTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
						.addComponent(tfRazaoSocial, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(tfDDD, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tfTelefone)))
					.addContainerGap(169, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRazoSocial)
						.addComponent(tfRazaoSocial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCnpj)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(tfDDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
					.addContainerGap(36, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}

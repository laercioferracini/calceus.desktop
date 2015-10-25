package calceus.desktop.inteface.fornecedor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;

public class ConsultarFornecedor extends JDialog {

	private final JPanel contentPanel = new JPanel();

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
		setBounds(100, 100, 742, 463);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel jpTipoConsulta = new JPanel();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpTipoConsulta, GroupLayout.PREFERRED_SIZE, 714, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpTipoConsulta, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(343, Short.MAX_VALUE))
		);
		
		JRadioButton rbRazaoSocial = new JRadioButton("Raz\u00E3o Social");
		
		JRadioButton rbCnpj = new JRadioButton("CNPJ");
		
		JRadioButton rbTodos = new JRadioButton("Todos");
		GroupLayout gl_jpTipoConsulta = new GroupLayout(jpTipoConsulta);
		gl_jpTipoConsulta.setHorizontalGroup(
			gl_jpTipoConsulta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpTipoConsulta.createSequentialGroup()
					.addContainerGap()
					.addComponent(rbRazaoSocial)
					.addGap(18)
					.addComponent(rbCnpj)
					.addGap(18)
					.addComponent(rbTodos)
					.addContainerGap(427, Short.MAX_VALUE))
		);
		gl_jpTipoConsulta.setVerticalGroup(
			gl_jpTipoConsulta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpTipoConsulta.createSequentialGroup()
					.addGroup(gl_jpTipoConsulta.createParallelGroup(Alignment.BASELINE)
						.addComponent(rbRazaoSocial)
						.addComponent(rbCnpj)
						.addComponent(rbTodos))
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

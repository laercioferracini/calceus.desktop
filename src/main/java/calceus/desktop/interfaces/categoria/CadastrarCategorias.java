package calceus.desktop.interfaces.categoria;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import br.com.calceus.ctrl.ProdutoCTRL;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarCategorias extends JPanel {
	private JTextField tfCategoria;

	/**
	 * Create the panel.
	 */
	public CadastrarCategorias() {
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Marca");
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(panel);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdutoCTRL ctrl = new ProdutoCTRL();
				if(ctrl.salvarCategoria(tfCategoria.getText(),"Categoria")){
					JOptionPane.showMessageDialog(null, "Categoria Cadastrada com sucesso");
				}else{
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar categoria, favor verificar");
				}
				
			}
		});
		
		JButton btCancelar = new JButton("Cancelar");
		
		tfCategoria = new JTextField();
		tfCategoria.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 275, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCategoria)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btSalvar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btCancelar))
						.addComponent(tfCategoria, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 119, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategoria)
						.addComponent(tfCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btCancelar)
						.addComponent(btSalvar))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

	}

}

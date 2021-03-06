package calceus.desktop.interfaces.produto;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.com.calceus.ctrl.FornecedorCTRL;
import br.com.calceus.ctrl.ProdutoCTRL;
import javax.swing.DefaultComboBoxModel;

public class CadastrarProduto extends JPanel {
	private JTextField tfTamanho;
	private JTextField tfQuantidade;
	private JTextField tfPreco;
	private JTextField tfProduto;
	private JTextField tfCor;
	private JComboBox<String> cbMarca;
	private JComboBox cbCategoria;
	private JComboBox cbGenero;
	private JComboBox cbFornecedor;

	/**
	 * Create the panel.
	 */
	public CadastrarProduto() {
		
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnLimpar = new JButton("Limpar");
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JLabel label_2 = new JLabel("TAMANHO");
		
		tfTamanho = new JTextField();
		tfTamanho.setColumns(10);
		
		JLabel label_3 = new JLabel("GENERO");
		
		JLabel label_4 = new JLabel("COR");
		
		tfQuantidade = new JTextField();
		tfQuantidade.setColumns(10);
		
		JLabel label_5 = new JLabel("QUANTIDADE");
		
		tfPreco = new JTextField();
		tfPreco.setColumns(10);
		
		JLabel label_6 = new JLabel("PRE\u00C7O");
		
		JLabel lblProduto = new JLabel("PRODUTO");
		
		tfProduto = new JTextField();
		tfProduto.setColumns(10);
		
		JLabel label_8 = new JLabel("CATEGORIA");
		
		JLabel label_9 = new JLabel("MARCA");
		
		JLabel label_10 = new JLabel("FORNECEDOR");
		
		cbCategoria = new JComboBox();
		
		cbFornecedor = new JComboBox();
		
		tfCor = new JTextField();
		tfCor.setColumns(10);
		
		cbGenero = new JComboBox();
		cbGenero.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Feminino", "Masculino"}));
		
		cbMarca = new JComboBox();
		
		JButton btCadastrarCategoria = new JButton("+");
		btCadastrarCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int opcao = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar uma Nova Categoria?");
				if(opcao == 0){
					String categoria = JOptionPane.showInputDialog(null, "Digite o nome da Categoria:");
					ProdutoCTRL ctrl = new ProdutoCTRL();
					if(ctrl.salvarCategoria(categoria, "")){
						preecheDados();
						JOptionPane.showMessageDialog(null, "Categoria cadastrada");
					}else{
						JOptionPane.showMessageDialog(null, "Categoria j� existe verificar o conte�do digitado");
					}
				}
			}
		});
		
		JButton btCadastrarMarca = new JButton("+");
		btCadastrarMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar uma Nova Marca?");
				if(opcao == 0){
					String marca = JOptionPane.showInputDialog(null, "Digite o nome da Marca:");
					ProdutoCTRL ctrl = new ProdutoCTRL();
					try {
						if(ctrl.salvar(marca)){
							preecheDados();
							JOptionPane.showMessageDialog(null, "Marca cadastrada");
						}else{
							JOptionPane.showMessageDialog(null, "Marca j� existe verificar o conte�do digitado");
						}
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnOK, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(cbCategoria, 0, 234, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblProduto)
										.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(11)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
														.addComponent(tfProduto, Alignment.TRAILING)
														.addComponent(cbMarca, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
													.addGap(18)
													.addComponent(btCadastrarMarca, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
													.addGap(18)
													.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(cbFornecedor, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(tfQuantidade, 0, 0, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(tfTamanho, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfCor, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(btCadastrarCategoria))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(cbGenero, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
					.addGap(108))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8)
						.addComponent(cbCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btCadastrarCategoria))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_9)
						.addComponent(cbMarca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btCadastrarMarca)
						.addComponent(label_3)
						.addComponent(cbGenero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_10)
						.addComponent(cbFornecedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProduto)
						.addComponent(tfProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6)
						.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(tfQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(tfTamanho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4))
					.addPreferredGap(ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnOK)
						.addComponent(btnLimpar)
						.addComponent(btnCancelar))
					.addContainerGap())
		);
		setLayout(groupLayout);
		
		//TEM QUE CHAMAR O M�TODO SOMENTE AP�S O CONSTRUTOR TERMINAR DE CARREGAR O LAYOUT
		preecheDados();
	}

	private void preecheDados() {
		cbCategoria.removeAllItems();
		cbMarca.removeAllItems();
		ProdutoCTRL ctrl = new ProdutoCTRL();
		FornecedorCTRL fornecedorCTRL = new FornecedorCTRL();
		
		try {
			for (String marca : ctrl.listarMarcas()){
				cbMarca.addItem(marca);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String categoria : ctrl.listarCategorias()){
			cbCategoria.addItem(categoria);
		}
		for(String fornecedor : fornecedorCTRL.listar()){
			cbFornecedor.addItem(fornecedor);
		}
	}
}

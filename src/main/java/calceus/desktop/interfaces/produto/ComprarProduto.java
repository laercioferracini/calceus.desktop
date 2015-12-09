package calceus.desktop.interfaces.produto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.com.calceus.ctrl.ComprarProdutoCTRL;
import br.com.calceus.ctrl.FornecedorCTRL;
import br.com.calceus.modelo.ItemCompra;
import br.com.calceus.modelo.Produto;

public class ComprarProduto extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfNotaFiscal;
	private JTextField tfData;
	private JTable table;
	private DefaultTableModel modelo;
	private JComboBox<String> cbFornecedor;
	private JButton btnRemoverProduto;
	private JButton btnInserirProduto;

	/**
	 * Create the dialog.
	 */
	public ComprarProduto() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				preencheFornecedor();
			}

		});
		setResizable(false);

		setTitle("Comprar Produto");
		setModal(true);
		setBounds(100, 100, 975, 541);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.EAST);
		cbFornecedor = new JComboBox<String>();
		JLabel lblFornecedor = new JLabel("FORNECEDOR");
		tfNotaFiscal = new JTextField();
		tfNotaFiscal.setColumns(10);
		JLabel lblNotaFiscal = new JLabel("NOTA FISCAL");
		JLabel label_2 = new JLabel("Data da Nota Fiscal");
		tfData = new JTextField();
		tfData.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();

		btnInserirProduto = new JButton("INSERIR PRODUTO");
		btnInserirProduto.setEnabled(false);
		btnInserirProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionaLinha();
			}

		});

		btnRemoverProduto = new JButton("REMOVER PRODUTO");
		btnRemoverProduto.setEnabled(false);
		btnRemoverProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removerLinha(getLinha());
			}

		});

		JButton btnPesquisar = new JButton("PESQUISAR");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ComprarProdutoCTRL ctrl = new ComprarProdutoCTRL();
				if (!ctrl.consultarNotaFiscal(Integer.parseInt(tfNotaFiscal.getText()))) {
					cadastrarNota();
				} else {
					preencherTabela(ctrl.consultarProdutosNotaFiscal(Integer.parseInt(tfNotaFiscal.getText())));

				}
			}

		});

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblNotaFiscal, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblFornecedor, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
								.addGap(18)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPanel.createSequentialGroup()
												.addComponent(tfNotaFiscal, GroupLayout.PREFERRED_SIZE, 124,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(btnPesquisar).addGap(50)
												.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 93,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(tfData, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(cbFornecedor, GroupLayout.PREFERRED_SIZE, 206,
												GroupLayout.PREFERRED_SIZE)))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 936, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup().addComponent(btnInserirProduto).addGap(10)
								.addComponent(btnRemoverProduto)))
						.addContainerGap(13, Short.MAX_VALUE)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblFornecedor)
								.addComponent(cbFornecedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblNotaFiscal)
								.addComponent(tfNotaFiscal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPesquisar))
						.addGroup(gl_contentPanel.createSequentialGroup().addGap(3).addComponent(label_2))
						.addComponent(tfData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnRemoverProduto, GroupLayout.PREFERRED_SIZE, 33,
										GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInserirProduto, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		table = new JTable();
		table.setModel(getModelo());

		scrollPane.setViewportView(table);

		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btSalvar = new JButton("SALVAR");
				btSalvar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						List<ItemCompra> lista = new ArrayList<>();
						ItemCompra itemCompra = null;
						for (int i = 0; i < modelo.getRowCount(); i++) {

							itemCompra = new ItemCompra();
							itemCompra.setNumSequencial(Integer.valueOf(modelo.getValueAt(i, 0).toString()));
							System.out.println(modelo.getValueAt(i, 0).toString());
							itemCompra.getProduto().setNomeProduto(modelo.getValueAt(i, 1).toString());
							System.out.println(modelo.getValueAt(i, 1).toString());
							itemCompra.setQuantidade(Integer.valueOf(modelo.getValueAt(i, 2).toString()));
							System.out.println(modelo.getValueAt(i, 2).toString());
//							itemCompra.getProduto().setQuantidade(Integer.valueOf(modelo.getValueAt(i, 2).toString()));
							itemCompra.getProduto().setValor(Double.valueOf(modelo.getValueAt(i, 3).toString()));
							System.out.println(modelo.getValueAt(i, 3).toString());


							lista.add(itemCompra);
						}
						ComprarProdutoCTRL ctrl = new ComprarProdutoCTRL();
						if (ctrl.cadastrarNotaFiscal(Integer.valueOf(tfNotaFiscal.getText()), lista)) {
							JOptionPane.showMessageDialog(null, "Nota fiscal cadastrada");
						} else {
							JOptionPane.showMessageDialog(null,
									"Problemas ao cadastrar a nota verificar os valores inseridos");
						}
					}
				});
				btSalvar.setActionCommand("OK");
				buttonPane.add(btSalvar);
				getRootPane().setDefaultButton(btSalvar);
			}
			{
				JButton cancelButton = new JButton("CANCELAR");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	// Métodos
	private TableModel getModelo() {

		String[] colunas = new String[] { "Código", "Produto", "Quant", "Preço Unitário" };
		modelo = new DefaultTableModel(null, colunas);

		return modelo;
	}

	private void adicionaLinha() {

		modelo.addRow(new String[] { "", "", "", "" });
	}

	private void removerLinha(int linha) {
		if (linha < 0) {
			JOptionPane.showMessageDialog(null, "Não há nenhuma linha seleciona ou inexistente.");
			return;
		} else {
			modelo.removeRow(linha);
		}

	}

	private int getLinha() {

		return table.getSelectedRow();
	}

	// Aqui chama o fornecedor do banco
	private void preencheFornecedor() {
		FornecedorCTRL ctrl = new FornecedorCTRL();
		for (String forn : ctrl.listar()) {
			cbFornecedor.addItem(forn);
		}

	}

	private void preencherTabela(List<Produto> produtos) {

		for (Produto p : produtos) {
			System.out.println(p.getNomeProduto());
			modelo.addRow(new Object[] { p.getIdProduto(), p.getNomeProduto(), p.getQuantidade(), p.getValor() });
		}

	}

	private void cadastrarNota() {
		int cadastrarNota = JOptionPane.showConfirmDialog(null,
				"Nota Fiscal não encontrada\nDeseja cadastrar a nota fiscal?");
		if (cadastrarNota == 0) {
			liberarCadastro(true);
		} else {

		}
	}

	private void liberarCadastro(boolean b) {
		btnInserirProduto.setEnabled(b);
		btnRemoverProduto.setEnabled(b);
	}
}

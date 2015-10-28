package calceus.desktop.interfaces.produto;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.com.calceus.DAO.FornecedorDAO;
import br.com.calceus.ctrl.FornecedorCTRL;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ComprarProduto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private DefaultTableModel modelo;
	private JComboBox<String> cbFornecedor;
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
		JLabel label = new JLabel("Fornecedor");
		textField = new JTextField();
		textField.setColumns(10);
		JLabel label_1 = new JLabel("Nota Fiscal");
		JLabel label_2 = new JLabel("Data da Nota Fiscal");
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnInserirProduto = new JButton("Inserir Produto");
		btnInserirProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionaLinha();
			}

			
		});
		
		JButton btnRemoverProduto = new JButton("Remover Produto");
		btnRemoverProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				removerLinha(getLinha());
			}

			
		});
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(76)
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(cbFornecedor, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 936, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnInserirProduto)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnRemoverProduto)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbFornecedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_1)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnInserirProduto)
						.addComponent(btnRemoverProduto))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(getModelo());
		
		scrollPane.setViewportView(table);
		
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btSalvar = new JButton("Salvar");
				btSalvar.setActionCommand("OK");
				buttonPane.add(btSalvar);
				getRootPane().setDefaultButton(btSalvar);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	// Métodos
	private TableModel getModelo() {
		
		
		String[] colunas = new String[]{"Código", "Produto", "Quant", "Preço Unitário", "Total"};
		modelo = new DefaultTableModel(null, colunas);
		
		
		return modelo;
	}
	private void adicionaLinha() {
		
		modelo.addRow(new String[] {"", "", "", "", ""});
	}
	private void removerLinha(int linha){
		if(linha < 0){
			JOptionPane.showMessageDialog(null, "Não há nenhuma linha seleciona ou inexistente.");
			return;
		}else{
			modelo.removeRow(linha);
		}
		
	}
	private int getLinha() {
		
		return table.getSelectedRow();
	}
	//Aqui chama o fornecedor do banco
	private void preencheFornecedor() {
		FornecedorCTRL ctrl = new FornecedorCTRL();
		for (String forn : ctrl.listar()) {
			cbFornecedor.addItem(forn);
		}
		
		
	}
}

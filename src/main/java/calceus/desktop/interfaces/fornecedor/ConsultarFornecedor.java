package calceus.desktop.interfaces.fornecedor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.com.calceus.ctrl.FornecedorCTRL;
import br.com.calceus.modelo.Fornecedor;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultarFornecedor extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTable tabelaFornecedor;
	private DefaultTableModel modelo;

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

		JButton btnAlterar = new JButton("ALTERAR");

		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				excluirFornecedor(getLinha());
			}
			
		});
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 105,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 105,
												GroupLayout.PREFERRED_SIZE)
										.addGap(547))
						.addGroup(gl_contentPanel.createSequentialGroup()
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 775,
												Short.MAX_VALUE)
										.addComponent(jpTipoConsulta, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 775,
												Short.MAX_VALUE))
								.addGap(0)))));
		gl_contentPanel
				.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
								.addComponent(jpTipoConsulta, GroupLayout.PREFERRED_SIZE, 27,
										GroupLayout.PREFERRED_SIZE)
								.addGap(39).addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
								.addGap(18)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));

		tabelaFornecedor = new JTable();
		tabelaFornecedor.setModel(getTabelaModelo());
		scrollPane.setViewportView(tabelaFornecedor);

		JRadioButton rbRazaoSocial = new JRadioButton("Raz\u00E3o Social");

		JRadioButton rbCnpj = new JRadioButton("CNPJ");

		JRadioButton rbTodos = new JRadioButton("Todos");
		rbTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// se a tabela não está preenchida, faz a chamada da lista
				if (verificaTabela()) {
					FornecedorCTRL ctrl = new FornecedorCTRL();
					preencheTabela(ctrl.listarFornecedores());
				}
			}

		});
		ButtonGroup bgPesquisa = new ButtonGroup();
		bgPesquisa.add(rbRazaoSocial);
		bgPesquisa.add(rbCnpj);
		bgPesquisa.add(rbTodos);

		textField = new JTextField();
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_jpTipoConsulta = new GroupLayout(jpTipoConsulta);
		gl_jpTipoConsulta
				.setHorizontalGroup(
						gl_jpTipoConsulta.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jpTipoConsulta.createSequentialGroup().addContainerGap()
										.addComponent(rbRazaoSocial).addGap(18)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 170,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(rbCnpj).addGap(18)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
										.addGap(18).addComponent(rbTodos).addGap(102)));
		gl_jpTipoConsulta.setVerticalGroup(gl_jpTipoConsulta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpTipoConsulta.createSequentialGroup()
						.addGroup(gl_jpTipoConsulta.createParallelGroup(Alignment.BASELINE).addComponent(rbRazaoSocial)
								.addComponent(rbCnpj)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(rbTodos).addComponent(textField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jpTipoConsulta.setLayout(gl_jpTipoConsulta);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
					}
				});
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
	
	

	// MOdelo da tabela
	private TableModel getTabelaModelo() {
		Object[] colunas = new Object[] { "Código", "Razão Social", "CNPJ", "Telefone", "Site", "Obs" };
		modelo = new DefaultTableModel(null, colunas);
		return modelo;
	}
	public JTable getTabelaFornecedor() {
		return tabelaFornecedor;
	}

	public void setTabelaFornecedor(JTable tabelaFornecedor) {
		this.tabelaFornecedor = tabelaFornecedor;
	}
	
	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}
	private void preencheTabela(List<Fornecedor> listarFornecedores) {
		for (Fornecedor f : listarFornecedores) {
			modelo.addRow(new Object[] { f.getIdFornecedor(), f.getRazaoSocial(), f.getCnpj(), f.getTelefone(),
					f.getSite(), f.getObs() });
		}

	}

	private boolean verificaTabela() {
		if (modelo.getRowCount() <= 0)
			return true;
		else
			return false;
	}
	private int getLinha() {
		return tabelaFornecedor.getSelectedRow();
	}
	
	private void excluirFornecedor(int linha) {
		if(linha < 0){
			JOptionPane.showMessageDialog(null, "Não há nenhuma linha seleciona ou inexistente.");
		}else{
			int cod = (int) tabelaFornecedor.getValueAt(linha, 0);
			FornecedorCTRL ctrl = new FornecedorCTRL();
			if(ctrl.excluir(cod)){
				JOptionPane.showMessageDialog(null, "Excluido");
			}
		}
		//limpa tabela
		getModelo().setNumRows(0);
	}

	
}

package calceus.desktop.interfaces.produto;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.com.calceus.ctrl.ProdutoCTRL;
import br.com.calceus.modelo.Fornecedor;
import br.com.calceus.modelo.Produto;
import javax.swing.JCheckBox;

public class ConsultarProdutos extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private JTextField tfCodigo;
	private JTextField tfProduto;
	private JTable jtProdutos;
	private DefaultTableModel modelo;
	
	/**
	 * Create the panel.
	 */
	public ConsultarProdutos() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JPanel panelAlterarProduto = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelAlterarProduto, GroupLayout.PREFERRED_SIZE, 608, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelAlterarProduto, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastrarProduto cadastrarProduto = new CadastrarProduto();
				
				panelAlterarProduto.removeAll();
				panelAlterarProduto.add(cadastrarProduto);
				panelAlterarProduto.revalidate();
				panelAlterarProduto.repaint();
			}
		});
		
		JButton btnExcluir = new JButton("EXCLUIR");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(360, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAlterar, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		jtProdutos = new JTable();
		jtProdutos.setModel(getTabelaModelo());
		jtProdutos.getColumnModel().getColumn(0).setMaxWidth(2147483615);
		scrollPane.setViewportView(jtProdutos);
		
		panel_1.setLayout(gl_panel_1);
		
		JRadioButton rdbtnCdigo = new JRadioButton("C\u00F3digo");
		rdbtnCdigo.setIgnoreRepaint(true);
		rdbtnCdigo.setMnemonic('c');
		
		tfCodigo = new JTextField();
		tfCodigo.setColumns(10);
		
		JRadioButton rdbtnProduto = new JRadioButton("Produto");
		rdbtnProduto.setIgnoreRepaint(true);
		rdbtnProduto.setMnemonic('c');
		
		tfProduto = new JTextField();
		tfProduto.setColumns(10);
		
		JButton btnPesquisar = new JButton("PESQUISAR");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdutoCTRL ctrl = new ProdutoCTRL();
				if(rdbtnCdigo.isSelected()){					
					ctrl.listarProduto(Integer.valueOf(tfCodigo.getText()));
				}else if(rdbtnProduto.isSelected()){
					ctrl.listarProduto(tfProduto.getText());
				}else{
					preencheTabela(ctrl.listaProdutos());
				}
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(rdbtnCdigo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rdbtnProduto)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tfProduto, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPesquisar)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnCdigo)
						.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnProduto)
						.addComponent(tfProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
	public void preencheTabela(List<Produto> lista){
		for (Produto f : lista) {
			modelo.addRow(new Object[] { f.getIdProduto(), f.getNomeProduto(), f.getFornecedor().getRazaoSocial(), f.getMarca().getMarca(), f.getCategoria().getCategoria(),
					f.getQuantidade(), f.getValor(), "-"});
		}
	}
	private TableModel getTabelaModelo(){
		Object[] colunas = new Object[] {  "C\u00F3digo", "Produto", "Fornecedor", "Marca", "Categoria", "Quantidade", "Pre\u00E7o", "Selecionar"};
		modelo = new DefaultTableModel(null, colunas);
		return modelo;
	}
}

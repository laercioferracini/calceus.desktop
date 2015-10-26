package calceus.desktop.inteface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calceus.desktop.inteface.fornecedor.ConsultarFornecedor;
import calceus.desktop.inteface.produto.ComprarProduto;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Gerenciador extends JFrame {
	private JPanel contentPane;
	private JTextField txtNomeProduto;
	private JTextField txtMarca;
	private JTextField txtFornecedor;
	private JTextField txtPreco;
	private JTextField txtQuantidade;
	private JTextField txtTamanho;
	private JTextField txtGenero;
	private JTextField txtCor;
	private JTextField txtNotaFiscal;
	private JPanel painelCadastrarProduto = new JPanel();
	

	/**
	 * Create the frame.
	 */
	public Gerenciador() {
		
		setLocationRelativeTo(null); // Inicia a tela centralizada
		
		setTitle("Gerenciador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 709, 518);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		
		JMenu mnProduto = new JMenu("Produto");
		menuBar.add(mnProduto);
		
		JMenuItem mntmComprarProduto = new JMenuItem("Comprar Produto");
		mntmComprarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ComprarProduto cp = new ComprarProduto();
				cp.setVisible(true);
				
				
			}
		});
		mnProduto.add(mntmComprarProduto);
		
		JMenuItem mntmConsultarProduto = new JMenuItem("Consultar Produto");
		mnProduto.add(mntmConsultarProduto);
		
		JMenuItem mntmAlterarProduto = new JMenuItem("Alterar Produto");
		mnProduto.add(mntmAlterarProduto);
		
		JMenuItem mntmExcluirProduto = new JMenuItem("Excluir Produto");
		mnProduto.add(mntmExcluirProduto);
		
		JMenuItem mntmCadastrarProduto = new JMenuItem("Cadastrar Produto");
		mntmCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				painelCadastrarProduto.setVisible(true);
			}
		});
		mnProduto.add(mntmCadastrarProduto);
		
		JMenu mnFornecedor = new JMenu("Fornecedor");
		menuBar.add(mnFornecedor);
		
		JMenuItem mntmCadastrarFornecedor = new JMenuItem("Cadastrar Fornecedor");
		mnFornecedor.add(mntmCadastrarFornecedor);
		
		JMenuItem mntmConsultarFornecedor = new JMenuItem("Consultar Fornecedor");
		mntmConsultarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultarFornecedor cf = new  ConsultarFornecedor();
				cf.setVisible(true);
			}
		});
		mnFornecedor.add(mntmConsultarFornecedor);
		
		JMenuItem mntmAlterarForncedor = new JMenuItem("Alterar Forncedor");
		mnFornecedor.add(mntmAlterarForncedor);
		
		JMenuItem mntmExcluirFornecedor = new JMenuItem("Excluir Fornecedor");
		mnFornecedor.add(mntmExcluirFornecedor);
		
		
		painelCadastrarProduto.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(147, 112, 219), null, new Color(123, 104, 238), null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(painelCadastrarProduto, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(painelCadastrarProduto, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
					.addContainerGap())
		);
		painelCadastrarProduto.setLayout(null);
		painelCadastrarProduto.setVisible(false);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setBounds(10, 27, 67, 14);
		painelCadastrarProduto.add(lblCategoria);
		
		JLabel lblNomeProduto = new JLabel("NOME PRODUTO");
		lblNomeProduto.setBounds(10, 73, 81, 14);
		painelCadastrarProduto.add(lblNomeProduto);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setBounds(120, 70, 86, 20);
		painelCadastrarProduto.add(txtNomeProduto);
		txtNomeProduto.setColumns(10);
		
		JLabel lblMarca = new JLabel("MARCA");
		lblMarca.setBounds(355, 27, 46, 14);
		painelCadastrarProduto.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(449, 24, 108, 20);
		painelCadastrarProduto.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblFornecedor = new JLabel("FORNECEDOR");
		lblFornecedor.setBounds(355, 73, 74, 14);
		painelCadastrarProduto.add(lblFornecedor);
		
		txtFornecedor = new JTextField();
		txtFornecedor.setBounds(449, 70, 108, 20);
		painelCadastrarProduto.add(txtFornecedor);
		txtFornecedor.setColumns(10);
		
		JLabel lblPreco = new JLabel("PRE\u00C7O");
		lblPreco.setBounds(10, 126, 46, 14);
		painelCadastrarProduto.add(lblPreco);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(120, 120, 86, 20);
		painelCadastrarProduto.add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("QUANTIDADE");
		lblQuantidade.setBounds(355, 126, 74, 14);
		painelCadastrarProduto.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(449, 123, 108, 20);
		painelCadastrarProduto.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel lblTamanho = new JLabel("TAMANHO");
		lblTamanho.setBounds(10, 179, 67, 14);
		painelCadastrarProduto.add(lblTamanho);
		
		txtTamanho = new JTextField();
		txtTamanho.setBounds(120, 176, 86, 20);
		painelCadastrarProduto.add(txtTamanho);
		txtTamanho.setColumns(10);
		
		JLabel lblGenero = new JLabel("GENERO");
		lblGenero.setBounds(247, 182, 46, 14);
		painelCadastrarProduto.add(lblGenero);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(315, 176, 86, 20);
		painelCadastrarProduto.add(txtGenero);
		txtGenero.setColumns(10);
		
		JLabel lblCor = new JLabel("COR");
		lblCor.setBounds(468, 182, 46, 14);
		painelCadastrarProduto.add(lblCor);
		
		txtCor = new JTextField();
		txtCor.setBounds(526, 176, 86, 20);
		painelCadastrarProduto.add(txtCor);
		txtCor.setColumns(10);
		
		JLabel lblDadosDaCompra = new JLabel("DADOS DA COMPRA");
		lblDadosDaCompra.setBounds(10, 273, 108, 14);
		painelCadastrarProduto.add(lblDadosDaCompra);
		
		JLabel lblNotaFiscal = new JLabel("NOTA FISCAL");
		lblNotaFiscal.setBounds(10, 343, 67, 14);
		painelCadastrarProduto.add(lblNotaFiscal);
		
		txtNotaFiscal = new JTextField();
		txtNotaFiscal.setBounds(120, 340, 86, 20);
		painelCadastrarProduto.add(txtNotaFiscal);
		txtNotaFiscal.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(395, 371, 89, 23);
		painelCadastrarProduto.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(523, 371, 89, 23);
		painelCadastrarProduto.add(btnCancelar);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(271, 371, 89, 23);
		painelCadastrarProduto.add(btnOk);
		contentPane.setLayout(gl_contentPane);
		
	}
}

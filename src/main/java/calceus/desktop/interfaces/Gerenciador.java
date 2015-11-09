package calceus.desktop.interfaces;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import calceus.desktop.interfaces.categoria.CadastrarCategorias;
import calceus.desktop.interfaces.fornecedor.CadastrarFornecedor;
import calceus.desktop.interfaces.fornecedor.ConsultarFornecedor;
import calceus.desktop.interfaces.produto.CadastrarMarcas;
import calceus.desktop.interfaces.produto.CadastrarProduto;
import calceus.desktop.interfaces.produto.ComprarProduto;
import calceus.desktop.interfaces.produto.ConsultarProdutos;
import calceus.desktop.interfaces.promocoes.CadastrarPromocao;
import calceus.desktop.interfaces.promocoes.ConsultarPromocoes;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

public class Gerenciador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel painelPrincipal;

	/**
	 * Create the frame.
	 */
	public Gerenciador() {

		setLocationRelativeTo(null); // Inicia a tela centralizada

		setTitle("Gerenciador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 730, 460);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Dialog", Font.PLAIN, 15));
		menuBar.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));

		JMenu mnProduto = new JMenu("Produto");
		mnProduto.setFont(new Font("Dialog", Font.PLAIN, 15));
		menuBar.add(mnProduto);

		JMenuItem mntmComprarProduto = new JMenuItem("Comprar Produto");
		mntmComprarProduto.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmComprarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ComprarProduto cp = new ComprarProduto();
				cp.setVisible(true);

			}
		});
		mnProduto.add(mntmComprarProduto);

		JMenuItem mntmConsultarProduto = new JMenuItem("Consultar Produto");
		mntmConsultarProduto.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmConsultarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarProdutos consultarProdutos = new ConsultarProdutos();
				trocarConteudo(consultarProdutos);
			}
		});
		mnProduto.add(mntmConsultarProduto);

		JMenuItem mntmAlterarProduto = new JMenuItem("Alterar Produto");
		mntmAlterarProduto.setFont(new Font("Dialog", Font.PLAIN, 15));
		mnProduto.add(mntmAlterarProduto);

		JMenuItem mntmExcluirProduto = new JMenuItem("Excluir Produto");
		mntmExcluirProduto.setFont(new Font("Dialog", Font.PLAIN, 15));
		mnProduto.add(mntmExcluirProduto);

		JMenuItem mntmCadastrarProduto = new JMenuItem("Cadastrar Produto");
		mntmCadastrarProduto.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarProduto produto = new CadastrarProduto();
				trocarConteudo(produto);
			}

		});
		mnProduto.add(mntmCadastrarProduto);

		JMenu mnFornecedor = new JMenu("Fornecedor");
		mnFornecedor.setFont(new Font("Dialog", Font.PLAIN, 15));
		menuBar.add(mnFornecedor);

		JMenuItem mntmCadastrarFornecedor = new JMenuItem("Cadastrar Fornecedor");
		mntmCadastrarFornecedor.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmCadastrarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				CadastrarFornecedor fornecedor = new CadastrarFornecedor();
				trocarConteudo(fornecedor);

			}
		});
		mnFornecedor.add(mntmCadastrarFornecedor);

		JMenuItem mntmConsultarFornecedor = new JMenuItem("Consultar Fornecedor");
		mntmConsultarFornecedor.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmConsultarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultarFornecedor cf = new ConsultarFornecedor();
				cf.setVisible(true);
			}
		});
		mnFornecedor.add(mntmConsultarFornecedor);

		JMenuItem mntmAlterarFornecedor = new JMenuItem("Alterar Fornecedor");
		mntmAlterarFornecedor.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmAlterarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnFornecedor.add(mntmAlterarFornecedor);

		JMenuItem mntmExcluirFornecedor = new JMenuItem("Excluir Fornecedor");
		mntmExcluirFornecedor.setFont(new Font("Dialog", Font.PLAIN, 15));
		mnFornecedor.add(mntmExcluirFornecedor);

		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(139, 0, 0), new Color(64, 64, 64)));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(painelPrincipal, GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
				.addComponent(menuBar, GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(painelPrincipal, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
		);

		JMenu mnMarcas = new JMenu("Marcas");
		mnMarcas.setFont(new Font("Dialog", Font.PLAIN, 15));
		menuBar.add(mnMarcas);

		JMenuItem mntmCadastrarMarca = new JMenuItem("Cadastrar Marca");
		mntmCadastrarMarca.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmCadastrarMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarMarcas cadastrarMarcas = new CadastrarMarcas();
				trocarConteudo(cadastrarMarcas);
			}
		});
		mnMarcas.add(mntmCadastrarMarca);

		JMenu mnCategoria = new JMenu("Categoria");
		mnCategoria.setFont(new Font("Dialog", Font.PLAIN, 15));
		menuBar.add(mnCategoria);

		JMenuItem mntmCadastrarCategoria = new JMenuItem("Cadastrar Categoria");
		mntmCadastrarCategoria.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmCadastrarCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarCategorias cadastrarCategorias = new CadastrarCategorias();
				trocarConteudo(cadastrarCategorias);
			}
		});
		mnCategoria.add(mntmCadastrarCategoria);

		JMenu mnPromoo = new JMenu("Promo\u00E7\u00E3o");
		mnPromoo.setFont(new Font("Dialog", Font.PLAIN, 15));
		menuBar.add(mnPromoo);

		JMenuItem mntmConsultarPromoes = new JMenuItem("Consultar Promo\u00E7\u00F5es");
		mntmConsultarPromoes.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmConsultarPromoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultarPromocoes consultarPromocoes = new ConsultarPromocoes();
				trocarConteudo(consultarPromocoes);
			}
		});
		mnPromoo.add(mntmConsultarPromoes);

		JMenuItem mntmCadastrarPromoo = new JMenuItem("Cadastrar Promo\u00E7\u00E3o");
		mntmCadastrarPromoo.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmCadastrarPromoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarPromocao cadastrarPromocao = new CadastrarPromocao();
				trocarConteudo(cadastrarPromocao);
			}
		});
		mnPromoo.add(mntmCadastrarPromoo);
		painelPrincipal.setLayout(new CardLayout(0, 0));
		contentPane.setLayout(gl_contentPane);

	}

	/**
	 * Método para trocar o conteúdo do painel principal.
	 * 
	 * @param painel
	 */
	private void trocarConteudo(JPanel painel) {
		painelPrincipal.removeAll();
		painelPrincipal.add(painel);
		painelPrincipal.revalidate();
		painelPrincipal.repaint();

	}
}

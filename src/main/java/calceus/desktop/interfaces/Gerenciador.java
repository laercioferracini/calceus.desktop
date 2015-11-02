package calceus.desktop.interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.calceus.ctrl.ProdutoCTRL;
import calceus.desktop.interfaces.categoria.CadastrarCategorias;
import calceus.desktop.interfaces.fornecedor.CadastrarFornecedor;
import calceus.desktop.interfaces.fornecedor.ConsultarFornecedor;
import calceus.desktop.interfaces.produto.CadastrarProduto;
import calceus.desktop.interfaces.produto.ComprarProduto;

import java.awt.CardLayout;

public class Gerenciador extends JFrame {
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
				CadastrarProduto produto = new CadastrarProduto();
				trocarConteudo(produto);
			}

			
		});
		mnProduto.add(mntmCadastrarProduto);
		
		JMenu mnFornecedor = new JMenu("Fornecedor");
		menuBar.add(mnFornecedor);
		
		JMenuItem mntmCadastrarFornecedor = new JMenuItem("Cadastrar Fornecedor");
		mntmCadastrarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastrarFornecedor fornecedor = new CadastrarFornecedor();
				trocarConteudo(fornecedor);
				
			}
		});
		mnFornecedor.add(mntmCadastrarFornecedor);
		
		JMenuItem mntmConsultarFornecedor = new JMenuItem("Consultar Fornecedor");
		mntmConsultarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultarFornecedor cf = new  ConsultarFornecedor();
				cf.setVisible(true);
			}
		});
		mnFornecedor.add(mntmConsultarFornecedor);
		
		JMenuItem mntmAlterarFornecedor = new JMenuItem("Alterar Fornecedor");
		mntmAlterarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnFornecedor.add(mntmAlterarFornecedor);
		
		JMenuItem mntmExcluirFornecedor = new JMenuItem("Excluir Fornecedor");
		mnFornecedor.add(mntmExcluirFornecedor);
		
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(painelPrincipal, GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
					.addGap(17))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(painelPrincipal, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JMenu mnMarcas = new JMenu("Marcas");
		menuBar.add(mnMarcas);
		
		JMenuItem mntmCadastrarMarca = new JMenuItem("Cadastrar Marca");
		mntmCadastrarMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarMarcas cadastrarMarcas = new CadastrarMarcas();
				trocarConteudo(cadastrarMarcas);				
			}
		});
		mnMarcas.add(mntmCadastrarMarca);
		
		JMenu mnCategoria = new JMenu("Categoria");
		menuBar.add(mnCategoria);
		
		JMenuItem mntmCadastrarCategoria = new JMenuItem("Cadastrar Categoria");
		mntmCadastrarCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarCategorias cadastrarCategorias = new CadastrarCategorias();
				trocarConteudo(cadastrarCategorias);
			}
		});
		mnCategoria.add(mntmCadastrarCategoria);
		painelPrincipal.setLayout(new CardLayout(0, 0));
		contentPane.setLayout(gl_contentPane);
		
	}
	private void trocarConteudo(JPanel painel) {
		painelPrincipal.removeAll();
		painelPrincipal.add(painel);
		painelPrincipal.revalidate();
		painelPrincipal.repaint();
		
	}
}

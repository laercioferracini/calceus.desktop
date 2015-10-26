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

public class Gerenciador extends JFrame {
	private JPanel contentPane;
	

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
		
		JPanel painelConteudo = new JPanel();
		painelConteudo.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(147, 112, 219), null, new Color(123, 104, 238), null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(menuBar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(painelConteudo, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(painelConteudo, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
	}
}

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

public class Gerenciador extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public Gerenciador() {
		
		setLocationRelativeTo(null); // Inicia a tela centralizada
		setTitle("Gerenciador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu mnProduto = new JMenu("Produto");
		menuBar.add(mnProduto);
		
		JMenuItem mntmComprarProduto = new JMenuItem("Comprar Produto\r\n\r\n");
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(423, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}

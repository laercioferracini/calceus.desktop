package calceus.desktop.inteface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgramaPrincipal extends JFrame {

	private JFrame frame;
	private JTextField txtNomeProduto;
	private JTextField txtMarcaProduto;
	private JTextField txtFornecedor;
	private JTextField txtPreco;
	private JTextField txgGenero;
	private JTextField txtCor;
	private JTextField txtNotaFiscal;
	private JPanel panelCadastrarProduto = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramaPrincipal window = new ProgramaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProgramaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnProduto = new JMenu("Produto");
		menuBar.add(mnProduto);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar Produto");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCadastrarProduto.setVisible(true);
			}
		});
		mnProduto.add(mntmCadastrar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar Produto");
		mnProduto.add(mntmConsultar);
		
		JMenuItem mntmAlterarProduto = new JMenuItem("Alterar Produto");
		mnProduto.add(mntmAlterarProduto);
		
		JMenuItem mntmExcluirProduto = new JMenuItem("Excluir Produto");
		mnProduto.add(mntmExcluirProduto);
		
		JMenuItem mntmConsultarPromcao = new JMenuItem("Consultar Promo\u00E7\u00E3o");
		mnProduto.add(mntmConsultarPromcao);
		
		JMenu mnFornecedor = new JMenu("Fornecedor");
		menuBar.add(mnFornecedor);
		
		JMenuItem mntmCadastrarFornecedor = new JMenuItem("Cadastrar Fornecedor");
		mnFornecedor.add(mntmCadastrarFornecedor);
		
		JMenuItem mntmConsultarFornecedor = new JMenuItem("Consultar Fornecedor");
		mnFornecedor.add(mntmConsultarFornecedor);
		
		JMenuItem mntmAlterarFornecedor = new JMenuItem("Alterar Fornecedor");
		mnFornecedor.add(mntmAlterarFornecedor);
		
		JMenuItem mntmExcluirFornecedor = new JMenuItem("Excluir Fornecedor");
		mnFornecedor.add(mntmExcluirFornecedor);
		
		
		frame.getContentPane().add(panelCadastrarProduto, BorderLayout.CENTER);
		panelCadastrarProduto.setLayout(null);
		panelCadastrarProduto.setVisible(false);
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setBounds(10, 23, 59, 14);
		panelCadastrarProduto.add(lblCategoria);
		
		JLabel lblNomeProduto = new JLabel("NOME PRODUTO");
		lblNomeProduto.setBounds(10, 55, 90, 14);
		panelCadastrarProduto.add(lblNomeProduto);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setBounds(110, 52, 86, 20);
		panelCadastrarProduto.add(txtNomeProduto);
		txtNomeProduto.setColumns(10);
		
		JLabel lblMarca = new JLabel("MARCA");
		lblMarca.setBounds(215, 23, 46, 14);
		panelCadastrarProduto.add(lblMarca);
		
		txtMarcaProduto = new JTextField();
		txtMarcaProduto.setBounds(271, 20, 86, 20);
		panelCadastrarProduto.add(txtMarcaProduto);
		txtMarcaProduto.setColumns(10);
		
		JLabel lblFornecedor = new JLabel("FORNECEDOR");
		lblFornecedor.setBounds(213, 55, 69, 14);
		panelCadastrarProduto.add(lblFornecedor);
		
		txtFornecedor = new JTextField();
		txtFornecedor.setBounds(292, 52, 86, 20);
		panelCadastrarProduto.add(txtFornecedor);
		txtFornecedor.setColumns(10);
		
		JLabel lblPreo = new JLabel("PRE\u00C7O");
		lblPreo.setBounds(10, 101, 46, 14);
		panelCadastrarProduto.add(lblPreo);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(53, 98, 86, 20);
		panelCadastrarProduto.add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblGenero = new JLabel("GENERO");
		lblGenero.setBounds(159, 101, 46, 14);
		panelCadastrarProduto.add(lblGenero);
		
		txgGenero = new JTextField();
		txgGenero.setBounds(209, 98, 86, 20);
		panelCadastrarProduto.add(txgGenero);
		txgGenero.setColumns(10);
		
		JLabel lblCor = new JLabel("COR");
		lblCor.setBounds(305, 101, 46, 14);
		panelCadastrarProduto.add(lblCor);
		
		txtCor = new JTextField();
		txtCor.setBounds(346, 98, 86, 20);
		panelCadastrarProduto.add(txtCor);
		txtCor.setColumns(10);
		
		JLabel lblDadosDaCompra = new JLabel("DADOS DA COMPRA");
		lblDadosDaCompra.setBounds(10, 160, 107, 14);
		panelCadastrarProduto.add(lblDadosDaCompra);
		
		JLabel lblNotaFiscal = new JLabel("NOTA FISCAL");
		lblNotaFiscal.setBounds(10, 195, 69, 14);
		panelCadastrarProduto.add(lblNotaFiscal);
		
		txtNotaFiscal = new JTextField();
		txtNotaFiscal.setBounds(89, 192, 86, 20);
		panelCadastrarProduto.add(txtNotaFiscal);
		txtNotaFiscal.setColumns(10);
		
	}
}

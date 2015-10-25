package calceus.desktop.inteface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8939427576719014742L;

	private JPanel contentPane;
	private JTextField tfLogin;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		setAparencia();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setForeground(SystemColor.activeCaption);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLogin.setBounds(91, 71, 46, 14);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(91, 112, 46, 14);
		contentPane.add(lblSenha);

		tfLogin = new JTextField();
		tfLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfLogin.setBounds(147, 69, 102, 20);
		contentPane.add(tfLogin);
		tfLogin.setColumns(15);

		pfSenha = new JPasswordField();
		pfSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pfSenha.setBounds(147, 109, 102, 20);
		contentPane.add(pfSenha);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//TODO Implementar o Login fazendo uma pesquisa no Banco
				
				Gerenciador window = new Gerenciador();
				window.setVisible(true);
				window.setLocationRelativeTo(null);
				dispose();//fecha esta tela
			}
		});
		btnOk.setBounds(91, 157, 89, 23);
		contentPane.add(btnOk);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(190, 157, 89, 23);
		contentPane.add(btnCancelar);
	}

	/**
	 * Método para Mudar a Aparência das Janelas
	 */
	private static void setAparencia() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (InstantiationException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IllegalAccessException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

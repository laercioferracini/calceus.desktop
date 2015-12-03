package calceus.desktop.interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

import br.com.calceus.ctrl.LoginCTRL;

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
		setResizable(false);
		setForeground(SystemColor.activeCaption);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));

		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Dialog", Font.BOLD, 15));

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Dialog", Font.BOLD, 15));

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(
						gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup().addGap(70)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
														.addComponent(btnOk, GroupLayout.DEFAULT_SIZE, 122,
																Short.MAX_VALUE)
														.addGap(18).addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE,
																122, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup().addComponent(panel, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGap(1))).addGap(78)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(48)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE).addGap(35)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(btnOk)
								.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGap(46)));

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Dialog", Font.BOLD, 15));

		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Dialog", Font.BOLD, 15));

		tfLogin = new JTextField();
		tfLogin.setFont(new Font("Dialog", Font.BOLD, 15));
		tfLogin.setColumns(15);

		pfSenha = new JPasswordField();
		pfSenha.setFont(new Font("Dialog", Font.BOLD, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addGap(13).addComponent(
														lblLogin, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(lblSenha,
								GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(tfLogin, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE).addComponent(pfSenha))
				.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(tfLogin, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE).addGap(20)
								.addComponent(pfSenha, GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE).addGap(20)
								.addComponent(lblSenha, GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE).addGap(7)))
				.addGap(10)));
		panel.setLayout(gl_panel);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(panel_1,
				GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(panel_1,
				Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE));
		contentPane.setLayout(gl_contentPane);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginCTRL ctrl = new LoginCTRL();
				if (ctrl.autentica(tfLogin.getText(), String.valueOf(pfSenha.getPassword()))) {
					Gerenciador window = new Gerenciador();
					window.setVisible(true);
					window.setLocationRelativeTo(null);
					dispose();// fecha esta tela
				}
			}
		});
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

package calceus.desktop.interfaces.fornecedor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Testing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testing frame = new Testing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JSplitPane spt = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panel1, null);
	JToggleButton btn = new JToggleButton("Show/Hide panel2");

	public Testing() {
		setLocation(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel1.add(new JLabel("Panel 1"));
		panel2.add(new JTextField("Panel 2"));
		getContentPane().add(spt, BorderLayout.CENTER);
		getContentPane().add(btn, BorderLayout.SOUTH);
		pack();
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (btn.isSelected()) {
					spt.setBottomComponent(panel2);
					pack();
				} else
					spt.setBottomComponent(null);
				pack();
			}
		});
	}

}

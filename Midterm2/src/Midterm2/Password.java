package Midterm2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Password {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password window = new Password();
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
	public Password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 331, 119);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (passwordField.getPassword() == char[] "b","u","g","a","b","o","o"){
					JOptionPane.showMessageDialog(controllingFrame,
			                "Good Job! Right Password.");
			        } else {
			            JOptionPane.showMessageDialog(controllingFrame,
			                "Invalid password. Try again.",
			                "Error Message",
			                JOptionPane.ERROR_MESSAGE);
			        }
				}
						
			}
		});
		btnOk.setBounds(260, 11, 45, 23);
		panel.add(btnOk);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHelp.setBounds(252, 47, 53, 23);
		panel.add(btnHelp);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 29, 140, 20);
		panel.add(passwordField);
		
		JLabel lblEnterThePassword = new JLabel("Enter the password:");
		lblEnterThePassword.setBounds(10, 32, 114, 14);
		panel.add(lblEnterThePassword);
	}
}

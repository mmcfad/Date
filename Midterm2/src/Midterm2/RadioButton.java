package Midterm2;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JRadioButton;

public class RadioButton {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton window = new RadioButton();
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
	public RadioButton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setBounds(32, 20, 109, 23);
		panel.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setBounds(32, 46, 109, 23);
		panel.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setBounds(32, 72, 109, 23);
		panel.add(rdbtnLarge);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnSmall);
		group.add(rdbtnMedium);
		group.add(rdbtnLarge);
	}
}

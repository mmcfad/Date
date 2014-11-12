package Midterm2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DateComboBoxes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateComboBoxes window = new DateComboBoxes();
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
	public DateComboBoxes() {
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
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"January ", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(116, 18, 100, 20);
		panel.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(116, 43, 46, 20);
		panel.add(comboBox_1);
		if (comboBox.getSelectedIndex() == 3 || comboBox.getSelectedIndex() == 5 ||comboBox.getSelectedIndex() == 8 ||comboBox.getSelectedIndex() == 10)
		{
			comboBox_1.removeItem("31");		
		}
		if (comboBox.getSelectedIndex() == 1)
		{
			comboBox_1.removeItem("31");
			comboBox_1.removeItem("30");
			comboBox_1.removeItem("29");
		}
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
		comboBox_2.setBounds(116, 68, 61, 20);
		panel.add(comboBox_2);

		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(60, 21, 46, 14);
		panel.add(lblMonth);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(60, 46, 46, 14);
		panel.add(lblDay);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(60, 71, 46, 14);
		panel.add(lblYear);
	}
}

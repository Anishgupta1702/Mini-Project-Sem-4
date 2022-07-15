import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class UserInput extends JPanel {
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox;
	private JButton btnNewButton1;
	private JButton btnNewButton2;

	/**
	 * Create the panel.
	 */
	public UserInput() {
		
		setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Enter the values on x-axis:");
		lblNewLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel1.setBounds(80, 60, 218, 24);
		add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Enter the values on y-axis:");
		lblNewLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel2.setBounds(80, 95, 218, 24);
		add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Enter the label on y-axis:");
		lblNewLabel3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel3.setBounds(80, 165, 207, 24);
		add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Enter the label on x-axis:");
		lblNewLabel4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel4.setBounds(80, 130, 207, 24);
		add(lblNewLabel4);
		
		textField1 = new JTextField();
		textField1.setBounds(320, 64, 100, 20);
		add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(320, 99, 100, 20);
		add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(320, 134, 100, 20);
		add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(320, 169, 100, 20);
		add(textField4);
		textField4.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Choose the graph:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(80, 200, 207, 24);
		add(lblNewLabel_3);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setEditable(true);
		comboBox.setBounds(320, 202, 100, 22);
		add(comboBox);
		comboBox.addItem("line");
		comboBox.addItem("bar");
		comboBox.addItem("multiple line");
		comboBox.addItem("multiple bar");
		
		btnNewButton1 = new JButton("OK");
		btnNewButton1.setBounds(240, 260, 52, 23);
		add(btnNewButton1);
		
		btnNewButton2 = new JButton("Back");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton2) {
	                MainFrame.main_panel.invalidate();
	                MainFrame.main_panel.removeAll();
	                First frame1 = new First();
	                MainFrame.main_panel.add(frame1);
	                MainFrame.main_panel.revalidate();
	                MainFrame.main_panel.repaint();
	            }
			}
		});
		btnNewButton2.setBounds(10, 11, 70, 23);
		add(btnNewButton2);
		
	}
}

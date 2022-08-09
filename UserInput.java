import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class UserInput extends JPanel {
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JLabel label5;
	private JComboBox<String> comboBox;
	private JButton button1;
	private JButton btnNewButton2;
	
	protected String graph;

	/**
	 * Create the panel.
	 */
	public UserInput() {
		
		setLayout(null);
		setSize(530,400);
		
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
		
		label5 = new JLabel("Choose the graph:");
		label5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label5.setBounds(80, 200, 207, 24);
		add(label5);
		
		comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setEditable(true);
		comboBox.setBounds(320, 202, 100, 22);
		add(comboBox);
		comboBox.addItem("line");
		comboBox.addItem("bar");
		comboBox.addItem("pie");

		button1 = new JButton("OK");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String python = "C:\\Miniconda3\\python.exe";
			
				if(comboBox.getSelectedItem() == "line") 
					graph = "C:\\Miniproject\\userline.py";
				else if(comboBox.getSelectedItem() == "bar") 
					graph = "C:\\Miniproject\\userbar.py";
				else if(comboBox.getSelectedItem() == "pie")
					graph = "C:\\Miniproject\\pie.py";
				
				try {
					Process process = Runtime.getRuntime().exec(python+" "+graph+" "+textField1.getText()+" "+textField2.getText());
					int result = process.waitFor();
					
				} catch (IOException | InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		button1.setBounds(240, 260, 52, 23);
		add(button1);
		
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

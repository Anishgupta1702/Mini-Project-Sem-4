import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class UserInput extends JPanel {
	private JTextField textField0;
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
		
		setSize(600,400);
		
		JLabel lblNewLabel0 = new JLabel("Enter the title for the graph:");
		lblNewLabel0.setBounds(70, 75, 219, 24);
		lblNewLabel0.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel1 = new JLabel("Enter the values on x-axis:");
		lblNewLabel1.setBounds(70, 110, 219, 24);
		lblNewLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel2 = new JLabel("Enter the values on y-axis:");
		lblNewLabel2.setBounds(70, 145, 219, 24);
		lblNewLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel3 = new JLabel("Enter the label on y-axis:");
		lblNewLabel3.setBounds(70, 215, 198, 24);
		lblNewLabel3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JLabel lblNewLabel4 = new JLabel("Enter the label on x-axis:");
		lblNewLabel4.setBounds(70, 180, 198, 24);
		lblNewLabel4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		textField0 = new JTextField();
		textField0.setBounds(319, 79, 200, 20);
		textField0.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setBounds(319, 114, 200, 20);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(319, 149, 200, 20);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(319, 184, 200, 20);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(319, 219, 200, 20);
		textField4.setColumns(10);
		
		label5 = new JLabel("Choose the graph:");
		label5.setBounds(70, 250, 219, 24);
		label5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(319, 251, 200, 24);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setEditable(true);
		comboBox.addItem("line");
		comboBox.addItem("bar");
		comboBox.addItem("pie");

		button1 = new JButton("OK");
		button1.setBounds(270, 310, 52, 23);
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
				
				if(textField3.getText().isBlank())
					textField0.setText("-");
				if(textField3.getText().isBlank())
					textField3.setText("-");
				if(textField4.getText().isBlank())
					textField4.setText("-");
				
				UserInput ui = new UserInput();
				
				try {
					if(comboBox.getSelectedItem() == "line" || comboBox.getSelectedItem() == "bar") {
						if(textField1.getText().split(" ").length != textField2.getText().split(" ").length) {
							JOptionPane.showInternalMessageDialog(ui,"Enter equal number of values","Error",1);
							//JOptionPane.showMessageDialog(ui, "Enter equal number of values");
						}
						else if(textField1.getText().isBlank() || textField2.getText().isBlank())
							JOptionPane.showInternalMessageDialog(ui,"No values entered!");
						else {
							Process process = Runtime.getRuntime().exec(python+" "+graph+" "+textField0.getText()+" "+textField3.getText()+" "+textField4.getText()+" "+textField1.getText()+" "+textField2.getText());
							int result = process.waitFor();
						}
					}
					else if(comboBox.getSelectedItem() == "pie") {
						if(textField1.getText().split(" ").length != textField2.getText().split(" ").length) {
							JOptionPane.showInternalMessageDialog(ui,"Enter equal number of values","Error", 1);
							//JOptionPane.showMessageDialog(ui, "Enter equal number of values");
						}
						else if(textField1.getText().isBlank() || textField2.getText().isBlank())
							JOptionPane.showInternalMessageDialog(ui,"No values entered!");
						else {
							Process process = Runtime.getRuntime().exec(python+" "+graph+" "+textField0.getText()+" "+textField1.getText()+" "+textField2.getText());
							int result = process.waitFor();
						}
					}
					
				} catch (IOException | InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		btnNewButton2 = new JButton("Back");
		btnNewButton2.setBounds(10, 11, 70, 23);
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
		setLayout(null);
		add(btnNewButton2);
		add(lblNewLabel0);
		add(textField0);
		add(lblNewLabel1);
		add(textField1);
		add(lblNewLabel2);
		add(textField2);
		add(lblNewLabel4);
		add(textField3);
		add(lblNewLabel3);
		add(textField4);
		add(label5);
		add(comboBox);
		add(button1);
		
	}
}

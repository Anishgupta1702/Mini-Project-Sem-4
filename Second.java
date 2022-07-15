import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.python.util.PythonInterpreter;

//import test.First;
//import test.MainFrame;

public class Second extends JPanel {

	/**
	 * Create the panel.
	 */
	public Second() {
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose the field:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(65, 94, 135, 23);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the graph:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(65, 152, 142, 23);
		add(lblNewLabel_1);
		
		JButton button1 = new JButton("Back");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button1) {
	                		MainFrame.main_panel.invalidate();
	              			MainFrame.main_panel.removeAll();
	                		First frame1 = new First();
	                		MainFrame.main_panel.add(frame1);
	                		MainFrame.main_panel.revalidate();
	                		MainFrame.main_panel.repaint();
	            		}
			}
		});
		button1.setBounds(10, 11, 70, 23);
		add(button1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setEditable(true);
		comboBox.setBounds(224, 96, 171, 23);
		add(comboBox);
		comboBox.addItem("Population");
		comboBox.addItem("population growth rate");
		comboBox.addItem("birthrate");
		comboBox.addItem("deathrate");
		comboBox.addItem("life expectancy");
		comboBox.addItem("infant mortality rate");
		comboBox.addItem("fertility rate");
		comboBox.addItem("Literacy rate");
		comboBox.addItem("GDP");
		comboBox.addItem("GDP growthrate");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(224, 155, 171, 22);
		add(comboBox_1);
		comboBox_1.addItem("line");
		comboBox_1.addItem("bar");
		comboBox_1.addItem("multiple line");
		comboBox_1.addItem("multiple bar");
		
		JButton button2 = new JButton("OK");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button2){
				
				//String field = comboBox1.getItemAt(comboBox1.getSelectedIndex()).toString();
			    	//Process process;
			     
			    	try {
			    		PythonInterpreter.initialize(System.getProperties(), System.getProperties(), new String[0]);
		            		PythonInterpreter interp = new PythonInterpreter();
		            		interp.execfile("");
			    		//process = Runtime.getRuntime().exec("");
					//BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
				    	//BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
						//mProcess = process;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
		});
		button2.setBounds(198, 212, 52, 23);
		add(button2);
		
	}
}

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Second extends JPanel {

	Process process;
	protected String graph;
	/**
	 * Create the panel.
	 */
	public Second() {
		
		setSize(600,400);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose the field:");
		lblNewLabel.setBounds(116, 98, 135, 24);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the graph:");
		lblNewLabel_1.setBounds(116, 156, 142, 23);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(lblNewLabel_1);
		
		JButton button1 = new JButton("Back");
		button1.setBounds(10, 11, 70, 23);
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
		add(button1);
		
		JComboBox<String> comboBox1 = new JComboBox<String>();
		comboBox1.setBounds(283, 99, 200, 24);
		comboBox1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox1.setEditable(true);
		add(comboBox1);
		comboBox1.addItem("population");
		comboBox1.addItem("population growth rate");
		comboBox1.addItem("birthrate");
		comboBox1.addItem("deathrate");
		comboBox1.addItem("life expectancy");
		comboBox1.addItem("infant mortality rate");
		comboBox1.addItem("fertility rate");
		comboBox1.addItem("Literacy rate");
		comboBox1.addItem("GDP");
		comboBox1.addItem("GDP growthrate");
		
		JComboBox<String> comboBox2 = new JComboBox<String>();
		comboBox2.setBounds(283, 157, 200, 23);
		comboBox2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox2.setEditable(true);
		add(comboBox2);
		comboBox2.addItem("line");
		comboBox2.addItem("bar");
		
		JButton button2 = new JButton("OK");
		button2.setBounds(270, 225, 52, 23);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button2){
			     
			    /*	ProcessBuilder pb = new ProcessBuilder("C:\\Miniconda3\\python.exe","C:\\Miniproject\\dataline.py","C:\\Data\\population.xlsx");
		            Process p = pb.start();
		            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		            //System.out.println(p.getOutputStream());
			    	*/
					
					try {
						
						//Files.deleteIfExists(Paths.get("C:\\plot\\myplot.png"));
						String python = "C:\\Miniconda3\\python.exe";
						
						if(comboBox2.getSelectedItem() == "line") 
							graph = "C:\\Miniproject\\dataline.py";
						else if(comboBox2.getSelectedItem() == "bar") 
							graph = "C:\\Miniproject\\databar.py";
						
						
							if(comboBox1.getSelectedItem() == "population") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\population.xlsx"});
								//BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
								//BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
							}
							else if(comboBox1.getSelectedItem() == "population growth rate") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\populationgrowthrate.xlsx"});
							}
							else if(comboBox1.getSelectedItem() == "birthrate") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\birthrate.xlsx"});
							}
							else if(comboBox1.getSelectedItem() == "deathrate") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\deathrate.xlsx"});
							}
							else if(comboBox1.getSelectedItem() == "life expectancy") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\lifeexpectancy.xlsx"});
							}
							else if(comboBox1.getSelectedItem() == "infant mortality rate") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\infantmortalityrate.xlsx"});
							}
							else if(comboBox1.getSelectedItem() == "fertility rate") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\fertilityrate.xlsx"});
							}
							else if(comboBox1.getSelectedItem() == "Literacy rate") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\literacyrate.xlsx"});
							}
							else if(comboBox1.getSelectedItem() == "GDP") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\gdp.xlsx"});
							}
							else if(comboBox1.getSelectedItem() == "GDP growthrate") {
								process = Runtime.getRuntime().exec(new String[]{python,graph,"C:\\Data\\gdpgrowthrate.xlsx"});
							}
							process.waitFor();
						
						/*MainFrame.main_panel.removeAll();
						MainFrame.main_panel.invalidate();
						//TimeUnit.SECONDS.sleep(5);
						
						int iCount = MainFrame.main_panel.getComponentCount();
		                DisplayGraph frameDisplay = new DisplayGraph();
		                
		                MainFrame.main_panel.add(frameDisplay);
		                MainFrame.main_panel.revalidate();
		                MainFrame.main_panel.repaint(); */

					} catch (Exception e1) {
			            e1.printStackTrace();
			        } 
				} 	  
			}
		});
		add(button2);
		
	}
}

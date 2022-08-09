import java.awt.Choice;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class First extends JPanel {

	/**
	 * Create the panel.
	 */
	public First() {
		
		setSize(530, 400);
		
		setLayout(null);
				
		Choice c = new Choice();
		c.setBounds(262, 158, 160, 20);
		add(c);
		c.add("User input");
		c.add("Default data");
		c.getSelectedItem();
				
		JLabel lblNewLabel = new JLabel("Select your option:\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(100, 158, 150, 20);
		add(lblNewLabel);
			
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c.getSelectedItem()=="Default data" && e.getSource() == button) {
					MainFrame.main_panel.invalidate();
					MainFrame.main_panel.removeAll();
					Second frame2 = new Second();
					MainFrame.main_panel.add(frame2);
					MainFrame.main_panel.revalidate();
					MainFrame.main_panel.repaint();
				}
				else if(c.getSelectedItem()=="User input" && e.getSource() == button){
					MainFrame.main_panel.invalidate();
					MainFrame.main_panel.removeAll();
					UserInput frameUser = new UserInput();
					MainFrame.main_panel.add(frameUser);
					MainFrame.main_panel.revalidate();
					MainFrame.main_panel.repaint();
				}
			}
		});
		button.setBounds(240, 220, 52, 23);
		add(button);
	}

}

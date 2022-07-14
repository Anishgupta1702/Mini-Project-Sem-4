import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

//import test.MainFrame;
//import test.Second;

public class First extends JPanel {

	/**
	 * Create the panel.
	 */
	public First() {
		
		setLayout(null);
				
		Choice c = new Choice();
		c.setBounds(262, 158, 178, 20);
		add(c);
		c.add("User input");
		c.add("Default data");
		c.getSelectedItem();
				
		JLabel lblNewLabel = new JLabel("Select your option:\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(106, 158, 150, 20);
		add(lblNewLabel);
			
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c.getSelectedItem()=="Default data" && e.getSource() == btnNewButton) {
					MainFrame.main_panel.invalidate();
					MainFrame.main_panel.removeAll();
					Second frame2 = new Second();
					MainFrame.main_panel.add(frame2);
					MainFrame.main_panel.revalidate();
					MainFrame.main_panel.repaint();
				}
			}
		});
		btnNewButton.setBounds(235, 206, 52, 23);
		add(btnNewButton);
	}

}

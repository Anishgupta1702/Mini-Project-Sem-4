import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFrame extends JFrame {
	
	 static JPanel main_panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("deprecation")
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					frame.setTitle("Miniproject");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 470);
		main_panel = new JPanel();
		main_panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(	main_panel);
		main_panel.setLayout(null);
		
	        First first = new First();
	        Second second = new Second();
	        
	        final CardLayout card=new CardLayout();
	        main_panel.setLayout(card);
	        main_panel.add(first, "one");
	        main_panel.add(second, "two");
	        
	}
}

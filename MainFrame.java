import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
	
	 static JPanel main_panel;
	 private JTable table;

	//private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
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
		setBounds(100, 100, 540, 407);
		main_panel = new JPanel();
		main_panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(	main_panel);
		main_panel.setLayout(null);
		
		 /*	getContentPane().setLayout(null);    
	        setSize(400, 400);
	        setLocationRelativeTo(null);
	        setResizable(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE); */
	        First first = new First();
	        Second second = new Second();
	        //JPanel first = new JPanel();
	        //JPanel second = new JPanel();
	        final CardLayout card=new CardLayout();
	        main_panel.setLayout(card);
	        main_panel.add(first, "one");
	        //first.setLayout(null);
	        main_panel.add(second, "two");
	}

}
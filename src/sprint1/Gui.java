package sprint1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Gui {

	private
	
	JFrame NineMensMorris;
	JPanel NineMensMorrisBG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.NineMensMorris.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		NineMensMorris = new JFrame();
		NineMensMorris.setTitle("Nine Men's Morris");
		NineMensMorris.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		NineMensMorris.setVisible(true);
		NineMensMorris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NineMensMorrisBG = new JPanel();
		NineMensMorrisBG.setBackground(Color.WHITE);
		NineMensMorris.getContentPane().add(NineMensMorrisBG);
		
		JButton PVPButton = new JButton("Player VS Player");
		PVPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		PVPButton.setBounds(250,250,120,35);
		NineMensMorrisBG.add(PVPButton);
		
		JButton PVAIButton = new JButton("Player VS AI");
		PVAIButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		NineMensMorrisBG.add(PVAIButton);
		

	}

}
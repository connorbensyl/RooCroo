package alternative_with_2D_Array;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


import javax.swing.SwingConstants;
import alternative_with_2D_Array.Board;


public class Gui1 extends JFrame{
    private static final long serialVersionUID = 1L;


	private Board board;
	
	Controller controller;
	
	public void setUp()	throws Exception{
		board = new Board();
	}
	
	public void tearDown() throws Exception{
	}
	
	JFrame NineMensMorris;
	JPanel NineMensMorrisBG;

	private JTextField txtWelcome;
	int yRecieved;
	int xRecieved;


	/**
	 * Launch the application.
	 */
	
	/*class GameBoardCanvas extends JPanel {
			
			GameBoardCanvas(){
				addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {  
						if (Board.getGameState() == GameState.PLAYING) {
							int x = e.getY();
							int y = e.getX();
							}
						
						repaint();  // Call-back paintComponent().
					}
				});
			}*/
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui1 window = new Gui1();
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
	public Gui1(){
		initialize();
		

		controller = new Controller(this);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {


		
		Rectangles pvprect = new Rectangles();
		Rectangles pvarect = new Rectangles();
		
		NineMensMorris = new JFrame();
		NineMensMorris.setTitle("Nine Men's Morris");
		NineMensMorris.setSize(1920,1080);
		NineMensMorris.setExtendedState(JFrame.MAXIMIZED_BOTH);
		NineMensMorris.setVisible(true);
		NineMensMorris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		
		NineMensMorrisBG = new JPanel(new BorderLayout());
		NineMensMorrisBG.setBounds(0, 0, 1920, 1080);
		NineMensMorrisBG.setBackground(new Color(240, 255, 240));
		NineMensMorrisBG.setLayout(null);
		NineMensMorris.getContentPane().add(NineMensMorrisBG);

		
		txtWelcome = new JTextField();
		txtWelcome.setBackground(new Color(245, 245, 220));
		txtWelcome.setForeground(Color.lightGray);
		txtWelcome.setEditable(false);
		txtWelcome.setText("Welcome to Nine Men's Morris");
		txtWelcome.setBounds(488, 165, 273, 92);
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		NineMensMorrisBG.add(txtWelcome);
		txtWelcome.setColumns(10);
		
		JLabel txtplayer1 = new JLabel();
		txtplayer1.setText("Player: ");
		txtplayer1.setBounds(14, 16, 273, 92);
		
		JLabel txtplayer2 = new JLabel();
		txtplayer2.setText("Player: ");
		txtplayer2.setBounds(1050, 16, 273, 92);
		
		JLabel txtaiplayer = new JLabel();
		txtaiplayer.setText("AI: ");
		txtaiplayer.setBounds(1050, 16, 273, 92);

		
	    // Buttons
	//	Controller testButtons;
		
	    JButton WButton = new JButton("White");
	    WButton.setBounds(554,290,147,29);
	    WButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	
	    	
	    	}
	    });
	    
	    
	    
	    JButton BButton = new JButton("Black");
	    
		
		JButton PVPButton = new JButton("Player VS Player");
		PVPButton.setForeground(Color.RED);
		PVPButton.setBounds(554,290,147,29);
		PVPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NineMensMorrisBG.removeAll();
				NineMensMorrisBG.repaint();
				NineMensMorrisBG.revalidate();
				
				NineMensMorrisBG.setLayout(new BorderLayout());
				NineMensMorrisBG.setBackground(new Color(210, 255, 180));
				NineMensMorrisBG.add(txtplayer1);
				NineMensMorrisBG.add(txtplayer2);
				NineMensMorrisBG.add(pvprect);
			//	NineMensMorrisBG.add(WButton);
				NineMensMorrisBG.repaint();
				NineMensMorrisBG.revalidate();
				

			}
		});


		NineMensMorrisBG.add(PVPButton);
		
		JButton PVAIButton = new JButton("Player VS AI");
		PVAIButton.setBounds(569, 358, 121, 29);
		PVAIButton.setForeground(Color.MAGENTA);
		PVAIButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NineMensMorrisBG.removeAll();
				NineMensMorrisBG.repaint();
				NineMensMorrisBG.revalidate();
				
				NineMensMorrisBG.setLayout(new BorderLayout());
				NineMensMorrisBG.setBackground(new Color(210, 255, 240));
				NineMensMorrisBG.add(txtplayer1);
				NineMensMorrisBG.add(txtaiplayer);
				NineMensMorrisBG.add(pvarect);
				NineMensMorrisBG.repaint();
				NineMensMorrisBG.revalidate();

			
			}
		});
		
		NineMensMorrisBG.add(PVAIButton);


	}
	
	/* update visual elements of board*/
	
void updateBoard() {
		
	}
}

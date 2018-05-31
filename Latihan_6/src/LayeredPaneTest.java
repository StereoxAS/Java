import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class LayeredPaneTest
{

	private JFrame frame;
		
	private int x = 0;
    private int y = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					LayeredPaneTest window = new LayeredPaneTest();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LayeredPaneTest()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setUndecorated(true);
		
		
		    
		
		
		JLayeredPane Pane1 = new JLayeredPane();
		
		Pane1.setBackground(Color.GRAY);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(Pane1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(Pane1, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		JLabel paneBackground = new JLabel("");
		
		paneBackground.setBounds(0, -50, 800, 450);
		Pane1.add(paneBackground);
		
		JButton menuPlay = new JButton("");
		
		
		menuPlay.setOpaque(false);
		menuPlay.setContentAreaFilled(false);
		menuPlay.setBorderPainted(false);
		menuPlay.setVisible(true);
		
		menuPlay.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				menuPlay.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuPlay1.png"));
			}
			public void mouseExited(MouseEvent arg0) 
			{
				menuPlay.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuPlay2.png"));
			}
		});
		
		Pane1.setLayer(menuPlay, 1);
		menuPlay.setForeground(Color.LIGHT_GRAY);
		menuPlay.setFont(new Font("Trajan Pro 3", Font.PLAIN, 18));
		menuPlay.setBounds(700, 92, 74, 25);
		Pane1.add(menuPlay);
		
		JButton menuOptions = new JButton("");
		menuOptions.setOpaque(false);
		menuOptions.setContentAreaFilled(false);
		menuOptions.setBorderPainted(false);
		
		
		menuOptions.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				menuOptions.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuOpt.png"));
			}
			public void mouseExited(MouseEvent arg0) 
			{
				menuOptions.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuOpt2.png"));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				//optionFrame.setVisible(true);
				optionDialog dialog = new optionDialog();
				dialog.setVisible(true);
			}
		});
		
		
		Pane1.setLayer(menuOptions, 1);
		menuOptions.setForeground(Color.LIGHT_GRAY);
		menuOptions.setFont(new Font("Trajan Pro 3", Font.PLAIN, 18));
		menuOptions.setBounds(677, 130, 93, 25);
		Pane1.add(menuOptions);
		
		JButton menuDataFiles = new JButton("");
		menuDataFiles.setOpaque(false);
		menuDataFiles.setContentAreaFilled(false);
		menuDataFiles.setBorderPainted(false);
		
		
		menuDataFiles.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				menuDataFiles.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuDataFiles1.png"));
			}
			public void mouseExited(MouseEvent arg0) 
			{
				menuDataFiles.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuDataFiles2.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				JOptionPane.showMessageDialog(frame, "Menu isn't done yet :)");
			}
		});
		
		
		Pane1.setLayer(menuDataFiles, 1);
		menuDataFiles.setForeground(Color.LIGHT_GRAY);
		menuDataFiles.setFont(new Font("Trajan Pro 3", Font.PLAIN, 18));
		menuDataFiles.setBounds(662, 170, 111, 25);
		Pane1.add(menuDataFiles);
		
		JButton menuTech = new JButton("");
		menuTech.setOpaque(false);
		menuTech.setContentAreaFilled(false);
		menuTech.setBorderPainted(false);
		
		
		menuTech.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				menuTech.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuTech1.png"));
			}
			public void mouseExited(MouseEvent arg0) 
			{
				menuTech.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuTech2.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				try
				{
					Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
					if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE))
					{
						desktop.browse(new URI("https://api.whatsapp.com/send?phone=6285778116601"));
					}
				} catch (Exception e2)
				{
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		
		
		Pane1.setLayer(menuTech, 1);
		menuTech.setForeground(Color.LIGHT_GRAY);
		menuTech.setFont(new Font("Trajan Pro 3", Font.PLAIN, 18));
		menuTech.setBounds(631, 210, 143, 25);
		Pane1.add(menuTech);
		
		JButton menuExit = new JButton("");
		menuExit.setOpaque(false);
		menuExit.setContentAreaFilled(false);
		menuExit.setBorderPainted(false);

		menuExit.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				menuExit.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuExit1.png"));
			}
			public void mouseExited(MouseEvent arg0) 
			{
				menuExit.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuExit2.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		
		
		Pane1.setLayer(menuExit, 1);
		menuExit.setForeground(Color.LIGHT_GRAY);
		menuExit.setFont(new Font("Trajan Pro 3", Font.PLAIN, 18));
		menuExit.setBounds(709, 250, 65, 25);
		Pane1.add(menuExit);
		
		//Image reader
		try
		{
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\tes.ico"));
			paneBackground.setIcon(new ImageIcon(ImageIO.read(new File("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\bg800.jpg"))));
	
			menuPlay.setIcon(new ImageIcon(ImageIO.read(new File("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuPlay2.png"))));
			menuOptions.setIcon(new ImageIcon(ImageIO.read(new File("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuOpt2.png"))));
			menuDataFiles.setIcon(new ImageIcon(ImageIO.read(new File("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuDataFiles2.png"))));
			menuTech.setIcon(new ImageIcon(ImageIO.read(new File("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuTech2.png"))));
			menuExit.setIcon(new ImageIcon(ImageIO.read(new File("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuExit2.png"))));

		} catch (IOException e)
		{
			// TODO: handle exception
		}		
		
		
		frame.getContentPane().setLayout(groupLayout);
		
		FrameDragListener frameDragListener = new FrameDragListener(frame);
        frame.addMouseListener(frameDragListener);
        frame.addMouseMotionListener(frameDragListener);
	}
	 	
	//Draggable window
	public static class FrameDragListener extends MouseAdapter 
	{

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
	}
}

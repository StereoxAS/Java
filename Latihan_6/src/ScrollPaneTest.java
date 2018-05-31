import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ScrollPaneTest
{

	private JFrame frame;

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
					ScrollPaneTest window = new ScrollPaneTest();
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
	public ScrollPaneTest()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnNewMenu = new JMenu("New");
		mnFile.add(mnNewMenu);
		
		JMenuItem mntmClass = new JMenuItem("Class");
		mnNewMenu.add(mntmClass);
		
		JMenuItem mntmInterface = new JMenuItem("Interface");
		mnNewMenu.add(mntmInterface);
		
		JMenuItem mntmEnum = new JMenuItem("Enum");
		mnNewMenu.add(mntmEnum);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo");
		mnEdit.add(mntmRedo);
		
		JMenuItem mntmCut = new JMenuItem("Cut");
		mnEdit.add(mntmCut);
		
		JMenuItem mntmCopy = new JMenuItem("Copy");
		mnEdit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mnEdit.add(mntmPaste);
		
		JMenu mnSource = new JMenu("Source");
		menuBar.add(mnSource);
		
		JMenuItem mntmTrustMeDude = new JMenuItem("Trust me dude");
		mnSource.add(mntmTrustMeDude);
		
		JMenu mnWindow = new JMenu("Window");
		menuBar.add(mnWindow);
		
		JMenuItem mntmMinimize = new JMenuItem("Minimize");
		mnWindow.add(mntmMinimize);
		
		JMenuItem mntmMaximize = new JMenuItem("Maximize");
		mnWindow.add(mntmMaximize);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelpMenu = new JMenuItem("Help menu    F8");
		mnHelp.add(mntmHelpMenu);
		
		JMenuItem mntmAbout = new JMenuItem("About             F1");
		mnHelp.add(mntmAbout);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
	}

}

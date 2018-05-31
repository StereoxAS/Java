import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.net.ssl.SSLEngineResult.Status;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Window
{

	private JFrame frmPathOfExile;
	private JTextField inputEmail;
	private JPasswordField inputPassword;
	private final ButtonGroup jenisKelamin = new ButtonGroup();
	

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
					Window window = new Window();
					window.frmPathOfExile.setVisible(true);
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
	public Window()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmPathOfExile = new JFrame();
		frmPathOfExile.getContentPane().setBackground(Color.BLACK);
		frmPathOfExile.setAlwaysOnTop(true);
		frmPathOfExile.setTitle("Path of Exile");
		frmPathOfExile.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Projects\\Java\\Latihan_6\\lib\\poe.ico"));
		frmPathOfExile.setBounds(100, 100, 1366, 768);
		frmPathOfExile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inputEmail = new JTextField();
		inputEmail.setBackground(UIManager.getColor("Button.background"));
		inputEmail.setFont(new Font("Fontin", Font.PLAIN, 12));
		inputEmail.setColumns(10);
		
		inputPassword = new JPasswordField();
		inputPassword.setBackground(UIManager.getColor("Button.background"));
		inputPassword.setEchoChar('*');
		
		JLabel lblInput = new JLabel("Username");
		lblInput.setForeground(Color.ORANGE);
		lblInput.setFont(new Font("Fontin SmallCaps", Font.PLAIN, 14));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.ORANGE);
		lblPassword.setFont(new Font("Fontin SmallCaps", Font.PLAIN, 14));
		
		JProgressBar loadingBar = new JProgressBar();
		loadingBar.setMinimum(0);
		loadingBar.setStringPainted(false);
		loadingBar.setEnabled(true);
		loadingBar.setForeground(Color.GREEN);
		loadingBar.setBackground(Color.WHITE);
		
		JComboBox inputGateway = new JComboBox();
		inputGateway.setBackground(UIManager.getColor("Button.background"));
		inputGateway.setFont(new Font("Fontin SmallCaps", Font.PLAIN, 12));
		inputGateway.setModel(new DefaultComboBoxModel(Gateway.values()));
		
		JLabel lblGateway = new JLabel("Gateway");
		lblGateway.setForeground(Color.ORANGE);
		lblGateway.setFont(new Font("Fontin SmallCaps", Font.PLAIN, 14));
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.setFont(new Font("Fontin SmallCaps", Font.PLAIN, 12));
		
		JButton btnRegister = new JButton("Create");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)  
			{
				loadingBar.setMaximum(Account.list.size());
				try
				{
					for (int i = 1; i <= Account.list.size(); i++)
					{
						loadingBar.setValue(i);
						System.out.println(Account.list.get(i));
					}					
				}
				catch (Exception e)
				{
					// TODO: handle exception
				}
			}
		});
		btnRegister.setFont(new Font("Fontin SmallCaps", Font.PLAIN, 12));
		
		JButton btnOptions = new JButton("Options");
		btnOptions.setFont(new Font("Fontin SmallCaps", Font.PLAIN, 12));
		
		JLabel background = new JLabel(" ");
		background.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\lib\\poe3.jpg"));
		
		JPanel statusPanel = new JPanel();
		statusPanel.setBackground(Color.BLACK);
		GroupLayout groupLayout = new GroupLayout(frmPathOfExile.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(loadingBar, GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(546, Short.MAX_VALUE)
					.addComponent(background, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
					.addGap(515))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(statusPanel, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
					.addGap(147)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblGateway, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblInput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(inputGateway, 0, 320, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnOptions, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(inputEmail, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
									.addGap(6))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(inputPassword, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnRegister, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
					.addGap(405))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(background, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(459)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(inputEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblInput))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnLogin)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnRegister)
										.addComponent(inputPassword, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(inputGateway, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnOptions, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblGateway, GroupLayout.PREFERRED_SIZE, 15, Short.MAX_VALUE)
								.addComponent(statusPanel, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(loadingBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		
		JTextPane statusPanelTextArea = new JTextPane();
		statusPanelTextArea.setEditable(false);
		statusPanelTextArea.setFont(new Font("Fontin SmallCaps", Font.PLAIN, 13));
		statusPanelTextArea.setSelectionColor(Color.WHITE);
		statusPanelTextArea.setBackground(Color.BLACK);
		
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				HashMap<String, char[]> newAccount = new HashMap<>();
				newAccount.put(inputEmail.getText(),inputPassword.getPassword());
				Account.list.add(newAccount);
				statusPanelTextArea.setText("Authenticating as " + inputEmail.getText() + "..." + "\n");
			}
		});
		
		GroupLayout gl_statusPanel = new GroupLayout(statusPanel);
		gl_statusPanel.setHorizontalGroup(
			gl_statusPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(statusPanelTextArea, GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
		);
		gl_statusPanel.setVerticalGroup(
			gl_statusPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_statusPanel.createSequentialGroup()
					.addContainerGap(154, Short.MAX_VALUE)
					.addComponent(statusPanelTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		statusPanel.setLayout(gl_statusPanel);
		frmPathOfExile.getContentPane().setLayout(groupLayout);
	}
}

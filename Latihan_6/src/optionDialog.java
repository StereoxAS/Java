import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class optionDialog extends JDialog
{
	private JLayeredPane layeredPane;
	private JButton dialogOK;
	private JButton dialogCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			optionDialog dialog = new optionDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public optionDialog()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\tes.ico"));
		setTitle("Skyrim Option");
		setResizable(false);
		setModal(true);
		
		JComboBox optionAspectRatio = new JComboBox();
		JComboBox optionAdapter = new JComboBox();
		JComboBox optionResolution = new JComboBox();
		
		JComboBox optionAntialiasing = new JComboBox();
		JComboBox optionAnisotrophic = new JComboBox();
		
		setBounds(100, 100, 460, 350);
		{
			layeredPane = new JLayeredPane();
			
			JLabel dialogBG = new JLabel("");
			dialogBG.setIcon(new ImageIcon("D:\\Projects\\Java\\Latihan_6\\bin\\lib\\menuOptionBG.png"));
			dialogBG.setBounds(0, 0, 454, 321);
			layeredPane.add(dialogBG);
			{
				JPanel panel = new JPanel();
				panel.setOpaque(false);
				layeredPane.setLayer(panel, 1);
				panel.setBounds(0, 273, 460, 45);
				layeredPane.add(panel);
				{
					dialogOK = new JButton("");
					dialogOK.setBounds(300, 15, 30, 30);
					dialogOK.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					dialogOK.setOpaque(false);
					dialogOK.setContentAreaFilled(false);
					dialogOK.setBorderPainted(true);
					dialogOK.addMouseListener(new MouseAdapter() 
					{
						@Override
						public void mouseClicked(MouseEvent e) 
						{
							System.out.println((optionAdapter.getSelectedItem().toString()));
							System.out.println((optionAspectRatio.getSelectedItem().toString()));
							System.out.println((optionResolution.getSelectedItem().toString()));
							System.out.println((optionAntialiasing.getSelectedItem().toString()));
							System.out.println((optionAnisotrophic.getSelectedItem().toString()));
							setVisible(false);
						}
					});
					dialogOK.setActionCommand("OK");
				}
				{
					dialogCancel = new JButton("");
					dialogCancel.setOpaque(false);
					dialogCancel.setContentAreaFilled(false);
					dialogCancel.setBorderPainted(true);
					dialogCancel.addMouseListener(new MouseAdapter() 
					{
						@Override
						public void mouseClicked(MouseEvent arg0) 
						{
							setVisible(false);
						}
					});
					dialogCancel.setActionCommand("Cancel");
				}
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(275)
							.addComponent(dialogOK, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(dialogCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(dialogCancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(dialogOK, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
				);
				panel.setLayout(gl_panel);
			}
		}
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
		);
		
		JCheckBox optionIsWindowed = new JCheckBox("Windowed");
		optionIsWindowed.setBackground(new Color(240, 240, 240));
		optionIsWindowed.setOpaque(true);
		layeredPane.setLayer(optionIsWindowed, 1);
		optionIsWindowed.setBounds(15, 243, 102, 23);
		layeredPane.add(optionIsWindowed);
		
		JCheckBox optionIsAllResolution = new JCheckBox("Show All Resolution");
		optionIsAllResolution.setBackground(new Color(240, 240, 240));
		optionIsAllResolution.setOpaque(true);
		layeredPane.setLayer(optionIsAllResolution, 1);
		optionIsAllResolution.setBounds(272, 243, 150, 23);
		layeredPane.add(optionIsAllResolution);
		
		
		layeredPane.setLayer(optionAdapter, 1);
		optionAdapter.setBackground(new Color(240, 240, 240));
		optionAdapter.setOpaque(true);
		optionAdapter.setBounds(153, 35, 257, 20);
		layeredPane.add(optionAdapter);
		
		optionAdapter.addItem(new ComboItem("Intel(R) HD Graphics","intel"));
		optionAdapter.addItem(new ComboItem("NVIDIA GeForce 1080TI","nvidia"));
		optionAdapter.addItem(new ComboItem("AMD Radeon RX480","amd"));
		
		
		layeredPane.setLayer(optionAspectRatio, 1);
		optionAspectRatio.setBackground(new Color(240, 240, 240));
		optionAspectRatio.setOpaque(true);
		optionAspectRatio.setBounds(153, 61, 257, 20);
		layeredPane.add(optionAspectRatio);
		
		optionAspectRatio.addItem(new ComboItem("Standard (4:3 or 5:4)","std"));
		optionAspectRatio.addItem(new ComboItem("16:9 Widescreen","wide1"));
		optionAspectRatio.addItem(new ComboItem("16:10 Widescreen","wide2"));
		
		
		layeredPane.setLayer(optionResolution, 1);
		optionResolution.setBackground(new Color(240, 240, 240));
		optionResolution.setOpaque(true);
		optionResolution.setBounds(153, 87, 257, 20);
		layeredPane.add(optionResolution);
		
		//create group of combo item
		DefaultComboBoxModel<ComboItem> std = new DefaultComboBoxModel<ComboItem>();
		std.addElement(new ComboItem("800x600","p600"));
		std.addElement(new ComboItem("1024x768","p768"));
		
		DefaultComboBoxModel<ComboItem> wide1 = new DefaultComboBoxModel<ComboItem>();
		wide1.addElement(new ComboItem("1200x720 [Letterbox]","p720"));
		wide1.addElement(new ComboItem("1360x768","p768"));
		wide1.addElement(new ComboItem("1366x768","p768"));

		DefaultComboBoxModel<ComboItem> wide2 = new DefaultComboBoxModel<ComboItem>();
		wide2.addElement(new ComboItem("1024x640","p640"));
		
		//Listen to AspectRatio combo item changes
		optionAspectRatio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(optionAspectRatio.getSelectedItem().toString().equalsIgnoreCase("Standard (4:3 or 5:4)"))
				{
					optionResolution.setModel(std);
				}
				else if(optionAspectRatio.getSelectedItem().toString().equalsIgnoreCase("16:9 Widescreen"))
				{
					optionResolution.setModel(wide1);
				}
				else
				{
					optionResolution.setModel(wide2);	
				}
			}
		});
		
		
		
		
		layeredPane.setLayer(optionAntialiasing, 1);
		optionAntialiasing.setBackground(new Color(240, 240, 240));
		optionAntialiasing.setOpaque(true);
		optionAntialiasing.setBounds(153, 112, 257, 20);
		layeredPane.add(optionAntialiasing);
		
		optionAntialiasing.addItem(new ComboItem("Off (best performance)","AAoff"));
		optionAntialiasing.addItem(new ComboItem("2 Samples","AA2"));
		optionAntialiasing.addItem(new ComboItem("4 Samples","AA4"));
		
		layeredPane.setLayer(optionAnisotrophic, 1);
		optionAnisotrophic.setBackground(new Color(240, 240, 240));
		optionAnisotrophic.setOpaque(true);
		optionAnisotrophic.setBounds(153, 138, 257, 20);
		layeredPane.add(optionAnisotrophic);
		
		optionAnisotrophic.addItem(new ComboItem("Off (best performance)","AAoff"));
		optionAnisotrophic.addItem(new ComboItem("2 Samples","AA2"));
		optionAnisotrophic.addItem(new ComboItem("4 Samples","AA4"));
		optionAnisotrophic.addItem(new ComboItem("8 Samples","AA8"));
		optionAnisotrophic.addItem(new ComboItem("16 Samples","AA16"));
		
		getContentPane().setLayout(groupLayout);
	}
}

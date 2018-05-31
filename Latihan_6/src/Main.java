import javax.swing.*;

public class Main extends javax.swing.JFrame 
{
	/*
	 * Java Swing
	 * 
	 * Object
	 * Component
	 * Container
	 */

	private static final long serialVersionUID = 3206847208968227199L;
	
	public static void main(String[] args)
	{
		Account acc = new Account();
		System.out.println(acc.getList().get(0));
	}
	
}

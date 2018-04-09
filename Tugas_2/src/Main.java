import java.util.Date;
import java.util.Scanner;

public class Main
{
	public static Restaurant dominos = new Restaurant("Domino's Pizza", "Otista", "91875", "Jl. Otto Iskandar Dinata No.151", "www.dominos.co.id");
	
	public static void main(String[] args)
	{
		Date date = new Date();
		Scanner scan = new Scanner(System.in); 
		boolean repeat = true;
		Menu menu = new Menu();
		menu.generateMenu();
		Order order = new Order();
		Utils.clrscr();
		
		try
		{
			while(true)
			{
				//Utils.clrscr();
				order.getOrder();
			}
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ERROR : Array index out of bound. Application is terminating.");
			scan.nextLine();
			Utils.exit();
		}
		catch (NullPointerException e)
		{
			System.out.println("ERROR : Null Pointer exception. Application is terminating.");
			scan.nextLine();
			Utils.exit();
		}
		
		//System.out.println("Totalnya jadi Rp" + order.getNewBill().getTotalPrice());
	}
	public static void getRestaurantDetails()
	{
		System.out.println(Main.dominos.getPropertyName() + " " +  Main.dominos.getBranchName() + "\n" +  Main.dominos.getbAddress());
	}
}
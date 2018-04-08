import java.util.Date;
import java.util.Scanner;

public class Bill
{
	private Date date;
	private double totalPrice = 0;
	private String billNo;
	private int qty[] = new int[24];
	private Scanner scan = new Scanner(System.in);
	
	public void getBill(String[] string)
	{
		Utils.clrscr();
		//belum dinamis
		qty = Utils.calcQuantity(string);
		System.out.println("\t\t\t\tDomino's Pizza");
		System.out.println("\t\tJl. Otto Iskandar Dinata No.151 Jatinegara");
		System.out.println("\n\n "
						 + "=========================================================================\n"
						 + "                Menu             | Qty |              Price              ");
		for (int i = 0; i < string.length; i++)
		{
			if(qty[i] != 0)
			{
				System.out.print(string[i]);
				
				if(string[i].length() > 28)
				{
					System.out.print("");
				}
				else if(string[i].length() > 21 && (string[i].length() <= 28))
				{
					System.out.print("\t");
				}
				else if(string[i].length() > 14 && string[i].length() <= 21)
				{
					System.out.print("\t\t");
				}
				else if(string[i].length() > 7 && string[i].length() <= 14)
				{
					System.out.print("\t\t\t");
				}
				else if(string[i].length() > 0 && string[i].length() <= 7)
				{
					System.out.print("\t\t\t\t");
				}
			}
			if(qty[i] != 0)
			{
				System.out.println("\t" + qty[i]);
			}
			
		}
		
		scan.nextLine();
	}
	
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date)
	{
		this.date = date;
	}
	public double getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	public String getBillNo()
	{
		return billNo;
	}
	public void setBillNo(String billNo)
	{
		this.billNo = billNo;
	}
}

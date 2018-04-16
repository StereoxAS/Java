import java.util.Scanner;

public class Order
{
	//private MenuList listMenu = new MenuList();
	//private String menuDibeli[] = new String[listMenu.getArrayListMenu().size()];
	private Bill newBill = new Bill();
	private Payment payment = new Payment();

	
	Scanner scan = new Scanner(System.in);
	
	Order()
	{
		// di ganti ke Payment
		this.newBill.setTotalPrice(0);
	}	
	public Bill getNewBill()
	{
		return newBill;
	}

	public void setNewBill(Bill newBill)
	{
		this.newBill = newBill;
	}

	public void getOrder()
	{
		// TODO Auto-generated method stub
		MenuOption.getMenuOption();
	}
	public Payment getPayment()
	{
		return payment;
	}
	public void setPayment(Payment payment)
	{
		this.payment = payment;
	}
}
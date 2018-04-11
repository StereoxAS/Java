import java.util.Scanner;

public class Customer
{
	private String customerName;
	private String customerID;
	private String customerOrder;
  public String p;
  Scanner scan = new Scanner(System.in);

  public void inputNama()
  {
      System.out.println("Pesanan dibuat atas nama ");
      p = scan.nextLine();
      setCustomerName(p);
  }
        
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public String getCustomerID()
	{
		return customerID;
	}
	public void setCustomerID(String customerID)
	{
		this.customerID = customerID;
	}
	public String getCustomerOrder()
	{
		return customerOrder;
	}
	public void setCustomerOrder(String customerOrder)
	{
		this.customerOrder = customerOrder;
	}
}

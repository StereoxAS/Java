import java.util.Date;

public class Bill
{
	private Date date;
	private double totalPrice = 0;
	private String billNo;
	
	
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

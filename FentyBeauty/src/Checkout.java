public class Checkout 
{
	private String uang;
	private int total;
	private int total2;
	
	public Checkout(String uang, int total, int total2) 
	{
		super();
		this.uang = uang;
		this.total = total;
		this.total2 = total2;
	}
	public String getUang() 
	{
		return uang;
	}
	public void setUang(String uang) {
		this.uang = uang;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal2() {
		return total2;
	}
	public void setTotal2(int total2) {
		this.total2 = total2;
	}
	
	
	
}

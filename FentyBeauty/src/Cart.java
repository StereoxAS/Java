
public class Cart 
{
	private int totalPrice;
	private int currentPrice;
	
	
	public Cart() 
	{
		this.totalPrice = 0;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	
}


public class Order
{
	private Menu orderQueue[] = new Menu[99];

	public Menu getOrderQueue(int index)
	{
		return orderQueue[index];
	}

	public void setOrderQueue(Menu orderQueue, int index)
	{
		this.orderQueue[index] = orderQueue;
	}
}

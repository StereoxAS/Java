
public class Menu
{
	private String menuName;
	private double menuPrice;
	private Menu listMenu[] = new Menu[99];

	Menu()
	{
		
	}
	Menu(String menuName, double menuPrice)
	{
		
	}
	public void generateMenu(int jmlMenu)
	{
		this.listMenu = new Menu[jmlMenu];
		//Favourite Pizza
		
		this.listMenu[1] = new Menu("Meat & Meat", 65455);
		this.listMenu[2] = new Menu("Chicken BBQ", 65455);
		this.listMenu[3] = new Menu("Chicken Pepperoni Mushroom", 65455);
		this.listMenu[4] = new Menu("Beef Pepperoni Feast", 65455);
		this.listMenu[5] = new Menu("Double Beef Burger", 65455);
		
		//Premium Pizza
		this.listMenu[0] = new Menu("American Classic Cheeseburger", 78182);
		
		
	}
	
	public Menu getListMenu(int index)
	{
		return listMenu[index];
	}

	public void setListMenu(Menu listMenu, int index)
	{
		this.listMenu[index] = listMenu;
	}	
	public String getMenuName()
	{
		return menuName;
	}
	public void setMenuName(String menuName)
	{
		this.menuName = menuName;
	}
	public double getMenuPrice()
	{
		return menuPrice;
	}
	public void setMenuPrice(double menuPrice)
	{
		this.menuPrice = menuPrice;
	}
}

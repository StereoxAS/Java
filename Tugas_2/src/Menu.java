public class Menu
{
	private String menuName;
	private double menuPrice;
	private Menu listMenu[] = new Menu[99];
	

	Menu()
	{
		this.menuName = "Undefined";
		this.menuPrice = 0;
	}
	Menu(String menuName, double menuPrice)
	{
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
	
	public int getMenuLength()
	{
		return listMenu.length;
	}
	
	public int getFirstEmptyMenu()
	{
		// deteksi array kosong yang pertama
		int emptyIndex = 0;
		try
		{
			for (int i = 0; i < listMenu.length; i++)
			{
				if(listMenu[i] == null)
				{
					emptyIndex = i;
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("\nERROR: Unhandled Exception");
		}
		return emptyIndex;
	}
	
	public void setEmptyMenu(int emptyIndex)
	{
		// malloc ceritanya
		this.listMenu[emptyIndex] = new Menu();
	}
	
	public void addMenu(String menuName, int price)
	{
		// price dulu yang di set karena getEmptyMenu ngecek namanya aja
		int index = this.getFirstEmptyMenu();
		this.setEmptyMenu(index);
		this.listMenu[index].setMenuPrice(price);
		this.listMenu[index].setMenuName(menuName);
	}
	
	public void generateMenu()
	{
		//this.listMenu = new Menu[jmlMenu];
		//Favourite Pizza
		this.listMenu[0] = new Menu("Double Beef Burger", 65455);
		this.listMenu[1] = new Menu("Meat & Meat", 65455);
		this.listMenu[2] = new Menu("Chicken BBQ", 65455);
		this.listMenu[3] = new Menu("Chicken Pepperoni Mushroom", 65455);
		this.listMenu[4] = new Menu("Beef Pepperoni Feast    ", 65455);
		this.listMenu[5] = new Menu("Tuna Delight      ", 65455);
		
		//Premium Pizza
		this.listMenu[6] = new Menu("American Classic Cheeseburger", 78182);
		this.listMenu[7] = new Menu("Italian Supreme", 78182);
		this.listMenu[8] = new Menu("Veggie Mania    ", 78182);
		this.listMenu[9] = new Menu("American All Star", 78182);
		this.listMenu[10] = new Menu("Chicken Lovers    ", 78182);
		this.listMenu[11] = new Menu("Cheese Mania    ", 78182);
		this.listMenu[12] = new Menu("Delicious Pepper Beef", 78182);
		this.listMenu[13] = new Menu("Extravaganzza", 78182);
		this.listMenu[14] = new Menu("Meatzza", 78182);
		
		//Super Value Pizza
		this.listMenu[15] = new Menu("Beef Delight", 40909);
		this.listMenu[16] = new Menu("Cheesy Sausage", 40909);
		this.listMenu[17] = new Menu("Chicken Pepperoni Feast", 40909);
		this.listMenu[18] = new Menu("Margherita", 40909);
		this.listMenu[19] = new Menu("Sambal Beef", 40909);
		this.listMenu[20] = new Menu("Veggie Delight", 40909);
		
		//Pizza Mania
		this.listMenu[21] = new Menu("Chicken Rasher", 14091);
		this.listMenu[22] = new Menu("Pepper Chicken", 14091);
		this.listMenu[23] = new Menu("Beef Rasher", 14091);
	}
	
	
	
	public Menu[] getListMenu()
	{
		return listMenu;
	}

	public void setListMenu(Menu[] listMenu)
	{
		this.listMenu = listMenu;
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
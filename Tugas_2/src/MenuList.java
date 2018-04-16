import java.util.ArrayList;
import java.util.List;

public class MenuList extends Menu
{	
	/*
	 * Converted Array of Menu -> ArrayList of Menu
	 */
	private List<List<String>> listMenu = new ArrayList<List<String>>();
	
	public MenuList()
	{
		this.fillMenu();
	}
	public void printMenu(int index)
	{
		boolean repeating = true;
		while(repeating)
		{
			try
			{					
				if(listMenu.get(index) != null)
				{
					System.out.print(listMenu.get(index).get(0));
					
					if(listMenu.get(index).get(0).length() > 28)
					{
						System.out.print("");
					}
					else if(listMenu.get(index).get(0).length() > 21 && (listMenu.get(index).get(0).length() <= 28))
					{
						System.out.print("\t");
					}
					else if(listMenu.get(index).get(0).length() > 14 && listMenu.get(index).get(0).length() <= 21)
					{
						System.out.print("\t\t");
					}
					else if(listMenu.get(index).get(0).length() > 7 && listMenu.get(index).get(0).length() <= 14)
					{
						System.out.print("\t\t\t");
					}
					else if(listMenu.get(index).get(0).length() > 0 && listMenu.get(index).get(0).length() <= 7)
					{
						System.out.print("\t\t\t\t");
					}
				}
				break;
			} 
			catch (IndexOutOfBoundsException e)
			{	
				System.out.println("[ERROR: Index Out of Bound. Returning the "+ index + "th index instead.]");
				index = index-1;
			}
		}
	}
	
	public void fillMenu()
	{
		List<String> menu1 = new ArrayList<String>();
		menu1.add("Double Beef Burger");menu1.add("65455");
		this.listMenu.add(menu1);
		
		List<String> menu2 = new ArrayList<String>();
		menu2.add("Meat & Meat");menu2.add("65455");
		this.listMenu.add(menu2);
		
		List<String> menu3 = new ArrayList<String>();
		menu3.add("Chicken BBQ");menu3.add("65455");
		this.listMenu.add(menu3);
		
		List<String> menu4 = new ArrayList<String>();
		menu4.add("Chicken Pepperoni Mushroom");menu4.add("65455");
		this.listMenu.add(menu4);
		
		List<String> menu5 = new ArrayList<String>();
		menu5.add("Beef Pepperoni Feast    ");menu5.add("65455");
		this.listMenu.add(menu5);
		
		List<String> menu6 = new ArrayList<String>();
		menu6.add("Tuna Delight      ");menu6.add("65455");
		this.listMenu.add(menu6);
		
		List<String> menu7 = new ArrayList<String>();
		menu7.add("American Classic Cheeseburger");menu7.add("78182");
		this.listMenu.add(menu7);
		
		List<String> menu8 = new ArrayList<String>();
		menu8.add("Italian Supreme");menu8.add("78182");
		this.listMenu.add(menu8);
		
		List<String> menu9 = new ArrayList<String>();
		menu9.add("Veggie Mania    ");menu9.add("78182");
		this.listMenu.add(menu9);
		
		List<String> menu10 = new ArrayList<String>();
		menu10.add("American All Star");menu10.add("78182");
		this.listMenu.add(menu10);
		
		List<String> menu11 = new ArrayList<String>();
		menu11.add("Chicken Lovers    ");menu11.add("78182");
		this.listMenu.add(menu11);
		
		List<String> menu12 = new ArrayList<String>();
		menu12.add("Cheese Mania    ");menu12.add("78182");
		this.listMenu.add(menu12);
		
		List<String> menu13 = new ArrayList<String>();
		menu13.add("Delicious Pepper Beef");menu13.add("78182");
		this.listMenu.add(menu13);
		
		List<String> menu14 = new ArrayList<String>();
		menu14.add("Extravaganzza");menu14.add("78182");
		this.listMenu.add(menu14);
		
		List<String> menu15 = new ArrayList<String>();
		menu15.add("Meatzza");menu15.add("78182");
		this.listMenu.add(menu15);
		
		List<String> menu16 = new ArrayList<String>();
		menu16.add("Beef Delight");menu16.add("40909");
		this.listMenu.add(menu16);
		
		List<String> menu17 = new ArrayList<String>();
		menu17.add("Cheesy Sausage");menu17.add("40909");
		this.listMenu.add(menu17);
		
		List<String> menu18 = new ArrayList<String>();
		menu18.add("Chicken Pepperoni Feast");menu18.add("40909");
		this.listMenu.add(menu18);
		
		List<String> menu19 = new ArrayList<String>();
		menu19.add("Margherita");menu19.add("40909");
		this.listMenu.add(menu19);
		
		List<String> menu20 = new ArrayList<String>();
		menu20.add("Sambal Beef");menu20.add("40909");
		this.listMenu.add(menu20);
		
		List<String> menu21 = new ArrayList<String>();
		menu21.add("Veggie Delight");menu21.add("40909");
		this.listMenu.add(menu21);
		
		List<String> menu22 = new ArrayList<String>();
		menu22.add("Chicken Rasher");menu22.add("14091");
		this.listMenu.add(menu22);
		
		List<String> menu23 = new ArrayList<String>();
		menu23.add("Pepper Chicken");menu23.add("14091");
		this.listMenu.add(menu23);
		
		List<String> menu24 = new ArrayList<String>();
		menu24.add("Beef Rasher");menu24.add("14091");
		this.listMenu.add(menu24);
	}
	public void addMenu(String menuName, String menuPrice)
	{
		List<String> newMenu= new ArrayList<String>();
		newMenu.add(menuName);
		newMenu.add(menuPrice);
		this.listMenu.add(newMenu);
	}
	public int getMenuLength()
	{
		return this.listMenu.size();
	}
	public int getMenuPrice(int index)
	{
		return Integer.valueOf(this.listMenu.get(index).get(1));
	}
	public String getMenuName(int index)
	{
		return this.listMenu.get(index).get(0);
	}
	public List<List<String>> getArrayListMenu()
	{
		return this.listMenu;
	}
	public List<String> getMenu(int index)
	{
		return this.listMenu.get(index);
	}
}

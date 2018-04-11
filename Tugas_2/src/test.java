public class test
{
	public static void main(String[] args)
	{
		int x;
		Menu menu = new Menu();
		menu.generateMenu();
		try
		{
			System.out.println("Menu ke-1 adalah " + menu.getListMenu()[1].getMenuName());
			System.out.println("Menu kosong ada pada index : " + menu.getFirstEmptyMenu());
//			x = menu.getFirstEmptyMenu();
//			menu.setEmptyMenu(x);
			menu.addMenu("Ganteng", 420);
//			System.out.println(menu.getListMenu().length);
//			
			System.out.println("23 : " + menu.getListMenu()[23].getMenuName());
			System.out.println("24 : " + menu.getListMenu()[24].getMenuName());
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.getMessage();
			System.out.println("\nERROR: Unhandled Exception. ");
		}
		
	}
}
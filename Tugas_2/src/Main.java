
public class Main
{
	public static void main(String[] args)
	{
		Restaurant dominos = new Restaurant("Domino's Pizza", "Otista", "91875", "Jl. Otto Iskandar Dinata No.151", "www.dominos.co.id");
		Menu menu = new Menu();
		menu.generateMenu();
		
		System.out.println(menu.getListMenu(1).getMenuName() + " seharga Rp." + menu.getListMenu(1).getMenuPrice());
		
	}
}

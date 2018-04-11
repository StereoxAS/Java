import java.util.Scanner;

public class MenuOption 
{
	static final Menu listMenu = new Menu();
	static Staff staves = new Staff();
	static Scanner scan = new Scanner(System.in);
	
	
	public static void getMenuOption()
	{
		System.out.println(staves.getStaff().getStaffName() + "	: \tSelamat datang di Domino's Pizza\n"
				  											  + "\t\tAda yang bisa saya bantu ?\n");
		System.out.println("1. Saya mau pesan\n"
						 + "2. Saya tidak mau pesan\n"
						 + "3. Ini apa ya ?\n"
						 + "4. Saya ingin pulang\n");
		System.out.print(" : ");
		displayMenu(scan.nextInt());
	}
	
	public static void viewMenu()
	{
		for (int i = 0; i < listMenu.getMenuLength()/2; i++)
		{
			if (listMenu.getListMenu()[i] != null)
			{
				if (i < 10)
				{
					System.out.print("0" + i + ". " + listMenu.getListMenu()[i].getMenuName());
				} 
				else
				{
					System.out.print(i + ". " + listMenu.getListMenu()[i].getMenuName());
				}
				if (listMenu.getListMenu()[i].getMenuName().length() > 28)

				{
					System.out.print("\t ");
				} 
				else if (listMenu.getListMenu()[i].getMenuName().length() > 21
						&& (listMenu.getListMenu()[i].getMenuName().length() <= 28))
				{
					System.out.print("\t\t ");
				} 
				else if (listMenu.getListMenu()[i].getMenuName().length() > 14
						&& listMenu.getListMenu()[i].getMenuName().length() <= 21)
				{
					System.out.print("\t\t\t ");
				} 
				else if (listMenu.getListMenu()[i].getMenuName().length() > 7
						&& listMenu.getListMenu()[i].getMenuName().length() <= 14)
				{
					System.out.print("\t\t\t\t ");
				} 
				else if (listMenu.getListMenu()[i].getMenuName().length() > 0
						&& listMenu.getListMenu()[i].getMenuName().length() <= 7)
				{
					System.out.print("\t\t\t\t\t ");
				}
				System.out.println(i + listMenu.getMenuLength() / 2 + ". " + listMenu.getListMenu()[i + listMenu.getMenuLength() / 2].getMenuName());
			}
		}
		System.out.println();
	}
	
	public static void displayMenu(int x)
	{	
		listMenu.generateMenu();
		int pilihan = x;
		String string = "";
		if(x == 1)
		{
			System.out.println("\n" + staves.getStaff().getStaffName() + "	: Silakan pilih menu yang anda mau\n");
			MenuOption.viewMenu();

			while(pilihan >= 0)
			{
				System.out.print(" : ");
				string = scan.next();
				if(string.equalsIgnoreCase("Tidak"))
				{
					pilihan = -1;
				}
				else
				{
					pilihan = Integer.valueOf(string);
					System.out.println("\n" + staves.getStaff().getStaffName() + "	: Ada lagi [Ketik 'Tidak' untuk tidak]? \n");
				}
			}
			System.out.println("\n" + staves.getStaff().getStaffName() + "	: Silakan di cek kembali pesanan Anda \n");
			scan.nextLine();
		}
		else if(x == 2)
		{
			System.out.println("Tolong anda pergi dari sini sekarang juga.");
			scan.nextLine();
			Utils.exit();
		}
		else if(x == 3)
		{
			System.out.println("Selamat datang di Domino's Pizza\n"
							 + "Anda sekarang ada di ");
			Main.getRestaurantDetails();
			scan.nextLine();
		}
		else if(x == 4)
		{
			Utils.exit();
		}
	}
}

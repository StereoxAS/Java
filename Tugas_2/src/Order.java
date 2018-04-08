import java.util.Scanner;

public class Order
{
	private Menu orderQueue[] = new Menu[99];
	private Bill newBill = new Bill();
	private Menu newMenu = new Menu();
	private Staff newStaff = new Staff();
	
	private String listOrder[] = new String[99];
	private String string = "Ya";
	private int counter = 0;
	private int pilihan = 0;
	private int questionChoice = 0;
	Scanner scan = new Scanner(System.in);
	
	Order()
	{
		// TODO create new Bill for each Order created
		this.newBill.setTotalPrice(0);
	}
	public void newOrder(int menuChoice)
	{
		newMenu.generateMenu(); //menampilkan list menu-menu
		switch(menuChoice)
		{
			case 1 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 2 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 3 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 4 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 5 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 6 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 7 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 8 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 9 :  newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 10 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 11 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 12 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 13 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 14 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 15 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 16 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 17 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 18 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 19 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 20 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 21 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 22 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 23 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
			case 24 : newBill.setTotalPrice(newBill.getTotalPrice() + newMenu.getListMenu(menuChoice).getMenuPrice());
		}
	}
	
	public Bill getNewBill()
	{
		return newBill;
	}

	public void setNewBill(Bill newBill)
	{
		this.newBill = newBill;
	}

	public Menu[] getOrderQueue()
	{
		return orderQueue;
	}

	public void setOrderQueue(Menu[] orderQueue)
	{
		this.orderQueue = orderQueue;
	}
	public void getOrder()
	{
		// TODO Auto-generated method stub
		newMenu.generateMenu();
	
		System.out.println(newStaff.getStaff().getStaffName() + "	: Selamat datang di Domino's Pizza\n"
															  + "	  Ada yang bisa saya bantu ?\n");
		System.out.println("1. Saya mau pesan\n"
						 + "2. Saya tidak mau pesan\n"
						 + "3. Ini apa ya ?\n"
						 + "4. Saya ingin pulang\n");
		System.out.print(" : ");
		questionChoice = this.scan.nextInt();
		if(questionChoice == 1)
		{
			System.out.println("\n" + newStaff.getStaff().getStaffName() + "	: Silakan pilih menu yang anda mau\n");
			for (int i = 0; i < newMenu.getMenuLength()/2; i++)
			{
				if(i < 10)
				{
					System.out.print("0" + i + ". " + this.newMenu.getListMenu(i).getMenuName());
				}
				else
				{
					System.out.print(i + ". " + this.newMenu.getListMenu(i).getMenuName());
				}
				if(newMenu.getListMenu(i).getMenuName().length() > 28)
				
				{
					System.out.print("\t ");
				}
				else if(newMenu.getListMenu(i).getMenuName().length() > 21 && (newMenu.getListMenu(i).getMenuName().length() <= 28))
				{
					System.out.print("\t\t ");
				}
				else if(newMenu.getListMenu(i).getMenuName().length() > 14 && newMenu.getListMenu(i).getMenuName().length() <= 21)
				{
					System.out.print("\t\t\t ");
				}
				else if(newMenu.getListMenu(i).getMenuName().length() > 7 && newMenu.getListMenu(i).getMenuName().length() <= 14)
				{
					System.out.print("\t\t\t\t ");
				}
				else if(newMenu.getListMenu(i).getMenuName().length() > 0 && newMenu.getListMenu(i).getMenuName().length() <= 7)
				{
					System.out.print("\t\t\t\t\t ");
				}
				System.out.println(i+newMenu.getMenuLength()/2 + ". " + newMenu.getListMenu(i+newMenu.getMenuLength()/2).getMenuName());
			}
			System.out.println();
			
			while(this.pilihan >= 0)
			{
				System.out.print(" : ");
				this.string = scan.next();
				if(string.equalsIgnoreCase("Tidak"))
				{
					this.pilihan = -1;
				}
				else
				{
					this.pilihan = Integer.valueOf(string);
					this.newOrder(pilihan);
					this.listOrder[counter] = newMenu.getListMenu(pilihan).getMenuName();
					counter++; System.out.println("Counter is now " + counter);
					System.out.println("\n" + newStaff.getStaff().getStaffName() + "	: Ada lagi [Ketik 'Tidak' untuk tidak]? \n");
				}
			}
			System.out.println("\n" + newStaff.getStaff().getStaffName() + "	: Silakan di cek kembali pesanan Anda \n");
			newBill.getBill(listOrder);
			scan.nextLine();
		}
		else if(questionChoice == 2)
		{
			System.out.println("Tolong anda pergi dari sini sekarang juga.");
			this.scan.nextLine();
			Utils.exit();
		}
		else if(questionChoice == 3)
		{
			System.out.println("Selamat datang di Domino's Pizza\n"
							 + "Anda sekarang ada di ");
			Main.getRestaurantDetails();
			this.scan.nextLine();
		}
		else if(questionChoice == 4)
		{
			Utils.exit();
		}
		
	}
}

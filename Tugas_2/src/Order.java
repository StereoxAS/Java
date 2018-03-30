import java.util.Scanner;

public class Order
{
	private Menu orderQueue[] = new Menu[99];
	private Bill newBill = new Bill();
	private Menu newMenu = new Menu();
	private String string = "Ya";
	private int pilihan = 0;
	private int questionChoice = 0;
	Scanner scan = new Scanner(System.in);
	
	Order()
	{
		this.newBill.setTotalPrice(0);
	}
	public void newOrder(int menuChoice)
	{
		newMenu.generateMenu();
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

	public Menu getOrderQueue(int index)
	{
		return orderQueue[index];
	}

	public void setOrderQueue(Menu orderQueue, int index)
	{
		this.orderQueue[index] = orderQueue;
	}
	public void getOrder()
	{
		// TODO Auto-generated method stub
		newMenu.generateMenu();
		System.out.println("Selamat datang di Domino's Pizza\n\n");
		
		System.out.println("Ada yang bisa saya bantu ?");
		System.out.println("1. Saya mau pesan\n"
						 + "2. Saya tidak mau pesan\n"
						 + "3. Ini apa ya ?\n"
						 + "4. Saya ingin pulang\n");
		System.out.print(" : ");
		questionChoice = this.scan.nextInt();
		if(questionChoice == 1)
		{
			System.out.println("Silakan pilih menu yang anda mau\n");
			//System.out.println("Menu kami ada " + newMenu.getMenuLength());
			for (int i = 0; i < newMenu.getMenuLength()/2; i++)
			{
				System.out.print(i + ". " + this.newMenu.getListMenu(i).getMenuName());
				if(newMenu.getListMenu(i).getMenuName().length() > 16 && (newMenu.getListMenu(i).getMenuName().length() <= 24))
				{
					System.out.print("\t\t\t ");
				}
				else if(newMenu.getListMenu(i).getMenuName().length() > 24)
				{
					System.out.print("\t ");
				}
				else if(newMenu.getListMenu(i).getMenuName().length() > 8 && newMenu.getListMenu(i).getMenuName().length() <= 16)
				{
					System.out.print("\t\t\t ");
				}
				else if(newMenu.getListMenu(i).getMenuName().length() <= 8)
				{
					System.out.print("\t\t\t\t ");
				}
				System.out.println(i+newMenu.getMenuLength()/2 + ". " + newMenu.getListMenu(i+newMenu.getMenuLength()/2).getMenuName());
			}
			while(!this.string.equalsIgnoreCase("Tidak"))
			{
				this.pilihan = scan.nextInt();
				this.newOrder(pilihan);	
				System.out.print("Ada lagi [Ya / Tidak]? "); 
				this.string = scan.next();				
			}
		}
		else if(questionChoice == 2)
		{
			System.out.println("Tolong anda pergi dari sini sekarang juga.");
			this.scan.next();
			Utils.exit();
		}
		else if(questionChoice == 3)
		{
			System.out.println("Selamat datang di Domino's Pizza\n"
							 + "Anda sekarang ada di ");
			Main.getRestaurantDetails();
			this.scan.next();
		}
		else if(questionChoice == 4)
		{
			Utils.exit();
		}
		
	}
}

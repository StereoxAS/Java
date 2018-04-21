import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu
{
	private static Menu menu = new Menu();
	private Buku newBuku = new Buku();
	public Scanner scan = new Scanner(System.in);
	
	private Menu()
	{
		
	}
	public void displayMenu()
	{	
		Utils.clrscr();
		System.out.println("Database Buku\n\n");
		System.out.println("1. Entri Buku\n"
						 + "2. Daftar Buku\n"
						 + "3. Cari Buku by Kode\n"
						 + "4. Cari Buku by Penerbit\n"
						 + "5. Cari Buku by Penulis\n"
						 + "6. Cari Buku by Judul\n"
						 + "7. Keluar\n");
	}
	public void selectMenu()
	{
		try
		{
			this.scan = new Scanner(System.in);
			System.out.print(" : ");
			int selection = this.scan.nextInt();
			if(selection == 1)
			{
				this.scan = new Scanner(System.in);
				this.newBuku = new Buku();
				System.out.print("   Enter Kode Buku		 : "); newBuku.setKodeBuku(scan.nextLine());
				System.out.print("   Enter Judul Buku		 : "); newBuku.setJudulBuku(scan.nextLine());
				System.out.print("   Enter Jumlah Penulis Buku	 : ");
				int jmlPenulis = Integer.valueOf(this.scan.next());
				this.scan = new Scanner(System.in);
				for (int i = 1; i <= jmlPenulis; i++)
				{	
					System.out.print("   Penulis ke-" + i + "\t\t\t : ");newBuku.getPenulis().add(scan.nextLine());
				}
				System.out.print("   Enter Penerbit Buku		 : "); newBuku.setPenerbit(scan.nextLine());
				
				Database.getInstance().addBuku(newBuku);
				
				Menu.getInstance().returnMenu("   New buku added.");
			}
			else if(selection == 2)
			{
				this.scan = new Scanner(System.in);
				System.out.println("Kode   \tJudul  \t\tPenulis\t\tPenerbit\t");
				if (Database.getInstance().getDataBuku().size() == 0)
				{
					Menu.getInstance().returnMenu("   Tidak ada buku saat ini.");
				}
				for (int i = 0; i < Database.getInstance().getDataBuku().size(); i++)
				{
					System.out.print(Database.getInstance().getDataBuku().get(i).getKodeBuku());
					System.out.print("\t");
					System.out.print(Database.getInstance().getDataBuku().get(i).getJudulBuku());
					System.out.print("\t");
					System.out.print(Database.getInstance().getDataBuku().get(i).getPenulis().get(0));//penulis pertama saja
					System.out.print("\t");
					System.out.print(Database.getInstance().getDataBuku().get(i).getPenerbit());
					System.out.print("\t");
				}
				this.scan.nextLine();
				
				Menu.getInstance().returnMenu("");
			}
			else if(selection == 3)
			{
				this.scan = new Scanner(System.in);
				
				System.out.println("   Method unfinished.");
				
				this.scan.nextLine();
				Menu.getInstance().returnMenu("");
			}
			else if(selection == 4)
			{
				this.scan = new Scanner(System.in);
				
				System.out.println("   Method unfinished.");
				
				this.scan.nextLine();
				Menu.getInstance().returnMenu("");
			}
			else if(selection == 5)
			{
				this.scan = new Scanner(System.in);
				
				System.out.println("   Method unfinished.");
				
				this.scan.nextLine();
				Menu.getInstance().returnMenu("");
			}
			else if(selection == 6)
			{
				this.scan = new Scanner(System.in);
				
				System.out.println("   Method unfinished.");
				
				this.scan.nextLine();
				Menu.getInstance().returnMenu("");
			}
			else if(selection == 7)
			{
				this.scan = new Scanner(System.in);
				System.out.println("   Press ENTER to exit.");
				this.scan.nextLine();
				Utils.exit();
			}
		
		} catch (InputMismatchException e)
		{
			e.printStackTrace();
			Menu.getInstance().selectMenu();
		}
		this.scan.close();
	}
	public void returnMenu(String message)
	{
		Utils.clrscr();
		Menu.getInstance().displayMenu();
		System.out.println(message + "\n");
		Menu.getInstance().selectMenu();
	}
	
	public static Menu getInstance()
	{
		return menu;
	}
	public void setMenu(Menu menu)
	{
		Menu.menu = menu;
	}
}

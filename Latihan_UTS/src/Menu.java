
public class Menu
{
	
	private String string = null;
	private static Barang barang = new Barang();
	
	public Menu()
	{
		
	}
	public static void getListMenu()
	{
		boolean bool = true;
		int integer = 0;
		while(bool)
		{
			System.out.println(
					"I N D O M A R E T\n\n"
				  + "1. List Nama\n"
				  + "2. List Harga\n"
				  + "3. List Kategori\n"
				  + "4. Keluar\n"
				  + ""
				  + ""
				  + "");
			System.out.print(": "); 
			integer = Integer.valueOf(Utils.scan().nextLine());
			if(integer == 1)
			{
				
			}
			else if(integer == 2)
			{
				
			}
			else if(integer == 3)
			{
				System.out.print("Masukkan kategori yang diinginkan : ");
				Menu.barang.printByKategori(Utils.scan().nextLine());
			}
			else
			{
				break;
			}
		}
		System.out.println("\nTerimakasih sudah berbelanja di Indomaret.");
	}
}

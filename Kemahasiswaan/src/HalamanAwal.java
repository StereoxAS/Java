import java.util.Date;
import java.util.Scanner;

public class HalamanAwal 
{
	public static void getMenu() 
	{
		boolean isDone = false;
		
		while(isDone==false)
		{
			Utils.clrscr();
			Scanner sc = new Scanner(System.in);
			System.out.println("\t\t\tP R O G R A M  S I P A D U  K W 2\t\t\n\n");
			System.out.println("1). Home\n"
					         + "2). Login\n"
					         + "3). Exit\n\n");
			
			System.out.print("Pilihan	: ");
			HalamanAwal.getHalamanAwal(sc.nextInt());
			sc.nextLine();
			sc.close();
		}
	}
	
	public static void getHalamanAwal(int opt)
	{
		/*
		 * Homepage dari SIPADU KW
		 */
		
		Date date = new Date();
		
		Utils.clrscr();
		Scanner sc = new Scanner(System.in);
		if(opt == 1) 
		{
			Utils.homescreen();
			Utils.clrscr();
			System.out.println("\t\t\t\t\t\tSelamat Datang di SIPADU KW2");
			System.out.println("\n\n" + date); 
			
			
			
			//25 line kosong sebagai offset dari konten kosong, per konten dikurang satu jgn lupa
			//																	  v-- disini letak line ke-25
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
			System.out.println("\t\t\t\tCopyright © 2017-2018 Sekolah Tinggi Ilmu Statistik (STIS)\n"
							 + "\t\t\t\t\t\tContact us: 16.9227@stis.ac.id");
			
		} 
		else if (opt == 2) 
		{
			HalamanLogin.Login();
		} 
		else if (opt == 3) 
		{
			Utils.exit();
		}
		sc.nextLine();
		HalamanAwal.getMenu();
		sc.close();
	}
}

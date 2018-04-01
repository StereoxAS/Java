import java.util.Scanner;

public class HalamanAwal 
{
	public static void getMenu() {
		boolean isDone=false;
		
		while(isDone==false)
		{
			Utils.clrscr();
			System.out.println("				PROGRAM SIPADU KW2	\n");
			
			System.out.println("1). Home\n"
					         + "2). Login\n"
					         + "3). Exit\n\n");
			
			System.out.print("Pilihan	: ");
			Scanner sc = new Scanner(System.in);
	
			HalamanAwal.getHalamanAwal(sc.nextInt());
			sc.nextLine();
			
		}
	}
	
	public static void getHalamanAwal(int opt)
	{
		Utils.clrscr();
		Scanner sc = new Scanner(System.in);
		if(opt==1) {
			System.out.println("Selamat Datang di homePage SIPADU KW2");
			sc.nextLine();
		} else if (opt==2) {
			HalamanLogin.Login();
		} else if (opt==3) {
			Utils.exit();
		}
		sc.nextLine();
	}
	
	
	
}

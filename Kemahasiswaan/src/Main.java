import java.util.*;

public class Main 
{
	public static void halamanAwal(int opt){
		Utils.clrscr();
		//int z;
		Scanner sc = new Scanner(System.in);
		if(opt==1) {
			System.out.println("Selamat Datang di homePage SIPADU KW2");
			sc.nextLine();
		} else if (opt==2) {
			Main.login();
		} else if (opt==3) {
			Utils.exit();
		}
		//z=a.nextInt();
		sc.nextLine();
		
		//a.close();
	}
	
	public static void login() {
		
		Utils.clrscr();
		int i,index;
		String temp1,temp2;
		Scanner sc = new Scanner(System.in);
		AccountData adm = new AccountData();
		index=99;
		
		System.out.println("Ini Halaman Login");
		System.out.print("Input Username : ");
		temp1 = sc.nextLine();
		System.out.print("Input Password : ");
		temp2 = sc.nextLine();
		
		for(i=0;i<adm.getTotal();i++) 
		{
			if(temp1.equalsIgnoreCase(adm.getAdmin(i).getUsername()))
			{
				index=i;
			}
		}
		
		if(index==99) {
			System.out.println("\t Username tidak terdaftar");
			Main.halamanAwal(2);
		}
			
		if(temp1.equalsIgnoreCase(adm.getAdmin(index).getUsername()))
		{
			if(temp2.equals(adm.getAdmin(index).getPassword()))
			{
				System.out.println("Welcome " + adm.getAdmin(index).getIdname());
				sc.nextLine();
				Main.halamanAdmin();
				
			}
			else 
			{
				System.out.println("Password anda salah");
			}
		}	
		else 
		{
			System.out.println("Username tidak ditemukan");
		}
		
		sc.nextLine();
		//sc.close();		
	}
	
	public static void halamanAdmin() {
		Utils.clrscr();
		
		int a;
		System.out.println("Halo Admin ");
		System.out.println("Anda ingin apa?");
		System.out.println("1). Lihat Data Mhs 2KS1\n" 
						 + "2). Opsi belum ada\n" 
						 + "3). Opsi belum ada\n"
						 + "4). Exit");
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" pilihan : ");
		a=sc.nextInt();
		System.out.println("");
		
		if(a==1) {
			Main.dataMhs();
		}else if(a==2) {
			System.out.println("Opsi ini belum dapat dipilih");
		}else if(a==3) {
			System.out.println("Opsi ini belum dapat dipilih");
		}else if(a==1) {
			Main.halamanAwal(1);
		}
	}
	
	public static void dataMhs() {
		Utils.clrscr();
		
		System.out.println("STIS - Kelas	: \n");
		Kelas2KS1 kelas = new Kelas2KS1();
		kelas.getAllMahasiswa();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		Main.halamanAdmin();
		
	}
	
	public static void main(String[] args) 
	{
		boolean isDone=false;
		int a;
		
		while(isDone==false)
		{
			Utils.clrscr();
			System.out.println("				PROGRAM SIPADU KW2	\n");
			
			System.out.println("1). Home\n"
					         + "2). Login\n"
					         + "3). Exit\n\n");
			
			System.out.print("Pilihan	: ");
			Scanner sc = new Scanner(System.in);
			//a=sc.nextInt();
			//sc.close();
			Main.halamanAwal(sc.nextInt());
			sc.nextLine();
			//sc.close();
		}	
	}
}

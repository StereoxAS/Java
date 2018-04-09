import java.util.Scanner;

public class HalamanLogin {
	
	public static void Login() 
	{
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
		
		if(index == 99) 
		{
			System.out.println("\t Username tidak terdaftar");
			HalamanAwal.getHalamanAwal(2);
		}
			
		if(temp1.equalsIgnoreCase(adm.getAdmin(index).getUsername()))
		{
			if(temp2.equals(adm.getAdmin(index).getPassword()))
			{
				System.out.println("Welcome " + adm.getAdmin(index).getIdname());
				sc.nextLine();
				HalamanAdmin.getHalamanAdmin();
				
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
		sc.close();		
	}
}

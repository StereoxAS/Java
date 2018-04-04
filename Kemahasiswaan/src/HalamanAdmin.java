import java.util.Scanner;

public class HalamanAdmin 
{
	private static Kelas kelas[] = new Kelas[20];
	 
	
	public static void getHalamanAdmin() 
	{
		Utils.clrscr();
		
		int a;
		System.out.println("Halo Admin ");
		System.out.println("Anda ingin apa?");
		System.out.println("1). Lihat Data Mhs 2KS1\n" 
						 + "2). Lihat Data Mhs 2KS2\n" 
						 + "3). Lihat Data Mhs 2KS3\n" 
						 + "4). Exit");
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" pilihan : ");
		a=sc.nextInt();
		System.out.println("");
		
		if(a==1) {
			HalamanAdmin.data2KS1();
		}else if(a==2) {
			HalamanAdmin.data2KS2();
		}else if(a==3) {
			HalamanAdmin.data2KS3();
		}else if(a==4) {
			HalamanAwal.getMenu();
		}
		
	}
	
	public static void data2KS1() 
	{
		Utils.clrscr();
		//casting Kelas -> Kelas2KS1
		kelas[1] = new Kelas2KS1();
		Kelas2KS1 kelas2ks1 = (Kelas2KS1) kelas[1];
		System.out.println("POLSTAT STIS - Kelas	: ");
		
		kelas2ks1.getAllMahasiswa();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		HalamanAdmin.getHalamanAdmin();
		
	}
	
	public static void data2KS2() {
		Utils.clrscr();
		//casting Kelas -> Kelas2KS2
		kelas[2] = new Kelas2KS2();
		Kelas2KS2 kelas2ks2 = (Kelas2KS2) kelas[2];
		System.out.println("POLSTAT STIS - Kelas	: ");
		
		kelas2ks2.getAllMahasiswa();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		HalamanAdmin.getHalamanAdmin();
		
	}
	
	public static void data2KS3() {
		Utils.clrscr();
		//casting Kelas -> Kelas2KS2
		kelas[3] = new Kelas2KS3();
		Kelas2KS3 kelas2ks3 = (Kelas2KS3) kelas[3];
		System.out.println("POLSTAT STIS - Kelas	: ");
		
		kelas2ks3.getAllMahasiswa();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		HalamanAdmin.getHalamanAdmin();
		
	}
	
	
	
}

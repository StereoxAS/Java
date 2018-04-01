import java.util.Scanner;

public class HalamanAdmin {
	public static void getHalamanAdmin() {
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
			HalamanAdmin.data2KS1();
		}else if(a==2) {
			System.out.println("Opsi ini belum dapat dipilih");
		}else if(a==3) {
			System.out.println("Opsi ini belum dapat dipilih");
		}else if(a==1) {
			HalamanAwal.getHalamanAwal(1);
		}
		
	}
	
	public static void data2KS1() {
		Utils.clrscr();
		
		System.out.println("STIS - Kelas	: \n");
		Kelas2KS1 kelas = new Kelas2KS1();
		kelas.getAllMahasiswa();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		HalamanAdmin.getHalamanAdmin();
		
	}
}

import java.util.Scanner;

public class Main 
{
	/*
	 * Inheritance
	 * 
	 * Parent class extended by Child class
	 * Inherited classes can be constructed from Parent
	 * ex : Mahasiswa mhs = new Dosen();
	 */
	String string;
	int integer;
	boolean bool;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Mahasiswa mhs[] = new Mahasiswa[5];
		
		mhs[0] = new Mahasiswa();
		Mahasiswa mhs1 = (Mahasiswa) mhs[0];
		mhs1.setNamaDepan("Takdir");
		
		mhs[1] = new Dosen();
		Dosen d1 = (Dosen) mhs[1];
		d1.setNip("12873");
		
		mhs[2] = new CleaningService();
		CleaningService cs = (CleaningService) mhs[2];
		cs.setPengalamanKerja(10);
		
		
		for(int i = 0;i<3;i++)
		{	
			System.out.println("IF ke-" + i);
			if(mhs[i] instanceof Mahasiswa)
			{
				System.out.println("mhs[0] adalah Mahasiswa");
				System.out.println(mhs[0].getNamaDepan());
				System.out.println(mhs1.getNamaDepan());
			}
			else if(mhs[i] instanceof Dosen)
			{
				System.out.println("mhs[0] adalah Dosen");
				System.out.println(mhs[1].getNim());
				System.out.println(d1.getNip());
			}
			else if(mhs[i] instanceof CleaningService)
			{
				System.out.println("mhs[0] adalah CleaningService");
				System.out.println(cs.getPengalamanKerja());
			}
		}
		
		
		
		System.out.println();
	}
}

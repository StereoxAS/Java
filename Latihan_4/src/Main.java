import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		/*
		 * List
		 * 
		 * List, LinkedList, ArrayList
		 * Using the concept of sequential LinkedList. Start at index 0.
		 */
		ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
		
		daftarPegawai.add(new Pegawai());
		
		daftarPegawai.get(0).addNoHP("0857-7811-6601");
		daftarPegawai.get(0).addEmailAddress("StereoxAS@gmail.com");
		daftarPegawai.get(0).addNoHP("0811-870-383");
		daftarPegawai.get(0).addEmailAddress("16.9227@stis.ac.id");
		
		
		
		for (int i = 0; i <= daftarPegawai.size()-1; i++)
		{
			System.out.println(daftarPegawai.get(i));
			for (int j = 0; j <= daftarPegawai.get(0).getNoHP().size() - 1; j++)
			{
				System.out.println("No HP		 " + j + "	: " + daftarPegawai.get(i).getNoHP().get(j));
				System.out.println("Email Address	 " + j + "	: " + daftarPegawai.get(i).getEmailAddress().get(j));
			} 
		}
	}
}

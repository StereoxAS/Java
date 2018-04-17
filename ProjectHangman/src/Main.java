import java.util.ArrayList;
import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		Random randomNumber = new Random();
		boolean repeating = true;
		ArrayList<Integer> selectedNumber = new ArrayList<>();
		LibraryMahasiswa libMhs = new LibraryMahasiswa();
		libMhs.generatePertanyaan();
		
		for(int i = 1; i < 11; i++)
		{
			int roll = randomNumber.nextInt();
			
			while(repeating)
			{
				
				for (int j = 0; j < libMhs.getListPertanyaan().size()-1; j++)
				{
					if(roll < (libMhs.getListPertanyaan().size()-1) && roll > 1)
					{
						if(!libMhs.getListPertanyaan().get(j).equals(libMhs.getListPertanyaan().get(roll)))
						{
							System.out.println(i + ". " + libMhs.getListPertanyaan().get(roll));
							selectedNumber.add(roll);
							break;
						}	
					}
				}
				continue;
			}
		}
		System.out.println("\nDone.");
	}
}

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> selectedNumber = new ArrayList<>();
		
		LibraryMahasiswa libMhs = new LibraryMahasiswa();
		libMhs.generatePertanyaan();
		
		selectedNumber = Utils.selectRandomNumber(Utils.generateUniqueSetOfRandomNumber(libMhs.getListPertanyaan().size()), 3);

		for (int j = 0; j < selectedNumber.size(); j++)
		{
			System.out.println(j+1 + ". " + libMhs.getListPertanyaan().get(selectedNumber.get(j)));
		}
		System.out.println("\nDone.");
	}
}

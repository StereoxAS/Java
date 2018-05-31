import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class LibraryMahasiswa extends Library
{
	/*
	 * TODO implement Singleton design
	 */
	private static LibraryMahasiswa library = new LibraryMahasiswa();
	private ArrayList<Integer> randomSeed = new ArrayList<>();
	private int randomSeedIndex = 1;
	
	public LibraryMahasiswa()
	{
		this.generatePertanyaan();
	}
	@Override
	public void generatePertanyaan()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(new File("Library/LibraryMahasiswa.txt")));
			while(reader.ready())
			{
				this.getListPertanyaan().add(reader.readLine());
			}
			reader.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: File not found.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("ERROR: Unhandled IOException.");
		}
		for (int i = 0; i < this.getListPertanyaan().size(); i++)
		{
			this.randomSeed.add(i);
		}
		Collections.shuffle(randomSeed);
	}

	@Override
	// Return value of ListPertanyaan with randomized index from RandomSeed index of RandomSeedIndex
	// Basically RandomSeed is just shuffled list from 1 -> ListPertanyaan.size(), picked sequentially with RandomSeedIndex
	public String getPertanyaan()
	{
		this.generatePertanyaan();
		return this.getListPertanyaan().get(getRandomSeed().get(getRandomSeedIndex()));
	}

	@Override
	public void setPertanyaan()
	{
		// TODO Auto-generated method stub
	}
	public static LibraryMahasiswa getInstance()
	{
		return library;
	}
	public void setLibrary(LibraryMahasiswa library)
	{
		LibraryMahasiswa.library = library;
	}
	public ArrayList<Integer> getRandomSeed()
	{
		return randomSeed;
	}
	public void setRandomSeed(ArrayList<Integer> randomSeed)
	{
		this.randomSeed = randomSeed;
	}
	
	public int getRandomSeedIndex()
	{
		if (randomSeedIndex == this.getListPertanyaan().size())
		{
			randomSeedIndex = 0;
		}
		return randomSeedIndex++;
	}
	public void setRandomSeedIndex(int randomSeedIndex)
	{
		this.randomSeedIndex = randomSeedIndex;
	}
}
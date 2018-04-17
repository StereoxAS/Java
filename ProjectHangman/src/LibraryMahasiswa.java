import java.io.*;

public class LibraryMahasiswa extends Library
{
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
	}

	@Override
	public String getPertanyaan()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPertanyaan()
	{
		// TODO Auto-generated method stub
		
	}	
}
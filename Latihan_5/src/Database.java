import java.util.ArrayList;

public class Database
{
	/*
	 * Singleton Class
	 * 
	 * Memanggil dirinya sendiri supaya menghindari pembuatan objek di class selain classnya sendiri
	 */
	private ArrayList<Buku> dataBuku = new ArrayList<>();
	private static Database db = new Database();
	
	private Database()
	{
		
	}
	
	public void addBuku(Buku buku)
	{
		this.dataBuku.add(buku);
	}

	public ArrayList<Buku> getDataBuku()
	{
		return dataBuku;
	}

	public void setDataBuku(ArrayList<Buku> dataBuku)
	{
		this.dataBuku = dataBuku;
	}

	public static Database getInstance()
	{
		return db;
	}

	public void setDb(Database db)
	{
		Database.db = db;
	}
}


public class Database
{
	private static Database db = new Database();
	private Barang barang;
	
	private Database()
	{
		barang = new Barang();
	}

	public static Database getInstance()
	{
		return Database.db;
	}

	public Barang getBarang()
	{
		return barang;
	}

	public void setBarang(Barang barang)
	{
		this.barang = barang;
	}
}

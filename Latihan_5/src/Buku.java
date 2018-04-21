import java.util.ArrayList;

public class Buku
{
	private String judulBuku;
	private String kodeBuku;
	private String penerbit;
	private ArrayList<String> penulis = new ArrayList<>();
	
	public Buku()
	{
		
	}
	public Buku(String judulBuku, String kodeBuku)
	{
		this.judulBuku = judulBuku;
		this.kodeBuku = kodeBuku;
	}	
	
	public String getJudulBuku()
	{
		return judulBuku;
	}
	public void setJudulBuku(String judulBuku)
	{
		this.judulBuku = judulBuku;
	}
	public String getKodeBuku()
	{
		return kodeBuku;
	}
	public void setKodeBuku(String kodeBuku)
	{
		this.kodeBuku = kodeBuku;
	}
	public String getPenerbit()
	{
		return penerbit;
	}
	public void setPenerbit(String penerbit)
	{
		this.penerbit = penerbit;
	}
	public ArrayList<String> getPenulis()
	{
		return penulis;
	}
	public void setPenulis(ArrayList<String> penulis)
	{
		this.penulis = penulis;
	}
}

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.lang.reflect.Array;

public class Barang
{
	private String namaBarang;
	private String kategoriBarang;
	private int hargaBarang;
	
	protected HashMap<Integer, Barang> listBarang = new HashMap<>();
	
	public Barang()
	{
		this.generateBarang();
	}
	
	public Barang(String kategori, String nama, int harga)
	{
		this.namaBarang = nama;
		this.kategoriBarang = kategori;
		this.hargaBarang = harga;
	}
	
	public void printByKategori(String kategoriBarang)
	{
		
		for (int i = 0; i < this.getListBarang().size(); i++)
		{
			if(this.getListBarang().get(i).getKategoriBarang().equalsIgnoreCase(kategoriBarang))
			{
				System.out.println(this.getListBarang().get(i).getNamaBarang());
			}
		}
		this.getListBarang().
	}
	
	public void generateBarang()
	{
		try
		{	
			String line[] = new String[3];
			int index = 0;
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("Library/daftarBarang.txt")));
			Barang newBarang;
			
			while(reader.ready())
			{
				line = reader.readLine().split(";");
				newBarang = new Barang(line[0], line[1], Integer.valueOf(line[2]));
				this.getListBarang().put(index, newBarang);
				
				index++;
			}
		} 
		catch (IOException e)
		{
			System.out.println("File not found.");
		}
	}

	public String getNamaBarang()
	{
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang)
	{
		this.namaBarang = namaBarang;
	}

	public String getKategoriBarang()
	{
		return kategoriBarang;
	}

	public void setKategoriBarang(String kategoriBarang)
	{
		this.kategoriBarang = kategoriBarang;
	}

	public int getHargaBarang()
	{
		return hargaBarang;
	}

	public void setHargaBarang(int hargaBarang)
	{
		this.hargaBarang = hargaBarang;
	}

	public HashMap<Integer, Barang> getListBarang()
	{
		return listBarang;
	}

	public void setListBarang(HashMap<Integer, Barang> listBarang)
	{
		this.listBarang = listBarang;
	}
}

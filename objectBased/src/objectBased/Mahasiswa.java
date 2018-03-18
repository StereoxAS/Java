package objectBased;

public class Mahasiswa 
{
	String nim, nama;
	Alamat alamatDaerah = new Alamat(); 
	Alamat alamatSekarang = new Alamat();

	public String getAlamatDaerah()
	{
		return alamatDaerah.getAlamatLengkap();
	}
	
	public String getAlamatSekarang()
	{
		return alamatSekarang.getAlamatLengkap();
	}
	
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

}

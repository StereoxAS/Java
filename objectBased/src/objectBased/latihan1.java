package objectBased;

public class latihan1
{
	String nim, nama;
	
	public static void main(String[] args) 
	{
		Mahasiswa m1 = new Mahasiswa();
		
		m1.setNama("Matthew");
		System.out.println(m1.getNama());
		m1.setNim("16.9227");
		System.out.println(m1.getNim());

		m1.alamatDaerah.setKabKota("Kabupaten Bogor");
		m1.alamatDaerah.setKec("Cibinong");
		m1.alamatDaerah.setKel("Puspasari");
		m1.alamatDaerah.setNamaJalan("Taman Kenari Jagorawi");
		m1.alamatDaerah.setNomor("Blok 9C/20");
		m1.alamatDaerah.setProvinsi("Jawa Barat");
		m1.alamatDaerah.setRt(03);
		m1.alamatDaerah.setRw(12);
		
		m1.alamatSekarang.setKabKota("Jakarta Timur");
		m1.alamatSekarang.setKec("Jatinegara");
		m1.alamatSekarang.setKel("Cipinang-Cimpedak");
		m1.alamatSekarang.setNamaJalan("Jl. Kebun Nanas Utara II");
		m1.alamatSekarang.setNomor("20");
		m1.alamatSekarang.setProvinsi("DKI Jakarta");
		m1.alamatSekarang.setRt(01);
		m1.alamatSekarang.setRw(07);
		
		System.out.println(m1.getAlamatDaerah());
		System.out.println(m1.getAlamatSekarang());
	}
}


public class Kelas2KS2 extends Kelas{
	private Mahasiswa mahasiswa[] = new Mahasiswa[35];
	
	public Kelas2KS2() {
		this.setNamaKelas("2KS-2");
		this.setJurusan("KS");
		this.setJumlahOrang(35);
		
		mahasiswa[0] = new Mahasiswa("Ahmad Azhar Zahril Alim","16.8975", enumJenisKelamin.LAKILAKI);
		mahasiswa[1] = new Mahasiswa("Aldo Dewanda Wijaya","16.8987", enumJenisKelamin.LAKILAKI);
		mahasiswa[2] = new Mahasiswa("Alif Andika Putra","16.8994", enumJenisKelamin.LAKILAKI);
		mahasiswa[3] = new Mahasiswa("Anandika Dian Pramesti","16.9005", enumJenisKelamin.PEREMPUAN);
		mahasiswa[4] = new Mahasiswa("Ardian Satrio Utomo","16.9021", enumJenisKelamin.LAKILAKI);
		mahasiswa[5] = new Mahasiswa("Arif Rahman Hakim","16.9025", enumJenisKelamin.LAKILAKI);
		mahasiswa[6] = new Mahasiswa("Aulia Maghfira","16.9036", enumJenisKelamin.PEREMPUAN);
		mahasiswa[7] = new Mahasiswa("Candra Dian Purnawanto","16.9049", enumJenisKelamin.LAKILAKI);
		mahasiswa[8] = new Mahasiswa("D. Agung Sungkono","16.9063", enumJenisKelamin.LAKILAKI);
		mahasiswa[9] = new Mahasiswa("Dimas Setia Pambudi","16.9083", enumJenisKelamin.LAKILAKI);
		
		mahasiswa[10] = new Mahasiswa("Epan Mareza Prima Hendra","16.9104", enumJenisKelamin.LAKILAKI);
		mahasiswa[11] = new Mahasiswa("Fadhlika Anggit Santoso Putro","16.9111", enumJenisKelamin.LAKILAKI);
		mahasiswa[12] = new Mahasiswa("Febiana Dahlia Anjani","16.9130", enumJenisKelamin.PEREMPUAN);
		mahasiswa[13] = new Mahasiswa("Firman Sidqi","16.9140", enumJenisKelamin.LAKILAKI);
		mahasiswa[14] = new Mahasiswa("Gian Mauladi","16.9153", enumJenisKelamin.LAKILAKI);
		mahasiswa[15] = new Mahasiswa("Herlina Pujianti","16.9179", enumJenisKelamin.PEREMPUAN);
		mahasiswa[16] = new Mahasiswa("Ilham Indra Prayudi","16.9192", enumJenisKelamin.LAKILAKI);
		mahasiswa[17] = new Mahasiswa("Lanang Adi Berkah","16.9231", enumJenisKelamin.LAKILAKI);
		mahasiswa[18] = new Mahasiswa("M. Iqbal","16.9247", enumJenisKelamin.LAKILAKI);
		mahasiswa[19] = new Mahasiswa("Maria Audrey Widiatma","16.9256", enumJenisKelamin.PEREMPUAN);
		
		mahasiswa[20] = new Mahasiswa("Monanta Alfiareza","16.9280", enumJenisKelamin.LAKILAKI);
		mahasiswa[21] = new Mahasiswa("Muhammad Al Fiqrie","16.9286", enumJenisKelamin.LAKILAKI);
		mahasiswa[22] = new Mahasiswa("Muhammad Ghozy Al Haqqoni","16.9293", enumJenisKelamin.LAKILAKI);
		mahasiswa[23] = new Mahasiswa("Muhammad Hafidz Al Ahmad Bit","16.9296", enumJenisKelamin.LAKILAKI);
		mahasiswa[24] = new Mahasiswa("Muhammad Rifqi Mubarak","16.9304", enumJenisKelamin.LAKILAKI);
		mahasiswa[25] = new Mahasiswa("Mukhammad Kharis","16.9311", enumJenisKelamin.LAKILAKI);
		mahasiswa[26] = new Mahasiswa("Ni Ketut Ananta Kusuma Dewi","16.9329", enumJenisKelamin.PEREMPUAN);
		mahasiswa[27] = new Mahasiswa("Nicken Worosasi","16.9332", enumJenisKelamin.PEREMPUAN);
		mahasiswa[28] = new Mahasiswa("Nyayu Indah Oktaviani","16.9343", enumJenisKelamin.PEREMPUAN);
		mahasiswa[29] = new Mahasiswa("Pandu Wicaksono","16.9350", enumJenisKelamin.LAKILAKI);
		
		mahasiswa[30] = new Mahasiswa("Rahmat Ramadhan","16.9370", enumJenisKelamin.LAKILAKI);
		mahasiswa[31] = new Mahasiswa("Rifqu Ramandhita","16.9381", enumJenisKelamin.LAKILAKI);
		mahasiswa[32] = new Mahasiswa("Rizki Adriansah","16.9395", enumJenisKelamin.LAKILAKI);
		mahasiswa[33] = new Mahasiswa("Ryan Reynaldy Hermanus Paimin","16.9405", enumJenisKelamin.LAKILAKI);
		mahasiswa[34] = new Mahasiswa("Sheerin Dahwan Aziz","16.9420", enumJenisKelamin.PEREMPUAN);
	}
	
	public void getAllMahasiswa()
	{
		System.out.println("\nDaftar mahasiswa " + this.toString() + "\n");
		for (int index = 0; index < mahasiswa.length; index++)
		{	
			if(mahasiswa[index] != null)
			{
				System.out.println("Nama		: " + mahasiswa[index].getNamaMahasiswa());
				System.out.println("NIM		: " + mahasiswa[index].getNim());
				System.out.println("Jenis Kelamin	: " + mahasiswa[index].getJenisKelamin().toString());
			}
			else
			{
				System.out.println("\nEnd of line.");
			}
			System.out.println();
		}
	}
	public Mahasiswa getMahasiswa(int index)
	{
		if(mahasiswa[index] != null)
		{
			return mahasiswa[index-1];
		}
		else
		{
			return mahasiswa[0];
		}
		
	}

	public void setMahasiswa(Mahasiswa mahasiswa, int index)
	{
		this.mahasiswa[index] = mahasiswa;
	}

}

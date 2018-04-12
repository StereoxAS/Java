public class Dashboard {
	
	private Waktu waktu = new Waktu();
	private Kelas2KS1 kelas2ks1 = new Kelas2KS1();
	private Jadwal2KS1 jadwal2KS1 = new Jadwal2KS1();
	private Jadwal2KS2 jadwal2KS2 = new Jadwal2KS2();
	private Jadwal2KS3 jadwal2KS3 = new Jadwal2KS3();
	//Kelas[] kelas = {new Kelas2KS1(), new Kelas2KS2()};
	
	
	void Show() {
		
		this.tampilkanSesi( waktu.getSesi());
		
	}
	
	private void tampilkanSesi( String sesi) 
	{
		System.out.println(waktu.getHariStr() + " " + sesi);
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| Ruang | Kelas |\tMatakuliah\t\t\t\t|               Dosen            |");
		System.out.println("--------------------------------------------------------------------------------------------------");
			for(int i=0; i<jadwal2KS1.getJadwal().length; i++) 
			{
				//if(kelas2ks1.jadwal[i] != null)
				if(jadwal2KS1.getJadwal(i) != null)
				{
					if((jadwal2KS1.getJadwal(i).getSesi() == sesi) && (jadwal2KS1.getJadwal(i).getHari() == waktu.getHariStr()) ) 
					{
					System.out.print("| ");
					System.out.print(jadwal2KS1.getJadwal(i).getRuang());
					System.out.print("   | ");
					System.out.print(jadwal2KS1.getJadwal(i).getKelas());
					System.out.print(" | ");
					System.out.print(jadwal2KS1.getJadwal(i).getMatkul());
					System.out.print("\t\t\t| ");
					System.out.print(jadwal2KS1.getJadwal(i).getDosen());
					}
				}
			}
	}
		
	}
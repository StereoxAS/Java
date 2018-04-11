public class Dashboard {
	
	private Waktu waktu = new Waktu();
	private Kelas2KS1 kelas2ks1 = new Kelas2KS1();
	Kelas[] kelas = {new Kelas2KS1(), new Kelas2KS2()};
	
	
	void Show() {
		
		this.tampilkanSesi( waktu.getSesi());
		
	}
	
	private void tampilkanSesi( String sesi) {
		System.out.println(waktu.getHariStr() + " " + sesi);
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("| Ruang | Kelas |\tMatakuliah\t\t\t\t|               Dosen            |");
		System.out.println("--------------------------------------------------------------------------------------------------");
				for(int i=0; i<kelas2ks1.jadwal.length; i++) {
			if(kelas2ks1.jadwal[i] != null) {
				if((kelas2ks1.jadwal[i].getSesi() == sesi) && (kelas2ks1.jadwal[i].getHari() == waktu.getHariStr()) ) {
					System.out.print("| ");
					System.out.print(kelas2ks1.jadwal[i].getRuang());
					System.out.print("   | ");
					System.out.print(kelas2ks1.jadwal[i].getKelas());
					System.out.print(" | ");
					System.out.print(kelas2ks1.jadwal[i].getMatkul());
					System.out.print("\t\t\t| ");
					System.out.print(kelas2ks1.jadwal[i].getDosen());
				}
			}
		}
	}
		
	}

public class MataKuliahList extends MataKuliah{
	private int totalMatkul;
	private MataKuliah mataKuliah[] = new MataKuliah[7];
	
	public MataKuliahList()
	{
		// TODO Auto-generated method stub
		totalMatkul=7;
		
		this.mataKuliah[0] = new MataKuliah("MK01","Pemrograman Berbasis Objek", 3, true);
		this.mataKuliah[1] = new MataKuliah("MK02","Pemrograman Berbasis Web", 3, false);
		this.mataKuliah[2] = new MataKuliah("MK03","Basis Data Lanjutan", 3, true);
		this.mataKuliah[3] = new MataKuliah("MK04","Komputasi Statistik", 3, false);
		this.mataKuliah[4] = new MataKuliah("MK05","Statistika Matematika II", 3, true);
		this.mataKuliah[5] = new MataKuliah("MK06","Analisis Regresi", 3, false);
		this.mataKuliah[6] = new MataKuliah("MK07","Survei Contoh", 3, false);
	}
	
	public MataKuliah getMatakuliah(int index) {
		return this.mataKuliah[index];
	}

	public void setMataKuliah(MataKuliah mataKuliah, int index) {
		this.mataKuliah[index] = mataKuliah;
	}
	

	public void getAllMatkul() {
		System.out.println("\tDaftar Mata Kuliah\n");
		//System.out.println("KodeMatkul\tNama Mata Kuliah");
		int i;
		for(i=0;i<totalMatkul;i++) {
			System.out.println("Kode Matkul      : " + mataKuliah[i].getKodeMatkul());
			System.out.println("Nama Mata Kuliah : " + mataKuliah[i].getNamaMataKuliah());
			System.out.println("SKS              : " + mataKuliah[i].getJumlahSKS());
			  System.out.print("keterangan       : ");
			if(isInti()) {
				System.out.println("Mata Kuliah Inti\n");
			}else {
				System.out.println("Bukan Mata Kuliah Inti\n");
			}
		}
		
	
	
	}


}


public class MataKuliah
{
	private String namaMataKuliah;
	private int jumlahSKS;
	private boolean isInti;
	private MataKuliah mataKuliah[];
	
	public MataKuliah()
	{
		this.generateListMataKuliah();
	}
	public MataKuliah(String namaMataKuliah, int jumlahSKS, boolean isInti)
	{
		this.namaMataKuliah = namaMataKuliah;
		this.jumlahSKS = jumlahSKS;
		this.isInti = isInti;
	}
	
	private void generateListMataKuliah()
	{
		// TODO Auto-generated method stub
		this.mataKuliah[0] = new MataKuliah("Pemrograman Berbasis Objek", 3, true);
		this.mataKuliah[1] = new MataKuliah("Pemrograman Berbasis Web", 3, false);
		this.mataKuliah[2] = new MataKuliah("Basis Data Lanjutan", 3, true);
		this.mataKuliah[3] = new MataKuliah("Komputasi Statistik", 3, false);
		this.mataKuliah[4] = new MataKuliah("Statistika Matematika 2", 3, true);
		this.mataKuliah[5] = new MataKuliah("Analisis Regresi", 3, false);
		this.mataKuliah[6] = new MataKuliah("Survei Contoh", 3, false);
	}
}

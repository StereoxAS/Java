
public class MataKuliah
{
	private String kodeMatkul;
	private String namaMataKuliah;
	private int jumlahSKS;
	private boolean isInti;
	
	public MataKuliah() {
		this.kodeMatkul= "belum diinput";
		this.namaMataKuliah = "belum diinput";
		this.jumlahSKS = 0;
		this.isInti = false;
	}
	
	public MataKuliah(String kodeMatkul, String namaMataKuliah, int jumlahSKS, boolean isInti)
	{
		this.kodeMatkul= kodeMatkul;
		this.namaMataKuliah = namaMataKuliah;
		this.jumlahSKS = jumlahSKS;
		this.isInti = isInti;
	}

	public String getKodeMatkul() {
		return kodeMatkul;
	}

	public void setKodeMatkul(String kodeMatkul) {
		this.kodeMatkul = kodeMatkul;
	}

	public String getNamaMataKuliah() {
		return namaMataKuliah;
	}

	public void setNamaMataKuliah(String namaMataKuliah) {
		this.namaMataKuliah = namaMataKuliah;
	}

	public int getJumlahSKS() {
		return jumlahSKS;
	}

	public void setJumlahSKS(int jumlahSKS) {
		this.jumlahSKS = jumlahSKS;
	}

	public boolean isInti() {
		return isInti;
	}

	public void setInti(boolean isInti) {
		this.isInti = isInti;
	}
	
	
		
}
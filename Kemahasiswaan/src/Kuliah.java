public class Kuliah 
{
	private String mataKuliah;
	private int jumlahSKS;
	
	public String getMataKuliah()
	{
		return mataKuliah;
	}
	public void setMataKuliah(String mataKuliah)
	{
		this.mataKuliah = mataKuliah;
	}
	public int getJumlahSKS()
	{
		return jumlahSKS;
	}
	public void setJumlahSKS(int jumlahSKS)
	{
		this.jumlahSKS = jumlahSKS;
	}
	public Kuliah(String mataKuliah, int jumlahSKS)
	{
		super();
		this.mataKuliah = mataKuliah;
		this.jumlahSKS = jumlahSKS;
	}
}

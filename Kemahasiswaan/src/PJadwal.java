
public class PJadwal {
	
	private String hari;
	private String sesi;
	private String ruang;
	private String kelas;
	private MataKuliah matkul;
	private Pegawai dosen;
	
	public PJadwal() 
	{
		this.hari="kosong";
		this.sesi="kosong";
		this.kelas="kosong";
		this.matkul=null;
		this.dosen=null;
	}
	
	public PJadwal(String hari, String sesi, String ruang, MataKuliah matkul, Pegawai dosen ) 
	{
		this.hari=hari;
		this.sesi=sesi;
		this.ruang=ruang;
		this.matkul=matkul;
		this.dosen=dosen;
	}
	
	
	
	public int getSesiNo()
	{
		return Integer.valueOf(this.sesi);
	}
	public String getSesi() {
		return sesi;
	}
	public void setSesi(String sesi) {
		this.sesi = sesi;
	}
	public String getHari() {
		return hari;
	}
	public void setHari(String hari) {
		this.hari = hari;
	}
	public String getRuang() {
		return ruang;
	}
	public void setRuang(String ruang) {
		this.ruang = ruang;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	public MataKuliah getMatkul() {
		return matkul;
	}
	public void setMatkul(MataKuliah matkul) {
		this.matkul = matkul;
	}
	public Pegawai getDosen() {
		return dosen;
	}
	public void setPegawai(Pegawai dosen) {
		this.dosen = dosen;
	}
	
}

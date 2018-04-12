
public class Pegawai implements PegawaiInterface
{	
	
	protected String idDosen;
	protected String namaPegawai;
	protected String nip;
	//protected String jabatan = "Undefined";
	//protected String posisi = "Undefined";
	//protected String spesialisasi = "Undefined";
	
	public Pegawai() {
		this.idDosen ="Undefined";
		this.namaPegawai = "Undefined";
		this.nip = "Undefined";
		//protected String jabatan = "Undefined";
	}
	
	public Pegawai(String idDosen, String namaPegawai, String nip)
	{
		super();
		this.idDosen = idDosen;
		this.namaPegawai = namaPegawai;
		this.nip = nip;
		//this.jabatan = "jabatan";
		//this.posisi = posisi;
	}

	public String getIdDosen() {
		return idDosen;
	}

	public void setIdDosen(String idDosen) {
		this.idDosen = idDosen;
	}

	public String getNamaPegawai()
	{
		return this.namaPegawai;
	}
	public void setNamaPegawai(String namaPegawai)
	{
		this.namaPegawai = namaPegawai;
	}
	public String getNip()
	{
		return this.nip;
	}
	public void setNip(String nip)
	{
		this.nip = nip;
	}
	
	/*
	public String getJabatan()
	{
		return this.jabatan;
	}
	public void setJabatan(String jabatan)
	{
		this.jabatan = jabatan;
	}
	public String getPosisi()
	{
		return this.posisi;
	}
	public void setPosisi(String posisi)
	{
		this.posisi = posisi;
	}
	
	@Override
	*/
	public void getDataPegawai()
	{
		// TODO Auto-generated method stub
		System.out.println("Id Dosen: " + getIdDosen());
		System.out.println("Nama	: " + getNamaPegawai());
		System.out.println("NIP		: " + getNip());
		//System.out.println("Jabatan		: " + getJabatan());
		//System.out.println("Posisi		: " + getPosisi());
		System.out.println("Institusi	:" + Pegawai.institusi);
	}
	
	
}
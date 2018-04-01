
public class Pegawai implements PegawaiInterface
{	
	protected String namaPegawai = "Undefined";
	protected String nip = "Undefined";
	protected String jabatan = "Undefined";
	protected String posisi = "Undefined";
	protected String spesialisasi = "Undefined";
	
	public Pegawai() {
		
	}
	
	public Pegawai(String namaPegawai, String nip, String posisi)
	{
		super();
		this.namaPegawai = namaPegawai;
		this.nip = nip;
		this.jabatan = "jabatan";
		this.posisi = posisi;
	}

	public Pegawai()
	{
		
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
	public void getDataPegawai()
	{
		// TODO Auto-generated method stub
		System.out.println("Nama		: " + getNamaPegawai());
		System.out.println("NIP		: " + getNip());
		System.out.println("Jabatan		: " + getJabatan());
		System.out.println("Posisi		: " + getPosisi());
		System.out.println("Institusi	:" + Pegawai.institusi);
	}
	
	
}

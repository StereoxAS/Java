import java.util.ArrayList;
import java.util.Date;

public class Pegawai
{
	private String kode;
	private String nama;
	private Date tglLahir;
	private ArrayList<String> noHP = new ArrayList<String>();
	private ArrayList<String> emailAddress = new ArrayList<String>();
	
	public Pegawai()
	{
		
	}
	public Pegawai(String kode, String nama)
	{
		this.kode = kode;
		this.nama = nama;
	}
	public void addNoHP(String noHP)
	{
		this.noHP.add(noHP);
	}
	
	public void addEmailAddress(String emailAddress)
	{
		this.emailAddress.add(emailAddress);
	}

	public String getKode()
	{
		return kode;
	}

	public void setKode(String kode)
	{
		this.kode = kode;
	}

	public String getNama()
	{
		return nama;
	}

	public void setNama(String nama)
	{
		this.nama = nama;
	}

	public Date getTglLahir()
	{
		return tglLahir;
	}

	public void setTglLahir(Date tglLahir)
	{
		this.tglLahir = tglLahir;
	}

	public ArrayList<String> getNoHP()
	{
		return this.noHP;
	}

	public void setNoHP(ArrayList<String> noHP)
	{
		this.noHP = noHP;
	}
	public ArrayList<String> getEmailAddress()
	{
		return emailAddress;
	}
	public void setEmailAddress(ArrayList<String> emailAddress)
	{
		this.emailAddress = emailAddress;
	}
}

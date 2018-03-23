
public class Jadwal 
{
	private String hari;
	private String sesi;
	private boolean pending;
	
	public Jadwal(String hari, String sesi, boolean pending) 
	{
		super();
		this.hari = hari;
		this.sesi = sesi;
		this.pending = pending;
	}

	public String getHari()
	{
		return hari;
	}

	public void setHari(String hari)
	{
		this.hari = hari;
	}

	public String getSesi()
	{
		return sesi;
	}

	public void setSesi(String sesi)
	{
		this.sesi = sesi;
	}

	public boolean isPending()
	{
		return pending;
	}

	public void setPending(boolean pending)
	{
		this.pending = pending;
	}	
}

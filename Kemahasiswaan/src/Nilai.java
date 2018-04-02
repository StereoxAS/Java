
public abstract class Nilai
{
	protected int nilaiAkhir;
	protected int nilaiSementara;
	protected int nilaiRemedial;
	
	public void calculateNilai()
	{
		if(this.nilaiSementara < 55)
		{
			this.nilaiAkhir = (nilaiSementara + nilaiRemedial) / 2;
			if(this.nilaiAkhir > 55)
			{
				this.nilaiAkhir = 55;
			}
		}
		else
		{
			this.nilaiAkhir = this.nilaiSementara;
		}
	}
	public int getNilai()
	{
		return this.nilaiAkhir;
	}
}

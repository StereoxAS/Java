
public class BangunDatarSegitiga extends BangunDatar
{
	private double alas;
	private double tinggi;
	private String jenisSegitiga;

	public double getAlas()
	{
		return alas;
	}

	public void setAlas(double alas)
	{
		this.alas = alas;
	}

	public double getTinggi()
	{
		return tinggi;
	}

	public void setTinggi(double tinggi)
	{
		this.tinggi = tinggi;
	}

	public String getJenisSegitiga()
	{
		return jenisSegitiga;
	}

	public void setJenisSegitiga(String jenisSegitiga)
	{
		this.jenisSegitiga = jenisSegitiga;
	}

	@Override
	double getLuas()
	{
		return 0.5 * this.alas * this.tinggi;
	}

	@Override
	double getKeliling()
	{
		// TODO Auto-generated method stub
		// TODO create decision for jeniSegitiga
		return 0;
	}

}

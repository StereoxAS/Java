
public class BangunDatarLingkaran extends BangunDatar
{
	private double jariJari;
	public static final double PHI = Math.PI;
	
	public double getJariJari()
	{
		return jariJari;
	}
	public void setJariJari(double jariJari)
	{
		this.jariJari = jariJari;
	}

	@Override
	double getLuas()
	{
		// TODO Auto-generated method stub
		return Math.PI * this.jariJari * this.jariJari;
	}

	@Override
	double getKeliling()
	{
		// TODO Auto-generated method stub
		return Math.PI * this.jariJari * 2;
	}
}

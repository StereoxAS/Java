public class Pembelian 
{
	private static String check;
	
	public static String getDetailPembelian()
	{
		return
				"Total pembelian anda adalah : "
			  + "1. Minecraft : 99000"
			  + "2. ML		  : 0    "
			  + "Total 	      : Rp99000";
	}

	public static String getCheck() 
	{
		return check;
	}

	public static void setCheck(String check) 
	{
		Pembelian.check = check;
	}
	
	
}
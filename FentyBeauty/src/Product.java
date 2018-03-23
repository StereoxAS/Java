
public class Product 
{
	private String eye;
	private String face;
	private String lip;
	
	public String getEye() 
	{
		return eye;
	}
	public void setEye(String eye) 
	{
		this.eye = eye;
	}
	public String getFace() 
	{
		return face;
	}
	public void setFace(String face) 
	{
		this.face = face;
	}
	public String getLip() 
	{
		return lip;
	}
	public void setLip(String lip) 
	{
		this.lip = lip;
	}
	public static void getProductDetails()
	{
		System.out.println("List	: \n\n"
						 + "1. Face\n"
						 + "2. Eye\n"
						 + "3. Lip\n");
	}
	
}

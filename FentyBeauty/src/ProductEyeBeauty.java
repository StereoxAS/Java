
public class ProductEyeBeauty 
{
	private String nameTag;
	private String descTag;
	private int priceTag;
	
	public ProductEyeBeauty(String nameTag, String descTag, String priceTag) 
	{
		// TODO buat constructor-nya 
	}
	public ProductEyeBeauty() 
	{
		//constructor kosong
		this.nameTag = "Nama EyeBeauty belum terisi.";
		this.descTag = "Deskripsi  EyeBeauty belum terisi.";
		this.priceTag = 0;
	}
	
	// List Eye make-up buat secukupnya
	// Tiap object (Eclipse/Galaxy) punya setter/getter masing2 juga supaya bisa diakses di class lain
	// Objek dibawah juga belum dikasih parameter buat ngisi Nama/Desc/Price nya
	
	static ProductEyeBeauty Eclipse = new ProductEyeBeauty(); //Eyeshadow Pallete 
	public static ProductEyeBeauty getEclipse() 
	{
		return Eclipse;
	}
	public static void setEclipse(ProductEyeBeauty eclipse) 
	{
		Eclipse = eclipse;
	}

	static ProductEyeBeauty Galaxy = new ProductEyeBeauty();  //2-in-1 Glitter Release Eyeliner	
	public static ProductEyeBeauty getGalaxy() 
	{
		return Galaxy;
	}
	public static void setGalaxy(ProductEyeBeauty galaxy) 
	{
		Galaxy = galaxy;
	}
	// Setter/Getter
	public String getNameTag() 
	{
		return nameTag;
	}
	public void setNameTag(String nameTag) 
	{
		this.nameTag = nameTag;
	}
	public String getDescTag() 
	{
		return descTag;
	}
	public void setDescTag(String descTag) 
	{
		this.descTag = descTag;
	}
	public int getPriceTag() 
	{
		return priceTag;
	}
	public void setPriceTag(int priceTag)
	{
		this.priceTag = priceTag;
	}	
}

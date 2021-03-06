public class ProductLipBeauty 
{
	private String nameTag;
	private String descTag;
	private int priceTag;
	
	public ProductLipBeauty(String nameTag, String descTag, int priceTag) 
	{
		this.nameTag = nameTag;
		this.descTag = descTag;
		this.priceTag = priceTag;
	}
	public ProductLipBeauty() 
	{
		this.nameTag = "Nama LipBeauty belum terisi.";
		this.descTag = "Deskripsi LipBeauty belum terisi.";
		this.priceTag = 0;
	}
	
	static ProductLipBeauty LipStick = new ProductLipBeauty();
	static ProductLipBeauty LipGloss = new ProductLipBeauty();
	
	public static ProductLipBeauty getLipStick() 
	{
		return LipStick;
	}
	public static void setLipStick(ProductLipBeauty lipStick) 
	{
		LipStick = lipStick;
	}
	public static ProductLipBeauty getLipGloss() 
	{
		return LipGloss;
	}
	public static void setLipGloss(ProductLipBeauty lipGloss) 
	{
		LipGloss = lipGloss;
	}
	
	
	//Setter getter
	public String getNameTag() {
		return nameTag;
	}
	public void setNameTag(String nameTag) {
		this.nameTag = nameTag;
	}
	public String getDescTag() {
		return descTag;
	}
	public void setDescTag(String descTag) {
		this.descTag = descTag;
	}
	public int getPriceTag() {
		return priceTag;
	}
	public void setPriceTag(int priceTag) {
		this.priceTag = priceTag;
	}
}

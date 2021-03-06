
public class ProductFaceBeauty 
{
	private String nameTag;
	private String descTag;
	private int priceTag;
	
	public ProductFaceBeauty(String nameTag, String descTag, int priceTag) 
	{
		this.nameTag = nameTag;
		this.descTag = descTag;
		this.priceTag = priceTag;
	}
	
	public ProductFaceBeauty() 
	{
		this.nameTag = "Nama FaceBeauty belum terisi.";
		this.descTag = "Deskripsi FaceBeauty belum terisi.";
		this.priceTag = 0;
	}
	
	static ProductFaceBeauty Foundation = new ProductFaceBeauty();
	static ProductFaceBeauty Primer = new ProductFaceBeauty();
	static ProductFaceBeauty Highlighter = new ProductFaceBeauty();
	static ProductFaceBeauty Brush = new ProductFaceBeauty();
	// Setter getter objek
	public static ProductFaceBeauty getFoundation() {
		return Foundation;
	}

	public static void setFoundation(ProductFaceBeauty foundation) {
		Foundation = foundation;
	}

	public static ProductFaceBeauty getPrimer() {
		return Primer;
	}

	public static void setPrimer(ProductFaceBeauty primer) {
		Primer = primer;
	}

	public static ProductFaceBeauty getHighlighter() {
		return Highlighter;
	}

	public static void setHighlighter(ProductFaceBeauty highlighter) {
		Highlighter = highlighter;
	}

	public static ProductFaceBeauty getBrush() {
		return Brush;
	}

	public static void setBrush(ProductFaceBeauty brush) {
		Brush = brush;
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

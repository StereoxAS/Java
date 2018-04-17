import java.util.ArrayList;

public abstract class Library
{
	private ArrayList<String> listPertanyaan = new ArrayList<>();
	
	public ArrayList<String> getListPertanyaan()
	{
		return this.listPertanyaan;
	}
	public abstract void generatePertanyaan();
	public abstract String getPertanyaan();
	public abstract void setPertanyaan();
}

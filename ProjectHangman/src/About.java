import java.util.*;

public class About
{
	private static List<String> contributor = new ArrayList<>();
	private static String copyright;
	private static String license;
	
	public static void setAbout()
	{
		About.contributor.add("1. Ahmad Syahid Ibnu Syarif");
		About.contributor.add("2. Alfian Khusnul Amar");
		About.contributor.add("3. Fenty Berliana Tifalny");
		About.contributor.add("4. Krishna Aji Satriatama");
		
		About.copyright = "Politeknik Statistika 2018";
		About.license = "Licensed under GNU license";
	}
	public static void printAbout()
	{
		About.setAbout();
		System.out.println("Credits");
		for (int i = 0; i < About.contributor.size(); i++)
		{
			System.out.println(About.contributor.get(i));
		}
		System.out.println("\n\n"
						 + About.getLicense() + "\n"
						 + About.getCopyright());
	}
	
	public static List<String> getContributor()
	{
		return contributor;
	}
	public static void setContributor(List<String> contributor)
	{
		About.contributor = contributor;
	}
	public static String getCopyright()
	{
		return copyright;
	}
	public static void setCopyright(String copyright)
	{
		About.copyright = copyright;
	}
	public static String getLicense()
	{
		return license;
	}
	public static void setLicense(String license)
	{
		About.license = license;
	}
}

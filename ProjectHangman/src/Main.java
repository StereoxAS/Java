import java.util.Scanner;

public class Main
{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		LibraryMahasiswa lib = new LibraryMahasiswa();
		
		while (true)
		{
			System.out.print(lib.getPertanyaan());
			Main.scan.nextLine();
		}
	}
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		
		try
		{
			String string = "input.txt"; // nama file untuk FileReader
			PrintWriter writer = new PrintWriter("log.txt", "UTF-8"); // print writer, gunanya untuk input dari Scanner ke file, namanya di parameter
			FileOutputStream fileOutputStream = new FileOutputStream("log.txt"); // sama kaya print writer, cuma formatnya binary
			FileReader fileReader = new FileReader(string); // membaca sebuah file, nama filenya ada di parameter
			BufferedReader bufferedReader = new BufferedReader(fileReader); // buat mengolah bacaan yang tadi dibaca oleh reader sebagai parameternya
			Scanner scan = new Scanner(System.in);
			String input = " ";
			
			while(!input.equalsIgnoreCase("quit"))
			{
				input = scan.nextLine();
				if(input.equalsIgnoreCase("quit"))
				{
					break;
				}
				writer.println(input);
			}
			
			while(input != null)
			{
				input = bufferedReader.readLine();
				if(input.equalsIgnoreCase(""))
				{	
					System.out.println(bufferedReader.readLine());
				}
				else
				{
					break;
				}
				
			}
			
			writer.close();
			fileOutputStream.close();
			scan.close();
			fileReader.close();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("File is not found.");
		} 
		catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Character type is not supported.");
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOException happened :(");
		}
		
	}
}
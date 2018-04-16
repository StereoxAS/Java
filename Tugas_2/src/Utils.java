import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Semua fungsi macem2 ke sini 
 * Credit : stackoverflow, krishna aji, anton r s, syahid ibnu
 */
public final class Utils
{
	private static String listOrder[] = new String[24];
	private static int listQty[] = new int[24];
	
	public static String capitalizeFirstChar(String string)
	{
		return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
	}
	
	public static void clrscr()
	{
	    //Clears Screen in java method
	    try 
	    {
	        if (System.getProperty("os.name").contains("Windows"))
	        {
	        	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        }	            
	        else
	        {
	        	Runtime.getRuntime().exec("clear");
	        }	            
	    } 
	    catch (IOException | InterruptedException ex)
	    {	
	    	//Error handling	    	
	    }
	}
	
	public static void exit()
	{
	    //Exit in java method
	    try 
	    {
	        if (System.getProperty("os.name").contains("Windows"))
	        {
	        	new ProcessBuilder("cmd", "/c", "taskkill /IM cmd.exe").inheritIO().start().waitFor();
	        }	            
	        else
	        {
	        	Runtime.getRuntime().exec("clear");
	        }	            
	    } 
	    catch (IOException | InterruptedException ex)
	    {	
	    	//Error handling	    	
	    }
	}
	
	public static int[] calcQuantity(String string[])
	{
		//reset quantity
		for (int i = 0; i < listQty.length; i++)
		{
			listQty[i] = 0;
		}
		
		listOrder[0] = "Double Beef Burger";
		listOrder[1] = "Meat & Meat";
		listOrder[2] = "Chicken BBQ";
		listOrder[3] = "Chicken Pepperoni Mushroom";
		listOrder[4] = "Beef Pepperoni Feast    ";
		listOrder[5] = "Tuna Delight      ";
		listOrder[6] = "American Classic Cheeseburger";
		listOrder[7] = "Italian Supreme";
		listOrder[8] = "Veggie Mania    ";
		listOrder[9] = "American All Star";
		listOrder[10] = "Chicken Lovers    ";
		listOrder[11] = "Cheese Mania    ";
		listOrder[12] = "Delicious Pepper Beef";
		listOrder[13] = "Extravaganzza";
		listOrder[14] = "Meatzza";
		listOrder[15] = "Beef Delight";
		listOrder[16] = "Cheesy Sausage";
		listOrder[17] = "Chicken Pepperoni Feast";
		listOrder[18] = "Margherita";
		listOrder[19] = "Sambal Beef";
		listOrder[20] = "Veggie Delight";
		listOrder[21] = "Chicken Rasher";
		listOrder[22] = "Pepper Chicken";
		listOrder[23] = "Beef Rasher";
		
		for (int i = 0; i < string.length; i++)
		{
			for (int j = 0; j < listOrder.length; j++)
			{
				if(string[i] == listOrder[j])
				{
					listQty[j] += 1;
				}				
			}
		}
		return listQty;
	}

	public static File readFile()
	{
		Scanner scan = new Scanner(System.in);
		String pathname = scan.nextLine();
		try
		{
			System.out.print("File yang mau di baca : ");
			BufferedReader read = new BufferedReader(new FileReader(new File(pathname)));
			
			while(read.ready())
			{
				System.out.println(read.readLine());
			}
			System.out.println("END OF FILE.");
			read.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("ERROR: File is not found.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		scan.close();
		
		return new File(pathname);
	}
}
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Utils
{
	public static HashMap<Integer,Integer> random = new HashMap<>();
	public static ArrayList<Integer> list = new ArrayList<>();
	public static Random rand = new Random();
	
	public static ArrayList<Integer> selectRandomNumber(ArrayList<Integer> list, int size)
	{
		ArrayList<Integer> order = new ArrayList<>();

		for (int i = 0; i < size; i++)
		{
			order.add(list.get(i));
		}
		return order;
	}
	public static ArrayList<Integer> generateUniqueSetOfRandomNumber(int maxValue)
	{
		list = new ArrayList<>();
		for (int i = 0; i < maxValue; i++)
		{
			Utils.list.add(new Integer(i));
		}
		Collections.shuffle(Utils.list);
		return Utils.list;
	}
	public static int absolute(int i)
	{
		int num = 0;
		if(i < 0)
		{
			num = i * -1;
		}
		return num;
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

}

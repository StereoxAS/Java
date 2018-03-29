<<<<<<< HEAD
import java.io.IOException;

/**
 * Semua fungsi macem2 ke sini 
 */
public final class Utils
{
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
=======
import java.io.IOException;

/**
 * Semua fungsi macem2 ke sini 
 */
public final class Utils
{
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
	        	new ProcessBuilder("cmd", "/c", "exit").inheritIO().start().waitFor();
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
>>>>>>> 369ae4c0fedc597390aa86c4359bb6488b1c747e
}
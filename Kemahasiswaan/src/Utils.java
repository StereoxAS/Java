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

	public static void homescreen()
	{
		try 
	    {
			boolean loop = true;
			while(loop)
			{
				Utils.clrscr();
				
				System.out.println("                                     S E L A M A T     D A T A N G     DI \r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"                      *************  **   ********         *         **********    **        **\r\n" + 
					"                     *************   **  **********       ***        ***********   **        **\r\n" + 
					"                     **              **  **      **      ** **       **        **  **        **\r\n" + 
					"                     **              **  **      **     **   **      **        **  **        **\r\n" + 
					"                     *************   **  **      **    *********     **        **  **        **\r\n" + 
					"                      *************  **  **********   ***********    **        **  **        **\r\n" + 
					"                                 **  **  *********   **         **   **        **  **        **\r\n" + 
					"                                 **  **  ***        **           **  **        **  **        **\r\n" + 
					"                      *************  **  ***        **           **  ***********   ************\r\n" + 
					"                     *************   **  ***        **           **  **********     ********** \r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"                          Copyright (c) 2017-2018 Sekolah Tinggi Ilmu Statistik (STIS)\r\n" + 
					"                                        Contact us: 16.9227@stis.ac.id");
				try        
				{
				    Thread.sleep(1200);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				
				System.out.println("                                     S E L A M A T     D A T A N G     DI \r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"                                ***        ***   **      **      **      ************* \r\n" + 
						"                                ***       ***    ***     **     ***       *************\r\n" + 
						"                                ***      ***     ***     **     ***                 ***\r\n" + 
						"                                ***     ***      ***     **     ***                 ***\r\n" + 
						"                                **********       ***     **     ***                 ***\r\n" + 
						"                                ***********      ***     **     ***       *************\r\n" + 
						"                                ***      ***     ***     **     ***      ************* \r\n" + 
						"                                ***       ***    ***     **     ***      ***           \r\n" + 
						"                                ***        ***    ****************   *   ************* \r\n" + 
						"                                ***         ***     ************    **   **************\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"                          Copyright (c) 2017-2018 Sekolah Tinggi Ilmu Statistik (STIS)\r\n" + 
						"                                        Contact us: 16.9227@stis.ac.id");
		
				try        
				{
				    Thread.sleep(1200);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				break;
			}	            
	    } 
	    catch (Exception e)
	    {	
	    	//Error handling	    	
	    	System.out.println("ERROR: Unexpected exception. Program is now terminating in 3 seconds.");
	    	try        
			{
			    Thread.sleep(3000);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
	    	Utils.exit();
	    }
	}
}
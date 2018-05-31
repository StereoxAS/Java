import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Account
{
	private String email;
	private String password;
	private String gateway;
	private String[] string;
	private HashMap<String, char[]> user = new HashMap<>();
	
	public static ArrayList<HashMap<String, char[]>> list = new ArrayList<>();
	
	
	
	public Account()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(new File("lib/library.txt")));
			while(reader.ready())
			{
				string = reader.readLine().split(" ");
				this.user.put(string[0], string[1].toCharArray());
				Account.list.add(user);
			}
			reader.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: File not found.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("ERROR: Unhandled IOException.");
		}
	}

	public void authenticate(String email, String password, String gateway)
	{
		
	}
	
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getGateway()
	{
		return gateway;
	}

	public void setGateway(String gateway)
	{
		this.gateway = gateway;
	}

	public ArrayList<HashMap<String, char[]>> getList()
	{
		return list;
	}

	public void setList(ArrayList<HashMap<String, char[]>> list)
	{
		Account.list = list;
	}
	
}

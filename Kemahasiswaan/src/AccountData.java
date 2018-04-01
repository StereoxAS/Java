
public class AccountData //extends Account 

{
	/*
	 * Database account Admin
	 */
	
	private Account admin[] = new Account[10];
	private int total;
	
	
	public AccountData() 
	{	
		total = 3;
		admin[0] = new Account("ibnoe","celalucendiri","The Dark Knight");
		admin[1] = new Account("satriatama","fentybeauty","Sang Dewa Biru");
		admin[2] = new Account("alfian","khunsnul","Alfian si Programmer");
	}
	public Account getAdmin(int index) 
	{
		return admin[index];
	}
	public void setAdmin(Account[] admin) 
	{
		this.admin = admin;
	}
	public int getTotal() 
	{
		return total;
	}
	public void setTotal(int total) 
	{
		this.total = total;
	}
}

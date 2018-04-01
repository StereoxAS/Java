//package pass;

 public class Account
 {
	private String username;
	private String password;
	private String idname;

	Account()
	{
		this.username="";
		this.password="";
		this.idname="";	
	}
	
	Account(String username, String password, String idname)
	{
		this.username=username;
		this.password=password;
		this.idname=idname;
	}
	

	
	public String getIdname() 
	{
		return idname;
	}
	public void setIdname(String idname) 
	{
		this.idname = idname;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Account newAccount(String username, String idname, String password)
	{
		return new Account(username, password, idname);
	}
	
	
	
}
 
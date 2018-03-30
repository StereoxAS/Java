
public class Restaurant
{
	private String propertyName;
	private String branch;
	private String branchNo;
	private String branchAddress;
	private String website;
	
	Restaurant(String propertyName, String branch, String branchNo, String branchAddress, String website)
	{
		this.propertyName = propertyName;
		this.branch = branch;
		this.branchNo = branchNo;
		this.branchAddress = branchAddress;
		this.website = website;
	}
	Restaurant()
	{
		this.propertyName = "Undefined";
		this.branch = "Undefined";
		this.branchNo = "Undefined";
		this.branchAddress = "Undefined";
		this.website = "Undefined";
	}
	public String getPropertyName()
	{
		return propertyName;
	}
	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	public String getBranchNo()
	{
		return branchNo;
	}
	public void setBranchNo(String branchNo)
	{
		this.branchNo = branchNo;
	}
	public String getBranchAddress()
	{
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress)
	{
		this.branchAddress = branchAddress;
	}
	public String getWebsite()
	{
		return website;
	}
	public void setWebsite(String website)
	{
		this.website = website;
	}
}

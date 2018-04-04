public class Restaurant 
{
    private String propertyName;
    private String branchName;
    private String branchNo;
    private String bAddress;
    private String website;
    
    Restaurant(String propertyName, String branchName,String branchNo, String bAddress, String website){
        this.propertyName = propertyName;
        this.branchName = branchName;
        this.branchNo = branchNo;
        this.bAddress =  bAddress; 
        this.website = website;
    }
    
    Restaurant()
    {
        this.propertyName = " ";
        this.branchName = " ";
        this.branchNo = " ";
        this.bAddress =  " "; 
        this.website = " ";
    }
    
    public String getPropertyName() 
    {
        return propertyName;
    }
    public void setPropertyName(String propertyName) 
    {
        this.propertyName = propertyName;
    }
    public String getBranchName() 
    {
        return branchName;
    }
    public void setBranchName(String branchName) 
    {
        this.branchName = branchName;
    }
    public String getBranchNo() 
    {
        return branchNo;
    }
    public void setBranchNo(String branchNo) 
    {
        this.branchNo = branchNo;
    }
    public String getbAddress() 
    {
        return bAddress;
    }
    public void setbAddress(String bAddress) 
    {
        this.bAddress = bAddress;
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

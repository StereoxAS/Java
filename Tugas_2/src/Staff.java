import java.util.Date;
/*
 * Finished
 */
public class Staff 
{
    public String staffNo;
    public String staffName;
    public Date date = new Date();
    
    @SuppressWarnings("deprecation")
	public int getCurrentHour()
    {
        return date.getHours();
    }
    
    @SuppressWarnings("deprecation")
	public Staff getStaff()
    {
        if (date.getHours() > 0 && date.getHours() <= 6)
        {
            staffNo = "S001";
            staffName = "Krishna";
        } 
        else if (date.getHours() > 6 && date.getHours() <= 12)
        {
            staffNo = "S002";
            staffName = "Berliana";
        }
        else if (date.getHours() > 12 && date.getHours() <= 18)
        {
            staffNo = "S003";
            staffName = "Aji";
        } 
        else if (date.getHours() > 18 && date.getHours() <= 24)
        {
            staffNo = "S004";
            staffName = "Fenty";
        }
        return this;
    }

	
    public String getStaffNo()
	{
		return staffNo;
	}

	public void setStaffNo(String staffNo)
	{
		this.staffNo = staffNo;
	}

	public String getStaffName()
	{
		return staffName;
	}

	public void setStaffName(String staffName)
	{
		this.staffName = staffName;
	}
    
}

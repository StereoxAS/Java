import java.util.*;

public class Payment 
{
   private MenuList menuList = new MenuList();
   private List<Double> bill = new ArrayList<Double>();
   private double total;
   
   public MenuList getMenu()
   {
		return menuList;
   }
   public void setMenu(MenuList menuList)
   {
	   this.menuList = menuList;
   }
   public List<Double> getBill()
   {
	   return bill;
   }
   public void setBill(List<Double> bill)
   {
	   this.bill = bill;
   }
   public double getTotal()
   {
	   return total;
   }
   public void setTotal(double total)
   {
	   this.total = total;
   }
   
   public Payment()
   {
	   this.total = 0;
   }

   public void setTotalBill(int index)
   {
       this.bill.add((double) menuList.getMenuPrice(index));
   }
   
   public double getTotalBill()
   {
	   for (int i = 0; i < bill.size(); i++)
	   {
		   this.total += bill.get(i);
	   }
	   return this.total;
   }
}
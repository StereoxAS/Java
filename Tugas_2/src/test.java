import java.util.ArrayList;
import java.util.List;

public class test
{
	public static void main(String[] args)
	{
		double x = 2.75;
		double y = 3.75;
		double z = 2.25;
		double total = 0;
		
		List<Double> bill = new ArrayList<Double>();
		
		bill.add(x);
		bill.add(y);
		bill.add(z);
		
		for (int i = 0; i < bill.size(); i++)
	    {
		   total += bill.get(i);
	    }
		System.out.println("Total : " + total);
	}
}
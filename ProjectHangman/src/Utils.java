import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Utils
{
	public static HashMap<Integer,Integer> random = new HashMap<>();
	public static ArrayList<Integer> list = new ArrayList<>();
	public static Random rand = new Random();
	
	public static ArrayList<Integer> generateSetOfRandomNumber(int size, int maxNumber)
	{
		for (int i = 0; i < size; i++)
		{	
			int randTrunc = Utils.absolute(Utils.rand.nextInt() % maxNumber) + 1;
			
			Utils.random.put(i, randTrunc);
		}
		for (int i = 0; i < Utils.random.size(); i++)
		{
			Utils.list.add(Utils.random.get(i));
		}
		return list;
	}
	public static int absolute(int i)
	{
		int num = 0;
		if(i < 0)
		{
			num = i * -1;
		}
		return num;
	}
}

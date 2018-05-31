
public class aduh
{
	int i = 1;
	int j = 1;
	public static void main(String[] args)
	{
		int x = 0;
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				x = x + ((i ^ 4) / (3+i*j));
			}
		}
		System.out.println(x);
	}
}

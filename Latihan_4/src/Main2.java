import java.util.HashMap;

public class Main2
{
	public static void main(String[] args)
	{
		/*
		 * Hash Map
		 * 
		 * Adds an element of Value to specific index of Key.
		 * keySet used to get all indexed Keys.
		 */
		HashMap<Integer, Pegawai> map = new HashMap<>();
		map.put(1, new Pegawai("001", "James"));
		map.put(2, new Pegawai("007", "Bond"));
		
		System.out.println(map.get(1).getNama() + " " + map.get(2).getNama());
		map.keySet();
	}
}

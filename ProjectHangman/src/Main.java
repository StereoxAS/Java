import java.util.Scanner;

public class Main
{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		
		PlayHangman.getInstance();
		PlayHangman game = PlayHangman.getGame();
		boolean repeat = true;
		game.setCategory("Mahasiswa");
		game.setDifficulty("Easy");
		
		while(repeat)
		{
			game.levelDetail();
			game.newGame();
		}
				
	}
}

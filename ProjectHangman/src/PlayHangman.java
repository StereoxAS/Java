import java.util.Scanner;

public class PlayHangman
{
	private static PlayHangman game = new PlayHangman();
	
	private int level = 1;
	private String difficulty;
	
	private String category;
	
	private String currentQuestion;
	private String currentGuess;
	boolean isCompleted = false;
	
	private Scanner scan = new Scanner(System.in);
	
	
	private PlayHangman()
	{
		
	}
	public static PlayHangman getInstance()
	{
		return PlayHangman.game;
	}
	
	public void levelDetail()
	{
		// TODO create template / layout in-game
		Utils.clrscr();
		System.out.print(
				"Level		: " + GameLevel.getGameLevel().getLevel() + "	\n" + 
				"Difficulty	: " + GameLevel.getGameLevel().getDifficulty() + "	\n" + 
				"Category	: " + getCategory() + "	\n" );
	}
	public void newGame()
	{
		LibraryMahasiswa lib = new LibraryMahasiswa();
		this.currentQuestion = lib.getPertanyaan();
		GameAssets.createInputField(this.currentQuestion);
		
		while(isCompleted == false)
		{
			Utils.clrscr();
			System.out.print("\n: ");
			this.currentGuess = scan.nextLine().toUpperCase();
			GameAssets.updateInputField(currentQuestion, this.currentGuess.charAt(0));
//			if(GameAssets.)
//			{
//				
//			}
		}
		GameLevel.getGameLevel().setLevel(GameLevel.getGameLevel().getLevel()+1);
	}
	public void nextLevel()
	{
		this.level++;
	}

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public String getDifficulty()
	{
		return difficulty;
	}

	public void setDifficulty(String difficulty)
	{
		this.difficulty = difficulty;
	}
	public String getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public static PlayHangman getGame()
	{
		return PlayHangman.game;
	}
	public static void setGame(PlayHangman game)
	{
		PlayHangman.game = game;
	}
}

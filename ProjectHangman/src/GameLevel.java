
public class GameLevel
{
	private int currentLevel;
	private int Level;
	private String difficulty;
	private double scoreMultiplier;
	
	private static GameLevel gameLevel = new GameLevel();
	
	public GameLevel()
	{
		this.Level = 1;
		this.currentLevel = 1;
		this.difficulty = "Normal";
		this.scoreMultiplier = 1.0;
	}

	public int getCurrentLevel()
	{
		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel)
	{
		this.currentLevel = currentLevel;
	}

	public int getLevel()
	{
		return Level;
	}

	public void setLevel(int level)
	{
		Level = level;
	}

	public String getDifficulty()
	{
		return difficulty;
	}

	public void setDifficulty(String difficulty)
	{
		this.difficulty = difficulty;
	}

	public double getScoreMultiplier()
	{
		return scoreMultiplier;
	}

	public void setScoreMultiplier(double scoreMultiplier)
	{
		this.scoreMultiplier = scoreMultiplier;
	}

	public static GameLevel getGameLevel()
	{
		return GameLevel.gameLevel;
	}

	public void setGameLevel(GameLevel gameLevel)
	{
		GameLevel.gameLevel = gameLevel;
	}
}

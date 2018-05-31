import java.util.HashMap;

public class GameAssets
{
	private static HashMap<Integer, Character> currentQuestion = new HashMap<>();
	private static HashMap<Integer, Character> currentGuess = new HashMap<>();
	private static int wordLeft;
	private static int guessLeft;
	
	//Question field generator
	public static void createInputField(String question)
	{
		GameAssets.wordLeft = 0;
		GameAssets.guessLeft = 0;
		for (int i = 0; i < question.length(); i++)
		{
			if(question.charAt(i) == ' ')
			{	
				GameAssets.currentGuess.put(i, ' ');
			}
			else
			{
				GameAssets.currentGuess.put(i, '_');
				GameAssets.wordLeft += 1;
			}
			System.out.print(GameAssets.currentGuess.get(i) + " ");
		}
	}
	//Question field input handler
	public static void updateInputField(String question, char guess)	
	{
		for (int i = 0; i < question.length(); i++)
		{
			GameAssets.currentQuestion.put(i, question.toUpperCase().charAt(i));
		}
		for (int i = 0; i < question.length(); i++)
		{
			if(GameAssets.currentQuestion.get(i).equals(guess))
			{
				GameAssets.currentGuess.put(i, guess);
				GameAssets.wordLeft -= 1;
			}
		}
		GameAssets.printCurrentGuess();
	}
	//Question field updater
	public static void printCurrentGuess()
	{
		System.out.println("Words left	:" + GameAssets.wordLeft);
		for (int i = 0; i < GameAssets.currentGuess.size(); i++)
		{
			System.out.print(GameAssets.currentGuess.get(i) + " ");
		}
	}
	
}

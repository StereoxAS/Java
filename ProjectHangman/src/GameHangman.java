
public class GameHangman
{
	private String guessingField[];
	private String questionChosen[];
	private int level = 1;
	
	public void newGame()
	{
		System.out.println("Hangman Level " + level);
		Library library = new LibraryMahasiswa();
		library.generatePertanyaan();
		library.getAQuestion();
	}
	
	public String[] getGuessingField()
	{
		return guessingField;
	}
	public void setGuessingField(String[] guessingField)
	{
		this.guessingField = guessingField;
	}
	public String[] getQuestionChosen()
	{
		return questionChosen;
	}
	public void setQuestionChosen(String[] questionChosen)
	{
		this.questionChosen = questionChosen;
	}
}

import java.util.ArrayList;

public class GameExperience
{
	private int experienceGain;
	private ArrayList<Integer> experienceGate = new ArrayList<>();
	private AccountLevel level = new AccountLevel();
	
	public GameExperience()
	{
		
	}

	public int getExperienceGain()
	{
		return experienceGain;
	}

	public void setExperienceGain(int experienceGain)
	{
		this.experienceGain = experienceGain;
	}

	public ArrayList<Integer> getExperienceGate()
	{
		return experienceGate;
	}

	public void setExperienceGate(ArrayList<Integer> experienceGate)
	{
		this.experienceGate = experienceGate;
	}

	public AccountLevel getLevel()
	{
		return level;
	}

	public void setLevel(AccountLevel level)
	{
		this.level = level;
	}
}

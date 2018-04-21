
public class Option
{
	private boolean enableMusic;
	private boolean enableSFX;
	private String language;
	
	public void updateOption()
	{
		if(this.enableMusic == true)
		{
			//TODO create music enabler
		}
		if(this.enableSFX == true)
		{
			//TODO create sfx enabler			
		}
		if(this.language.equalsIgnoreCase("english"))
		{
			//TODO change locale to english
		}
		else
		{
			//TODO change locale to indonesian			
		}
	}
	
	public boolean isEnableMusic()
	{
		return enableMusic;
	}
	public void setEnableMusic(boolean enableMusic)
	{
		this.enableMusic = enableMusic;
	}
	public boolean isEnableSFX()
	{
		return enableSFX;
	}
	public void setEnableSFX(boolean enableSFX)
	{
		this.enableSFX = enableSFX;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language)
	{
		this.language = language;
	}
	
	
}

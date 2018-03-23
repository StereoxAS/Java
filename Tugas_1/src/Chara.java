public class Chara
{
	private String name;
	private CharaGender gender;
	private CharaJob job;
	private CharaRace race;
	private CharaAttributes baseAttributes;
	private CharaAttributes genderAttributes;
	private CharaAttributes jobAttributes;
	private CharaAttributes raceAttributes;
	private CharaHMS charaHMS;

	public Chara(String name, CharaGender gender, CharaJob job, CharaRace race)
	{
		this.gender = gender;
		this.race = race;
		this.job = job;
		this.name = name;
		this.baseAttributes = new CharaAttributes(10);
		this.genderAttributes = CharaGender.generateAttributeBonus(gender);
		this.jobAttributes = CharaJob.generateAttributeBonus(job);
		this.raceAttributes = CharaRace.generateAttributeBonus(race);
		this.charaHMS = CharaHMS.generateCharaHMS(this);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public CharaGender getGender()
	{
		return gender;
	}

	public void setGender(CharaGender gender)
	{
		this.gender = gender;
		this.genderAttributes = CharaGender.generateAttributeBonus(gender);
	}

	public CharaJob getJob()
	{
		return job;
	}

	public void setJob(CharaJob job)
	{
		this.job = job;
		this.jobAttributes = CharaJob.generateAttributeBonus(job);
	}

	public CharaRace getRace()
	{
		return race;
	}

	public void setRace(CharaRace race)
	{
		this.race = race;
		this.raceAttributes = CharaRace.generateAttributeBonus(race);
	}

	public CharaAttributes getTotalAttributes()
	{
		return baseAttributes
			.sumWith(raceAttributes)
			.sumWith(genderAttributes)
			.sumWith(jobAttributes);
	}

	public CharaAttributes getBonusAttributes()
	{
		return raceAttributes
			.sumWith(genderAttributes)
			.sumWith(jobAttributes);
	}
	
	public CharaHMS getCharaHMS()
	{
		return charaHMS;
	}

	public CharaAttributes getBaseAttributes()
	{
		return this.baseAttributes;
	}

	public void setBaseAttributes(CharaAttributes attributes)
	{
		this.baseAttributes = attributes;
	}

	public String getCharaDescription()
	{
		return
		"[Character Overview]\n\n" +
		"Name		: " + this.name + "\n" +
		"Gender		: " + CharaGender.getName(this.gender) + "\n" +
		"Job		: " + CharaJob.getName(this.job) + "\n" +
		"Race		: " + CharaRace.getName(this.race) + "\n\n" +
		charaHMS.getHMSDetails() + 
		"\n[Total Attributes]\n" + 
		this.getTotalAttributes().getAttributeDescription() + "\n";
	}

	public String getAtributeDetails()
	{
		return
		"Total Attributes	: \n" +
		this.getTotalAttributes().getAttributeDescription() + "\n\n" +
		"Base Attributes		: \n" +
		this.baseAttributes.getAttributeDescription() + "\n\n" +
		"Total Bonus Attribute	: \n" +
		this.getBonusAttributes().getAttributeDescriptionIgnoreZero() + "\n\n" +
		"Class Bonus		: \n" +
		jobAttributes.getAttributeDescriptionIgnoreZero() + "\n\n" +
		"Racial Bonus		: \n" +
		raceAttributes.getAttributeDescriptionIgnoreZero() + "\n\n" +
		"Gender Bonus		: \n" +
		genderAttributes.getAttributeDescriptionIgnoreZero() + "\n";
	}
}
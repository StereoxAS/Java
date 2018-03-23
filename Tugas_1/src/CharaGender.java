public enum CharaGender 
{
	MALE,
	FEMALE;

	public static String getDescription(CharaGender gender)
	{
		switch (gender) 
		{
			case MALE:
				return
				"\nMales of the Realm can excel in whatever profession\n" +
				"they choose, whether wizardry, thievery, or the arts of war.\n\n" +
				"All males have +1 bonus to Strength.\n";
				
			case FEMALE:
				return
				"\nFemales of the Realm can excel in any areas they wish\n" +
				"and are easily the equal of their male counterparts\n" + 
				"in every skill or respect.\n\n" + 
				"All females have +1 bonus to Intelligence.\n";
			
			default:
				return "";
		}
	}

	public static CharaAttributes generateAttributeBonus(CharaGender gender)
	{
		switch (gender) 
		{
			//(int strength, int dexterity, int vitality, int inteligence, int wisdom, int charisma)
			case MALE:	
				return new CharaAttributes(1, 0, 0, 0, 0, 0);

			case FEMALE:
				return new CharaAttributes(0, 0, 0, 1, 0, 0);

			default:
				return new CharaAttributes(0, 0, 0, 0, 0, 0);
		}
	}

	public static String getName(CharaGender gender)
	{
		return Utils.capitalizeFirstChar(gender.name());
	}
}

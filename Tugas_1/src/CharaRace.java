public enum CharaRace
{
	HUMAN,
	ELF,
	ORC,
	GOBLIN,
	GNOME,
	HALFLING,
	DWARF,
	KHAJIIT,
	ARGONIAN;

	public static String getDescription(CharaRace race)
	{
		switch (race) 
		{
			case HUMAN:
				return
				"\nHumans are the most common race and rule most of\n" +
				"the civilizations of Faerun. They are generally considered the scale against\n" +
				"which the traits of other races are measured as weaker or stronger.\n" +
				"Unlike all other races, humans can pursue any course in life.\n" +
				"They could well be defined as privileged over other races, especially outcasts\n" +
				"such as half-orcs whose options in life are severely limited. Despite their\n" +
				"privilege, individual humans are no better or worse than members of any other\n" +
				"race and are generally kind and hospitable to their own and others.\n\n" +
				"All Human get +2 bonus to Vitality and Charisma.\n";

			case ELF:
				return
				"\nElves are generally considered one of the most beautiful races.\n" +
				"They are slightly shorter and more delicate than humans and are not as\n" +
				"hardy. Elves are a rare sight on the sword coast perhaps because they\n" +
				"prefer the wild to human cities. While they are well known as a cheerful\n" +
				"and frolicsome race many elves, especially drow, are as surly as dwarves\n" +
				"or as prideful as humans.\n" +
				"There are many racial divisions of elves: Gold elves, drow\n" +
				"(aka dark elves), moon elves, sea elves, wild elves, and winged elves\n"	+
				"(aka avariel). Elves are generally liked and even admired by humans\n" +
				"and are easily accepted into their society. The same cannot be said\n" +
				"for dwarves some of whom despise elves on principle.\n\n" +
				"All Elves get +2 bonus to Intelligence and Charisma.\n";

			case ORC:
				return
				"\nOrcs are violent, primitive humanoids that have plagued Faerun\n" +
				"for aeons, though the Orcgate Wars brought to Toril the fearsome gray\n" +
				"orcs which, while more civilized than their mountain orc kin, are just\n" +
				"as proficient and savage in combat. Interbreeding often results in\n" +
				"half-orc offspring among both humans and orc tribes, with the former\n" +
				"often being outcasts and the latter being even more harshly-treated,\n" +
				"often resulting in a poor outlook regarding civilization.\n\n" +
				"All Orcs get +3 bonus to Strength and +1 bonus to Dexterity.\n";

			case GOBLIN:
				return
				"\nGoblins are small, humanoid creatures that live across Tamriel.\n" +
				"They are often found living in clans, and appear to be somewhat related to mer.\n" +
				"Various cultures in Tamriel have enslaved Goblins from time to time\n" +
				"throughout history. The Tsaesci of Akavir reportedly brought goblins along\n" +
				"during their invasion of Tamriel as servants and Cannon Fodder.\n" +
				"The Altmer have similarly employed Goblins in this fashion at different\n" +
				"points in history.\n\n" +
				"All Goblins get +2 bonus to Dexterity and Intelligence.";

			case GNOME:
				return
				"\nGnomes are a small race, almost as short as halflings and more\n" +
				"finely built than dwarves. Gnomes have dark to tan skin and dark hair.\n" +
				"Dwarves are their distant cousins and they share the love of glittering\n" + 
				"things though gnomes have more affection and respect for the natural world\n" +
				"than dwarves do. Gnomes love jokes and are very clever; some might even\n" +
				"call them devious. Gnomes can be anything from fighters to illusionists\n" +
				"and are far more capable than they appear.\n\n" +
				"All Gnomes get +2 bonus to Dexterity and Wisdom.";

			case HALFLING:
				return
				"\nHalflings are short, generally plump people, very much like\n" +
				"small humans. Their faces are round and broad, and often quite florid.\n" +
				"Their hair is typically curly, and the tops of their feet are covered\n" +
				"with coarse hair. Overall they prefer the comforts of home to dangerous\n" +
				"adventuring. They enjoy good living, rough humor, and homespun tales.\n" +
				"There are three racial divisions of halflings within\n" +
				"the Realms: the hairfoot, tallfellow, and stout.\n\n" + 
				"All Halflings get +4 bonus to Dexterity.\n";

			case DWARF:
				return
				"\nDwarves are short and stocky, easily identifiable by their size\n" +
				"and shape. They have ruddy cheeks, dark eyes, and dark hair.\n" +
				"Dwarves tend to be dour and taciturn. They are given to hard work,\n" +
				"and care little for most humor. They enjoy beer, ale, mead, but most of all,n" +
				"they love gold. There are four racial divisions of dwarves within\n" +
				"the Realms: shield dwarves, gold dwarves, wild dwarves, and duergar.\n\n" +
				"All Dwarves get +3 bonus to Vitality and +1 bonus to Strength.\n";

			case KHAJIIT:
				return
				"\nKhajiit are one of the ten default playable races in The Elder Scrolls.\n" +
				"They are one of the beast races which inhabit the continent of Tamriel, primarily\n" +
				"their home province of Elsweyr. They are known for their natural agility, stealth,\n" +
				"and their production of Moon Sugar, which can be refined into skooma.\n" +
				"They travel around selling their wares but are not usually trusted, due to\n" +
				"the racial prejudice of many of the races in Tamriel, resulting possibly from\n" +
				"the belief that most Khajiit are thieves.\n\n" +
				"All Khajiit get +3 bonus to Charisma and +1 bonus to Wisdom.\n";

			case ARGONIAN:
				return
				"\nArgonians or Saxhleel are an oviparous race of reptilian people native to\n" +
				"the large and marshy province known as Black Marsh, a region of Tamriel. They can\n" +
				"be found in smaller numbers throughout the continent, and have been featured in\n" +
				"every one of the main games thus far. Argonians are one of the few races completely\n" +
				"unrelated to men and mer, being descended directly from the Hist.\n\n" +
				"All Argonian get +3 bonus to Strength and +1 bonus to Vitality.\n";
			
			default:
				return "";
		}
	}

	public static CharaAttributes generateAttributeBonus(CharaRace race)
	{
		switch (race) 
		{
			//(int strength, int dexterity, int vitality, int inteligence, int wisdom, int charisma)
			case HUMAN:
				return new CharaAttributes(0, 0, 2, 0, 0, 2);

			case ELF:
				return new CharaAttributes(0, 0, 0, 2, 0, 2);

			case ORC:
				return new CharaAttributes(3, 1, 0, 0, 0, 0);

			case GOBLIN:
				return new CharaAttributes(0, 2, 0, 2, 0, 0);

			case GNOME:
				return new CharaAttributes(0, 2, 0, 0, 2, 0);

			case HALFLING:
				return new CharaAttributes(0, 4, 0, 0, 0, 0);

			case DWARF:
				return new CharaAttributes(1, 0, 3, 0, 0, 0);

			case KHAJIIT:
				return new CharaAttributes(0, 0, 0, 0, 1, 3);

			case ARGONIAN:
				return new CharaAttributes(3, 0, 1, 0, 0, 0);

			default:
				return new CharaAttributes(0, 0, 0, 0, 0, 0);
		}
	}

	public static String getName(CharaRace race)
	{
		return Utils.capitalizeFirstChar(race.name());
	}
}
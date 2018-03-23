public enum CharaJob
{
	FIGHTER,
	RANGER,
	PALADIN,
	CLERIC,
	DRUID,
	MAGE,
	THIEF,
	BARD,
	SORCERER,
	MONK,
	BARBARIAN;

	public static String getDescription(CharaJob job)
	{
		switch (job) 
		{
			case FIGHTER:	
				return
				"\nThe Fighter is a champion, swordsman, swordswoman, soldier, and brawler who lives or dies by \n"
				+ "the knowledge of weapons and tactics. Fighters can be found at the front of any battle, \n"
				+ "contesting toe-to-toe with monsters and villains.\n" +
				"A good Fighter needs to be strong and healthy if hopes to survive.\n\n" +
				"Fighters have +2 bonus to Strength and Vitality\n";

			case RANGER:
				return
				"\nThe Ranger is a warrior and a woodsman who is skilled with weapons and is knowledgeable in the ways of the forest.\n" +
				"The Ranger often protects and guides lost travelers and honest peasant-folk.\n" +
				"A Ranger needs to be strong and wise to the ways of nature to live a full life.\n\n" + 
				"Rangers have + 1 bonus to Strength, Dexterity, Vitality, and Wisdom.\n";

			case PALADIN:
				return
				"\nA Paladin is a warrior bold and pure, the exemplar of everything good and true.\n" +
				"Like the Fighter, the Paladin is a person of action and combat.\n" + 
				"However, the Paladins live for the ideals of righteousness, justice, honesty, piety,\n" +
				"and chivalry and strive to be a living example of these virtues so that others \n"
				+"may learn from them as well as gain by their actions.\n\n" +
				"Paladins have +2 bonus to Strength and Charisma\n";

			case CLERIC:
				return
				"\nThe Cleric is a generic priest (of any mythos) who tends to the spiritual needs of a community.\n" +
				"Though Clerics are both protectors and healers, they are not purely defensive - when evil threatens,\n" +
				"the Clerics are well suited to seek ti out an its own ground and destroy it.\n" +
				"The opposite is true of evil Clerics as well, and there are also many variations in between.\n\n" +
				"Clerics have +4 bonus to Wisdom.\n";
			
			case DRUID:
				return
				"\nThe Druids serve the cause of nature and neutrality, the wilderness is their community,\n" +
				"and they use their special powers to protect it and to preserve balance in the world.\n\n" +
				"Druids have +2 bonus to Dexterity and Wisdom.\n";

			case MAGE:
				return
				"\nThe wizard strives to be a master of magical energies, shaping them and casting them as spells.\n" +
				"To do so, they study strange tongues and obscure facts and devotes much of their time to magical research.\n" +
				"A wizard must rely on knowledge and wit to survive. Wizards are rarely seen adventuring without a retinue of fighters and men-at-arms.\n" +
				"Because there are different types (or schools) of magic there are different types of wizards.\n" +
				"The Mages study all types of magic and learn a wide variety of spells, their broad range makes them well suited to the demands of adventuring.\n\n" +
				"Mages have +4 bonus to Intelligence.\n";

			case THIEF:
				return
				"\nTo accomplish one's goals, for good or ill, the Thief is a skilled pilferer.\n" +
				"Cunning, nimbleness, and stealth are a thief's hallmarks.\n" +
				"Whether a thief turns talent against innocent passersby and wealthy merchants or oppressors and\n" +
				"monsters is a choice for the Thief to make.\n\n" +
				"Thieves have +4 bonus to Dexterity.\n";

			case BARD:
				return
				"\nThe Bard is a rogue, but is very different from the Thief. \n" +
				"The Bards' strength is their pleasant and charming personality. \n" +
				"With it and their wits, they make their way through the world. \n" +
				"Bards are talented musicians and walking storehouses of gossip, tall tales, and \n" +
				"lore, they learn a little bit about everything that crosses their paths and are jack-of -all-trades but master of none.\n" +
				"While many Bards are scoundrels, their stories and songs are welcome almost everywhere.\n\n" +
				"Bards have +1 bonus to Dexterity, +1 bonus to Intelligence, and +2 bonus to Charisma.\n";

			case SORCERER:
				return
				"\nSorcerers are practitioners of magic who are born with the innate ability to cast spells.\n" + 
				"It is thought that the blood of some powerful creature flows through their veins;\n" +
				"perhaps they are the spawn of the gods themselves, or even dragons walking in humanoid form.\n" +
				"Regardless, the Sorcerer's magic is intuitive rather than logical.\n" +
				"They know fewer spells than Mages, and acquire spells more slowly, but they can cast spells more often and\n" +
				"have no need to select and prepare spells ahead of time. Sorcerers cannot specialize in magic the way Mages do.\n" +
				"Other than these differences, a Sorcerer is very similar to a Mage.\n\n" + 
				"Sorcerers have +4 bonus to Charisma.";

			case MONK:
				return
				"\nMonks are warriors who pursue perfection through contemplation as well as action. \n" +
				"They are versatile fighters, especially skilled in combat without weapons or armor.\n" +
				"Though Monks cannot cast spells, they have a unique magic of their own: they channel a subtle energy, called ki, " +
				"which allows them to perform amazing feats.\n"
				+ "The Monk's best known feat is their ability to stun an opponent with an unarmed blow.\n\n" +
				"Monks have +2 bonus to Dexterity and Vitality.\n";

			case BARBARIAN:
				return 
				"\nBarbarians can be excellent warriors.\n" + 
				"While not as disciplined or as skilled as a normal fighter, \n" + 
				"the barbarian can willingly throw himself into a berserker rage, becoming a tougher and stronger opponent. \n" + 
				"Barbarians can't use plate mail armor, like the other warrior classes.\n\n" +
				"Barbarians have +4 bonus to Strength.\n";
			
			default:
				return "";
		}
	}

	public static CharaAttributes generateAttributeBonus(CharaJob job)
	{
		switch (job) 
		{
			//(strength, dexterity, vitality, inteligence, wisdom, charisma)
			case FIGHTER:	
				return new CharaAttributes(2, 0, 2, 0, 0, 0);

			case RANGER:
				return new CharaAttributes(1, 1, 1, 0, 1, 0);

			case PALADIN:
				return new CharaAttributes(2, 0, 0, 0, 0, 2);

			case CLERIC:
				return new CharaAttributes(0, 0, 0, 0, 4, 0);
			
			case DRUID:
				return new CharaAttributes(0, 2, 0, 0, 2, 0);

			case MAGE:
				return new CharaAttributes(0, 0, 0, 4, 0, 0);

			case THIEF:
				return new CharaAttributes(0, 4, 0, 0, 0, 0);

			case BARD:
				return new CharaAttributes(0, 1, 0, 1, 0, 2);

			case SORCERER:
				return new CharaAttributes(0, 0, 0, 0, 0, 4);

			case MONK:
				return new CharaAttributes(0, 2, 2, 0, 0, 0);

			case BARBARIAN:
				return new CharaAttributes(4, 0, 0, 0, 0, 0);
			
			default:
				return new CharaAttributes(0, 0, 0, 0, 0, 0);
		}
	}

	public static String getName(CharaJob job)
	{
		return Utils.capitalizeFirstChar(job.name());	
	}
}
import java.util.*;

public class Main
{
	
	public static void main(String[] args) 
	{
		/*
		 * Buat character creation-nya.
		 * Nama 	-> Input
		 * Gender	-> Pilihan
		 * Job 		-> Pilihan
		 * Race 	-> Pilihan
		 * Max. 8 characters.
		 * 
		 * Race description belum ada class-nya. 
		 * Gender description juga belum ada
		 */
		
		String nama = "Undefined";
		String genderString;
		String jobString;
		String raceString;
		CharaGender gender = null;
		CharaJob job = null;
		CharaRace race = null;
		String yes;
		char tidakJelas = 'y';
		boolean bool = false;
		int i, count = 0;

		Scanner scan = new Scanner(System.in);
		List<Chara> newChara = new ArrayList<Chara>();

		Utils.clrscr();
		System.out.println("Dungeon and Dragons Character Creation\n\n");
		
		System.out.print("How many characters do you want to create? : ");
		count = scan.nextInt();

		for(i = 0; i < count; i++) 
		{
			bool = false;
			while(bool == false)
			{
				Utils.clrscr();
				System.out.println("Dungeon and Dragons Character Creation\n\n");
				
				System.out.print("Enter your name [" + (i + 1) + "/" + count + "] :");
				nama = scan.next();
				System.out.println("\n" + nama + ", is that true ? [Y/N]");
				yes = scan.next();
				if(yes.equalsIgnoreCase("Y"))
				{
					bool = true;
				}
				else
				{
					bool = false;
				}
			}
			
			
			bool = false;
			while(bool == false)
			{
				Utils.clrscr();
				System.out.println("Dungeon and Dragons Character Creation\n\n");			
				System.out.println("1. MALE");
				System.out.println(CharaGender.getDescription(CharaGender.MALE));
				System.out.println("2. FEMALE");
				System.out.println(CharaGender.getDescription(CharaGender.FEMALE));
				System.out.println("Select your gender : ");
				genderString = scan.next();
				
				if(genderString.equalsIgnoreCase("Male") || genderString.equalsIgnoreCase("1"))
				{
					gender = CharaGender.MALE;
					break;
				}
				else if(genderString.equalsIgnoreCase("Female") || genderString.equalsIgnoreCase("2"))
				{
					gender = CharaGender.FEMALE;
					break;
				}
				else
				{
					System.out.println("There's no such gender.");
				}
			}
						
			while(bool == false)
			{
				Utils.clrscr();
				System.out.println("Dungeon and Dragons Character Creation\n\n");
				System.out.println(""
								 + "1. Human\n"
								 + "2. Elves\n"
								 + "3. Orcs\n"
								 + "4. Goblin\n"
								 + "5. Gnome\n"
								 + "6. Halfling\n"
								 + "7. Dwarves\n"
								 + "8. Khajiit\n"
								 + "9. Argonian\n");
				
				System.out.print("Select your Race : ");
				raceString = scan.next();
				if(raceString.equalsIgnoreCase("Human"))
				{
					race = CharaRace.HUMAN; tidakJelas = 'y';
				}
				else if(raceString.equalsIgnoreCase("Elves"))
				{
					race = CharaRace.ELF; tidakJelas = 'y';
				}
				else if(raceString.equalsIgnoreCase("Orcs"))
				{
					race = CharaRace.ORC; tidakJelas = 'y';
				}
				else if(raceString.equalsIgnoreCase("Goblin"))
				{
					race = CharaRace.GOBLIN; tidakJelas = 'y';
				}
				else if(raceString.equalsIgnoreCase("Gnome"))
				{
					race = CharaRace.GNOME; tidakJelas = 'y';
				}
				else if(raceString.equalsIgnoreCase("Halfling") || raceString.equalsIgnoreCase("Hobbit"))
				{
					race = CharaRace.HALFLING; tidakJelas = 'y';
				}
				else if(raceString.equalsIgnoreCase("Dwarves"))
				{
					race = CharaRace.DWARF; tidakJelas = 'y';
				}
				else if(raceString.equalsIgnoreCase("Khajiit"))
				{
					race = CharaRace.KHAJIIT; tidakJelas = 'y';
				}
				else if(raceString.equalsIgnoreCase("Argonian"))
				{
					race = CharaRace.ARGONIAN; tidakJelas = 'y';
				}
				else
				{
//					System.out.println("There's no such race. "
//							+ "\nMake sure you enter race's Name correctly instead of the number.\n");
					tidakJelas = 'n';
				}
				if(tidakJelas == 'y' || tidakJelas == 'Y')
				{
					System.out.println(CharaRace.getDescription(race));
					System.out.println("\nSelect " + raceString + "? [Y/N]");
					yes = scan.next();
					if(yes.equalsIgnoreCase("Y"))
					{
						bool = true;
					}
				}				
			}

			bool = false;
			while(bool == false)
			{
				Utils.clrscr();
				System.out.println("Dungeon and Dragons Character Creation\n\n");			
				System.out.println("Class : \n\n"
								 + "1. Barbarian\n"
								 + "2. Bard\n"
								 + "3. Cleric\n"
								 + "4. Druid\n"
								 + "5. Fighter\n"
								 + "6. Mage\n"
								 + "7. Monk\n"
								 + "8. Paladin\n"
								 + "9. Ranger\n"
								 + "10. Sorcerer\n"
								 + "11. Thief\n");
				
				System.out.print("Select your class : ");
				jobString = scan.next();
				
				if(jobString.equalsIgnoreCase("Barbarian"))
				{
					job = CharaJob.BARBARIAN; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Bard"))
				{
					job = CharaJob.BARD; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Cleric"))
				{
					job = CharaJob.CLERIC; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Druid"))
				{
					job = CharaJob.DRUID; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Fighter"))
				{
					job = CharaJob.FIGHTER; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Mage"))
				{
					job = CharaJob.MAGE; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Monk"))
				{
					job = CharaJob.MONK; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Paladin"))
				{
					job = CharaJob.PALADIN; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Ranger"))
				{
					job = CharaJob.RANGER; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Sorcerer"))
				{
					job = CharaJob.SORCERER; tidakJelas = 'y';
				}
				else if(jobString.equalsIgnoreCase("Thief"))
				{
					job = CharaJob.THIEF; tidakJelas = 'y';
				}
				else
				{
					//System.out.println("There's no such class.");
					tidakJelas = 'n';
				}
				
				if( tidakJelas == 'y')
				{
					System.out.println(CharaJob.getDescription(job));
					System.out.println("\nSelect " + jobString + "? [Y/N]");
					yes = scan.next();
					if(yes.equalsIgnoreCase("Y"))
					{
						bool = true;
					}
				}				
			}
			
			newChara.add(new Chara(nama, gender, job, race));
		}
		
		Utils.clrscr();
		System.out.println("Dungeon and Dragons Character Creation\n\n");
		
		
		for(i = 0; i < count; i++)
		{
			System.out.println("[" + (i + 1) + "/" + count + "]");
			System.out.println(newChara.get(i).getCharaDescription());
		}

		scan.close();
  	}
}
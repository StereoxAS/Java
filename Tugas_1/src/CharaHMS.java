import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CharaHMS 
{
	private int health;
	private int mana;
	private int stamina;
	private int speed;
	private double magicLevel;
	private double miracleLevel;
	NumberFormat format = new DecimalFormat("#0");
	
	public CharaHMS()
	{
		this.health = 0;
		this.mana = 0;
		this.stamina = 0;
		this.speed = 0;
		this.magicLevel = 0;
		this.miracleLevel = 0;
	}
	public CharaHMS(Chara chara) 
	{
		chara.getTotalAttributes().getStrength();
		chara.getTotalAttributes().getDexterity();
		chara.getTotalAttributes().getVitality();
		chara.getTotalAttributes().getInteligence();
		chara.getTotalAttributes().getWisdom();
		chara.getTotalAttributes().getCharisma();
		
		this.health = 0 + 
					chara.getTotalAttributes().getStrength()*3 + 
					chara.getTotalAttributes().getVitality()*7;
		this.mana = -15 + 
					chara.getTotalAttributes().getInteligence()*3 + 
					chara.getTotalAttributes().getWisdom()*2 ;
		this.stamina = 0 + 
					chara.getTotalAttributes().getStrength()*2 + 
					chara.getTotalAttributes().getDexterity()*1;
		this.speed = 100 + (100 * chara.getTotalAttributes().getDexterity())/100;
		this.magicLevel = 0 + Math.ceil(
					chara.getTotalAttributes().getInteligence()/6 +
					chara.getTotalAttributes().getCharisma()/11 );
		this.miracleLevel = 0 + Math.ceil( 
					chara.getTotalAttributes().getWisdom()/6 + 
					chara.getTotalAttributes().getCharisma()/11 );
	}
	public String getHMSDetails()
	{
		return "[Statistics]\n\n"
				+ "Health		: " + this.health + "\n"
				+ "Mana		: " + this.mana + "\n"
				+ "Stamina		: " + this.stamina + "\n"
				+ "Speed		: " + this.speed + "\n"
				+ "Magic Level	: " + format.format(this.magicLevel) + "\n"
				+ "Miracle Level	: " + format.format(this.miracleLevel) + "\n";
	}
	public static CharaHMS generateCharaHMS(Chara chara)
	{
		return new CharaHMS(chara);
	}
	public int getHealth()	{
		return health;
	}
	public void setHealth(int health)	{
		this.health = health;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getMagicLevel() {
		return magicLevel;
	}
	public void setMagicLevel(int magicLevel) {
		this.magicLevel = magicLevel;
	}
	public double getMiracleLevel() {
		return miracleLevel;
	}
	public void setMiracleLevel(int miracleLevel) {
		this.miracleLevel = miracleLevel;
	}
	
	
	
}

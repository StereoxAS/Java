public class test1 {
	public static void main(String[] args) {
		Chara chara1 = new Chara("Wiwin", CharaGender.FEMALE, CharaJob.SORCERER, CharaRace.ELF);

		System.out.println(chara1.getCharaDescription());
		System.out.println(chara1.getAtributeDetails());
  }
}
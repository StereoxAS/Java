public class Game 
{
		String GameName;
		String Developer;
		int Price;
		String Category;
		
		Game()
		{
			this.GameName="-";
			this.Developer="-";
			this.Price=0;
			this.Category="-";
		}
		
		
		public Game(String GameName, String Developer, int Price, String Category) 
		{
			this.GameName=GameName;
			this.Developer=Developer;
			this.Price=Price;
			this.Category=Category;
		}


		public String getGameName() {
			return GameName;
		}
		public void setGameName(String gameName) {
			GameName = gameName;
		}
		public String getDeveloper() {
			return Developer;
		}
		public void setDeveloper(String developer) {
			Developer = developer;
		}
		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price;
		}
		public String getCategory() {
			return Category;
		}
		public void setCategory(String category) {
			Category = category;
		}
		public static void getGameDetail(Game game) 
		{
				System.out.println("Game Name: "+game.getGameName());
				System.out.println("Game Category: "+game.getCategory());
				System.out.println("Game Price: "+game.getPrice());
				System.out.println("Game Developer: "+game.getDeveloper());	
		}		
}

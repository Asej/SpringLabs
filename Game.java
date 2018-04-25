package springlab.SpringLabs;

public class Game {
String gName,gGenre;
Double gRating;
	public Game(String name,String genre, Double rating) {
		// TODO Auto-generated constructor stub
		gName = name;
		gGenre = genre;
		gRating = rating;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game one = new Game("Mario","action",4.5);
		Game two = new Game("Yoshi","action",4.3);
		Game three = new Game("Star wars","fps",2.5);
		Game four = new Game("Timmy turner","rpg",4.5);
		Game five = new Game("Gundam","action",4.5);
		for (int i = 0; i < args.length; i++) {
			
		}
	}

}

package tetris;

public class Tetris {
	
	public static void main(String[] args) {
		GameController game = new GameController();
		System.out.println("Bienvenidos a Tetris!");
		System.out.println("Puntuacion inical: " + game.currentScore());
		
		game.dropPiece();
		System.out.println("Puntuacio: " + game.currentScore());
		
	}

}

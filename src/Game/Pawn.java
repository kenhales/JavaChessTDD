package Game;

public class Pawn extends Piece {
	
	public Square GetMovesFrom(int xCoordinate, int yCoordinate) {
		return new Square(xCoordinate, yCoordinate + 1);
	}
}

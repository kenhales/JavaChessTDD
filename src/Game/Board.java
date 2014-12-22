package Game;

public class Board {
	private Piece[][] pieces = new Piece[8][8];
	
	public void addPiece(Piece piece, int xCoordinate, int yCoordinate) {
		pieces[xCoordinate][yCoordinate] = piece;
	}
	
	public Piece getPiece(int xCoordinate, int yCoordinate) {
		return pieces[xCoordinate][yCoordinate];
	}
}

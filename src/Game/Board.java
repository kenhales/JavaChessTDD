package Game;

public class Board {
	
	public static int BoardColumns = 8;
	public static int BoardRows = 8;
	
	private Piece[][] pieces = new Piece[BoardColumns][BoardRows];
	
	public void addPiece(Piece piece, BoardCoordinate coordinate) {
		pieces[coordinate.getXCoordinate()][coordinate.getYCoordinate()] = piece;
	}
	
	public Piece getPiece(BoardCoordinate coordinate) {
		return pieces[coordinate.getXCoordinate()][coordinate.getYCoordinate()];
	}
}

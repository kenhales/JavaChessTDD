package Game;

public class Pawn extends Piece {
	
	public BoardCoordinate[] getPossibleMoves(BoardCoordinate coordinate) {
		if (coordinate.getYCoordinate() == 1) {
			return new BoardCoordinate[] {
					new BoardCoordinate(coordinate.getXCoordinate(), coordinate.getYCoordinate() + 1),
					new BoardCoordinate(coordinate.getXCoordinate(), coordinate.getYCoordinate() + 2),
					};
		} else {
			return new BoardCoordinate[] { new BoardCoordinate(coordinate.getXCoordinate(), coordinate.getYCoordinate() + 1) };
		}
	}
}

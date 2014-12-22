package Tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

import Game.*;

public class BoardTest {

	private Board target;
	private Pawn pawn;
	
	@Before
	public void setup() {
		target = new Board();
		pawn = new Pawn();
	}
	
	@Test
	public void boardShouldNotThrowExceptionWhenPieceAddedToUnoccupiedSquare() {
		target.addPiece(pawn,  new BoardCoordinate(2, 1));
	}
	
	@Test
	public void boardShouldRetrieveSamePieceAsWasPlaced() {
		target.addPiece(pawn, new BoardCoordinate(1, 1));
		Assert.assertEquals(pawn, target.getPiece(new BoardCoordinate(1, 1)));
	}
	
	@Test
	public void pawnPossibleMovesShouldReturnOneCandiateWhenOnRow2() {
		target.addPiece(pawn,  new BoardCoordinate(2, 2));
		BoardCoordinate[] possibleMoves = pawn.getPossibleMoves(new BoardCoordinate(2, 2));
		assertEquals(1, possibleMoves.length);
	}

	@Test
	public void pawnPossibleMovesShouldReturn_2_3_WhenOn_2_2() {
		target.addPiece(pawn, new BoardCoordinate(2, 2));
		BoardCoordinate[] possibleMoves = pawn.getPossibleMoves(new BoardCoordinate(2, 2));
		BoardCoordinate[] expected = new BoardCoordinate[] { new BoardCoordinate(2, 3) };
		assertTrue(areSetOfCoordinatesSame(expected, possibleMoves));
	}
	
	@Test
	public void pawnPossibleMovesShouldReturnTwoCandiatesWhenOnRow1() {
		target.addPiece(pawn,  new BoardCoordinate(2, 1));
		BoardCoordinate[] possibleMoves = pawn.getPossibleMoves(new BoardCoordinate(2, 1));
		BoardCoordinate[] expected = new BoardCoordinate[] {
				new BoardCoordinate(2, 2),
				new BoardCoordinate(2, 3) };
		assertTrue(areSetOfCoordinatesSame(expected, possibleMoves));
	}
	
	private boolean areSetOfCoordinatesSame(BoardCoordinate[] expected, BoardCoordinate[] actual) {
		if (expected == null || actual == null || expected.length != actual.length) {
			return false;
		}
		
		Arrays.sort(expected);
		Arrays.sort(actual);
		return Arrays.equals(expected, actual);	
	}
}

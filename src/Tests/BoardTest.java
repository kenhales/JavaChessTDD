package Tests;

import static org.junit.Assert.*;

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
		target.addPiece(pawn,  2,  1);
	}
	
	@Test
	public void boardShouldRetrieveSamePieceAsWasPlaced() {
		target.addPiece(pawn, 1, 1);
		Assert.assertEquals(pawn, target.getPiece(1, 1));
	}
	
	@Test
	public void pawnPossibleMoveShouldReturn_2_3_WhenOn_2_2() {
		target.addPiece(pawn,  2,  2);
		Square possibleMoves = pawn.GetMovesFrom(2,  2);
		assertEquals(2, possibleMoves.getXCoordinate());
		assertEquals(3, possibleMoves.getYCoordinate());
	}
}

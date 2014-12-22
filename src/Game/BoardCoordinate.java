package Game;

public class BoardCoordinate implements Comparable<BoardCoordinate> {
	private int xCoordinate;
	private int yCoordinate;
	
	public BoardCoordinate(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public void setXCoordinate(int value) {
		xCoordinate = value;
	}
	
	public int getXCoordinate() {
		return xCoordinate;
	}
	
	public void setYCoordinate(int value) {
		yCoordinate = value;
	}
	
	public int getYCoordinate() {
		return yCoordinate;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = obj != null
				&& obj.getClass().equals(BoardCoordinate.class)
				&& ((BoardCoordinate)obj).getXCoordinate() == xCoordinate
				&& ((BoardCoordinate)obj).getYCoordinate() == yCoordinate;
		
		return result;
	}

	@Override
	public int compareTo(BoardCoordinate o) {
		if (o == null || !o.getClass().equals(BoardCoordinate.class)) {
			return -1;
		}
		
		int otherIndex = o.getXCoordinate() * Board.BoardColumns + o.getYCoordinate();
		int thisIndex = xCoordinate * Board.BoardColumns + yCoordinate;
		
		return otherIndex == thisIndex ? 0 : otherIndex > thisIndex ? 1 : -1;
	}
}

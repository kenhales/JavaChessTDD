package Game;

public class Square {
	private int xCoordinate;
	private int yCoordinate;
	
	public Square(int xCoordinate, int yCoordinate) {
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
}

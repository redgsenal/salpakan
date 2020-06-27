package game.exceptions;

import pieces.Position;


public class InvalidBoardYCoordinate extends InvalidBoardCoordinate {
	private static final long serialVersionUID = 7558893524121917914L;
	private static final String ERR_MSG = "Invalid Y Coordinate";
	
	public InvalidBoardYCoordinate() {
		super(ERR_MSG);
	}
	
	public InvalidBoardYCoordinate(String msg) {
		super(ERR_MSG + " " + msg);
	}
	
	public InvalidBoardYCoordinate(Position pos) {
		super(ERR_MSG + " " + pos);
	}
	
	public InvalidBoardYCoordinate(int y) {
		super(ERR_MSG + " " + y);
	}
	
	public InvalidBoardYCoordinate(int x, int y) {
		super(ERR_MSG + " (x: " + x + ", y: " + y + ")");
	}
}

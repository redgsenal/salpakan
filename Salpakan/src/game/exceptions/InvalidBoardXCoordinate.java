package game.exceptions;

import pieces.Position;


public class InvalidBoardXCoordinate extends InvalidBoardCoordinate {
	private static final long serialVersionUID = 7558893524121917914L;
	private static final String ERR_MSG = "Invalid X Coordinate";
	
	public InvalidBoardXCoordinate() {
		super(ERR_MSG);
	}

	public InvalidBoardXCoordinate(Position pos) {
		super(ERR_MSG + pos);
	}
	
	public InvalidBoardXCoordinate(int x) {
		super(ERR_MSG + " x: " + x);
	}
	
	public InvalidBoardXCoordinate(int x, int y) {
		super(ERR_MSG + " (x: " + x + " y: " + y + ")");
	}
}

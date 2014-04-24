package game.exceptions;

import pieces.Position;


public class InvalidBoardCoordinate extends BoardException {
	private static final long serialVersionUID = -8221388280137837208L;
	private static final String ERR_MSG = "Invalid Board Coodinates";
	public InvalidBoardCoordinate() {
		super(ERR_MSG);
	}
	public InvalidBoardCoordinate(String msg) {
		super(ERR_MSG + " " + msg);
	}
	
	public InvalidBoardCoordinate(Position pos) {
		super(ERR_MSG + pos);
	}
	
}

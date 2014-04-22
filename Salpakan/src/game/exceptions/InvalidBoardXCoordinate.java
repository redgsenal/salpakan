package game.exceptions;


public class InvalidBoardXCoordinate extends BoardException {
	private static final long serialVersionUID = 7558893524121917914L;
	public InvalidBoardXCoordinate() {
		super("Invalid X Coordinate");
	}
}

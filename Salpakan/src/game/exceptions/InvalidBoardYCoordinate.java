package game.exceptions;


public class InvalidBoardYCoordinate extends BoardException {
	private static final long serialVersionUID = 7558893524121917914L;
	public InvalidBoardYCoordinate() {
		super("Invalid Y Coordinate");
	}
}

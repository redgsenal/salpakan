package game.exceptions;


public class InvalidBoardCoordinate extends BoardException {
	private static final long serialVersionUID = -8221388280137837208L;
	public InvalidBoardCoordinate() {
		super("Invalid board coodinate");
	}
	public InvalidBoardCoordinate(String msg) {
		super(msg);
	}
}

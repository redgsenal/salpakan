package game.exceptions;


public class PositionOccupiedException extends BoardException {
	private static final long serialVersionUID = -2366560117610605111L;	
	public PositionOccupiedException() {
		super("Invalid position, position already occupied");
	}
}

package game.exceptions;

import pieces.Position;


public class PositionOccupiedException extends BoardException {
	private static final long serialVersionUID = -2366560117610605111L;	
	
	public PositionOccupiedException(Position p){
		super("Invalid position, position already occupied " + p.toString());
	}
	public PositionOccupiedException() {
		super("Invalid position, position already occupied");
	}
}

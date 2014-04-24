package game.exceptions;

import pieces.Position;
import pieces.TilePosition;


public class PositionOccupiedException extends BoardException {
	private static final long serialVersionUID = -2366560117610605111L;	
	private static final String ERR_MSG = "Position Already Occupied at ";
	public PositionOccupiedException() {
		super(ERR_MSG);
	}
	public PositionOccupiedException(Position p){
		super(ERR_MSG + p.toString());
	}
	public PositionOccupiedException(TilePosition tp) {
		super(ERR_MSG + tp);
	}
}

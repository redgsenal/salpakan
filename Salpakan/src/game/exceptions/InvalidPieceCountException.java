package game.exceptions;

import pieces.TilePiece;

public class InvalidPieceCountException extends BoardException {
	
	private static final long serialVersionUID = -6055630298203880724L;
	
	private static final String ERR_MSG = "Invalid Piece Count. Exceed allowed count. ";
	
	public InvalidPieceCountException() {
		super(ERR_MSG);
	}
	public InvalidPieceCountException(TilePiece p) {
		super(ERR_MSG + p.toString());
	}
	
}

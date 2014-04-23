package game.exceptions;

import pieces.TilePiece;

public class InvalidPieceCountException extends BoardException {
	
	private static final long serialVersionUID = -6055630298203880724L;
	
	public InvalidPieceCountException() {
		super("invalid piece count");
	}
	public InvalidPieceCountException(TilePiece p) {
		super("invalid piece count: " + p.toString());
	}
	
}

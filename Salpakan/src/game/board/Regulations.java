package game.board;

import pieces.Position;
import pieces.TilePiece;

public interface Regulations {

	public void clearing(Position p);
	public void proclame(Position p, TilePiece piece);
	public void occupy(Position p, TilePiece piece);
}

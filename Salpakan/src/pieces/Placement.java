package pieces;

import game.exceptions.PositionOccupiedException;

public interface Placement {

	public void clear() throws PositionOccupiedException;
	public void occupy(TilePiece tilePiece) throws PositionOccupiedException;
	public TilePiece proclaim(TilePiece challenger, TilePiece defender);
	public boolean isOccupied();
}

package pieces;

import game.exceptions.PositionOccupiedException;
import game.player.Player;

public interface Placement {

	public void clear() throws PositionOccupiedException;
	public void occupy(Player player, TilePiece tilePiece) throws PositionOccupiedException;
	public TilePiece proclaim(TilePiece challenger, TilePiece defender);
	public boolean isOccupied();
}

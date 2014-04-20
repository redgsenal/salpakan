package game.board;

import pieces.TilePiece;
import game.player.Player;

public interface Regulations {

	public void clearPositions();
	public void switchTurn();
	public void stepBack();
	public boolean hasWinner();
	public Player getWinner();
	public void setMove();
	public void removePiece(Player player, TilePiece piece);
	
}

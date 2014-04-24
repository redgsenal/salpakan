package game.exceptions;

import game.player.Player;
import pieces.TilePosition;

public class InvalidInitialTilePiecePosition extends BoardException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -793406539720415840L;

	public InvalidInitialTilePiecePosition() {
		// TODO Auto-generated constructor stub
	}

	public InvalidInitialTilePiecePosition(Player p, TilePosition tp) {
		super("Invalid Initial postion.  Please check player's starting order and position : " + p + "| is starting player: " + p.isStartingPlayer() + " " + tp );
	}
}

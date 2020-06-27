package game.board;

import pieces.Position;
import pieces.TilePiece;
import pieces.TilePosition;

import java.util.List;

import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.InvalidPieceCountException;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

public interface BoardActions {

	public void clearPositions();
	public void switchTurn();
	public void stepBack();
	public boolean hasWinner();
	public Player getWinner();
	public void setMove();
	public void removePiece(Player player, TilePiece piece);
	public void removePiece(Position position);
	public void initialPiecePlayerPosition(Player p, List<TilePosition> startingPositions) throws InvalidBoardCoordinate, PositionOccupiedException, InvalidPieceCountException;
	void setTilePiecePosition(TilePiece tilePiece, int x, int y) throws InvalidBoardCoordinate, PositionOccupiedException;
	
}
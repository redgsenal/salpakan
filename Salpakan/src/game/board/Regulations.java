package game.board;

import java.util.Map;

import pieces.Position;
import pieces.TilePiece;
import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

public interface Regulations {

	public void clearPositions();
	public void switchTurn();
	public void stepBack();
	public boolean hasWinner();
	public Player getWinner();
	public void setMove();
	public void removePiece(Player player, TilePiece piece);
	public void removePiece(Position position);
	public void initialPiecePlayerPosition(Player p, Map<Position, TilePiece> startingPositions) throws InvalidBoardCoordinate, PositionOccupiedException;
	void setTilePiecePosition(TilePiece tilePiece, int x, int y) throws InvalidBoardCoordinate, PositionOccupiedException;
	
}
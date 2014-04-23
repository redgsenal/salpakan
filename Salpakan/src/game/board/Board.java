package game.board;

import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import pieces.Position;
import pieces.TilePiece;
import utils.Constant;

public class Board implements BoardActions {
	private Map<Map<Position, TilePiece>, Player> tilePiecePlayerMap = new HashMap<Map<Position, TilePiece>, Player> ();
	private Player p1;
	private Player p2;

	public Board() {
	}

	public Board(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public void switchTurn() {
		// should only have 2 players
		p1.setTurn(p2.isTurn());
		p2.setTurn(!p2.isTurn());
	}

	@Override
	public void stepBack() {
		// TODO Auto-generated method stub
	}

	@Override
	public Player getWinner() {
		// check if each player has flag captured
		if (isPlayerFlagCaptured(p1))
			return p2;
		if (isPlayerFlagCaptured(p2))
			return p1;
		return null;
	}

	private boolean isPlayerFlagCaptured(Player p) {
		for (TilePiece piece : p.getPieces()) {
			if (piece.isFlagCaptured())
				return true;
		}
		return false;
	}

	@Override
	public void setMove() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean hasWinner() {
		return (getWinner() != null);
	}

	@Override
	public void removePiece(Player player, TilePiece piece) {
		if (player.getPieces().contains(piece))
			piece.capturePiece();
	}

	@Override
	public void removePiece(Position position) {
	}

	@Override
	public void initialPiecePlayerPosition(Player p, Map<Position, TilePiece> startingPositions) throws InvalidBoardCoordinate, PositionOccupiedException {
		ArrayList<Position> pos = p.initialPiecePositions(startingPositions);
		for (Position position : pos) {			
		}
	}
	
	@Override
	public void setTilePiecePosition(TilePiece tilePiece, int x, int y) throws InvalidBoardCoordinate, PositionOccupiedException {
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Board pieces and coordinates: ");
		return sb.toString();
	}

	@Override
	public void clearPositions() {
	}
}
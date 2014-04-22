package game.board;

import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import pieces.Position;
import pieces.TilePiece;
import utils.Constant;
import utils.X;

public class Board implements Regulations {
	private ArrayList<Position> positions = Constant.initializePositions();
	private ArrayList<Player> players = new ArrayList<Player>();
	private Player p1;
	private Player p2;

	public Board() {
	}

	public Board(Player p1, Player p2) {
		players.add(p1);
		players.add(p2);
		this.p1 = p1;
		this.p2 = p2;

	}

	@Override
	public void clearPositions() {
		for (Position p : positions) {
			p.clear();
		}
	}

	@Override
	public void switchTurn() {
		// should only have 2 players
		Player p1 = players.get(0);
		Player p2 = players.get(1);
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
		piece.getPosition().clear();
	}

	@Override
	public void removePiece(Position position) {
		position.clear();
	}

	@Override
	public void initialPiecePlayerPosition(Player p, Map<Position, TilePiece> startingPositions) throws InvalidBoardCoordinate {
		ArrayList<Position> pos = p.initialPiecePositions(startingPositions);
		for (Position position : pos) {
			setTilePiecePosition(position.getTilePiece(), position.getX(), position.getY());
		}
	}

	@Override
	public void setTilePiecePosition(TilePiece tilePiece, int x, int y) throws InvalidBoardCoordinate{
		for (Position pos : positions) {
			if (pos.getX() == x && pos.getY() == y){
				try {
					pos.setTilePiece(tilePiece);
				} catch (PositionOccupiedException e) {
					X.log("error setting tile piece in position");
					e.printStackTrace();
				}
			}
		}
	}
}
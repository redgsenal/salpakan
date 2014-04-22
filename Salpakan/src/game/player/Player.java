package game.player;

import game.exceptions.PositionOccupiedException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import pieces.Position;
import pieces.TilePiece;
import utils.Constant;

public class Player implements PlayerActions {

	private String name;
	private boolean isWinner = false;
	private boolean isActive = false;
	private boolean isTurn = false;
	private static ArrayList<TilePiece> pieces = Constant.initializePieces();

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isTurn() {
		return isTurn;
	}

	public void setTurn(boolean isTurn) {
		this.isTurn = isTurn;
	}

	public ArrayList<TilePiece> getPieces() {
		return pieces;
	}

	@Override
	public ArrayList<Position> initialPiecePositions(Map<Position, TilePiece> startingPositions) {
		Iterator<Entry<Position, TilePiece>> itr = startingPositions.entrySet().iterator();
		ArrayList<Position> positions = new ArrayList<Position>(); 
		while(itr.hasNext()){
			Entry<Position, TilePiece> nxt = itr.next();
			TilePiece itemPiece = nxt.getValue();
			Position pos = nxt.getKey();
			if (pieces.contains(itemPiece)){
				int indx = pieces.indexOf(itemPiece);
				TilePiece playerPiece = pieces.get(indx);
				try {
					pos.setTilePiece(playerPiece);
					positions.add(pos);
				} catch (PositionOccupiedException e) {
					e.printStackTrace();
				}
			}
		}
		return positions;
	}
}

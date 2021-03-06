package game.player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import pieces.Position;
import pieces.TilePiece;
import utils.Utils;

public class Player implements PlayerActions {

	private String name = "noname";
	private boolean isWinner = false;
	private boolean isActive = false;
	private boolean isTurn = false;
	private boolean startingPlayer = false;
	private static ArrayList<TilePiece> pieces = Utils.initializePieces();

	public Player() {
	}

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

	public void initializeStartUpPieces() {
		pieces = Utils.initializePieces();
	}

	@Override
	public ArrayList<Position> initialPiecePositions(Map<Position, TilePiece> startingPositions) {
		Iterator<Entry<Position, TilePiece>> itr = startingPositions.entrySet().iterator();
		ArrayList<Position> positions = new ArrayList<Position>();
		while (itr.hasNext()) {
			Entry<Position, TilePiece> nxt = itr.next();
			TilePiece itemPiece = nxt.getValue();
			Position pos = nxt.getKey();
			if (pieces.contains(itemPiece)) {
				positions.add(pos);
			}
		}
		return positions;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Player){
			Player p = (Player) obj;
			return p.getName().equalsIgnoreCase(this.name);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Player: " + this.name;
	}

	public boolean isStartingPlayer() {
		return startingPlayer;
	}

	public void setStartingPlayer(boolean startingPlayer) {
		this.startingPlayer = startingPlayer;
	}
	
}
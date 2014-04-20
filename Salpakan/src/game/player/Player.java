package game.player;

import java.util.ArrayList;

import pieces.TilePiece;
import utils.Constant;

public class Player {

	private String name;
	private boolean isWinner = false;
	private boolean isActive = false;
	private boolean isTurn = false;	
	private ArrayList<TilePiece> pieces = Constant.initializePieces();
	
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

	public void setPieces(ArrayList<TilePiece> pieces) {
		this.pieces = pieces;
	}
}

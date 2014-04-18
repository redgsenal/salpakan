package pieces;

import java.util.ArrayList;

/**
 * Tile holds the information about the tile and its value
 * 
 * @author Reggie Senal
 * 
 */
public class TilePiece implements Comparable<TilePiece>, TileContest, Cloneable {

	private String name = "noname";
	private int value = 0;
	private Position p;
	private boolean isActive = false;
	private ArrayList<Integer> lesserRanks;

	public TilePiece(String name, int value, ArrayList<Integer> lesserRanks) {
		this.name = name;
		this.value = value;
		this.p = new Position();
		this.isActive = true;
		this.setLesserRanks(lesserRanks);
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public Position getPosition() {
		return p;
	}

	@Override
	public int compareTo(TilePiece o) {
		if (this.value == o.value)
			return 0;
		return ((this.value > o.value) ? 1 : -1);
	}

	@Override
	public void challenge(TilePiece opponent) {
		setActive(this.value > opponent.value);
	}

	@Override
	public TilePiece getWinner(TilePiece opponent) {
		if (this.getValue() == opponent.getValue()){
			this.topple();
			opponent.topple();
			return null;
		}
			
		if (this.getLesserRanks().contains(opponent)) {
			opponent.topple();
			return this;
		}
		this.topple();
		return opponent;
	}

	@Override
	public void topple() {
		setActive(false);
	}

	public boolean isActive() {
		return isActive;
	}

	private void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public ArrayList<Integer> getLesserRanks() {
		return lesserRanks;
	}

	public void setLesserRanks(ArrayList<Integer> lesserRanks) {
		this.lesserRanks = lesserRanks;
	}

	@Override
	public String toString() {
		return "tile piece: " + this.name;
	}
}

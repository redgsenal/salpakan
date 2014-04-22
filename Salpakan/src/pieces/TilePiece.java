package pieces;

import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.InvalidBoardXCoordinate;
import game.exceptions.InvalidBoardYCoordinate;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

import java.util.ArrayList;

import utils.Constant;

/**
 * Tile holds the information about the tile and its value
 * 
 * @author Reggie Senal
 * 
 */
public class TilePiece implements Comparable<TilePiece>, TileContest, Cloneable {

	private String name = "noname";
	private int value = 0;
	private Position position;
	private boolean isActive = false;
	private ArrayList<Integer> lesserRanks;
	private Player player;
	private boolean isCaptured;

	public TilePiece(String name, int value, ArrayList<Integer> lesserRanks, Player p) throws InvalidBoardCoordinate, PositionOccupiedException{
		this(name, value, lesserRanks);
		this.player = p;
	}

	public TilePiece(String name, int value, ArrayList<Integer> lesserRanks) {
		this.name = name;
		this.value = value;
		this.isActive = true;
		this.setLesserRanks(lesserRanks);
		
		try {
			this.position = new Position();
		} catch (InvalidBoardXCoordinate e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidBoardYCoordinate e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PositionOccupiedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public Position getPosition() {
		return position;
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
		if (this.getValue() == opponent.getValue()) {
			//if both are flags, challenger is the winner 
			if (this.getValue() == Constant.FLAG_VALUE){
				opponent.topple();
				return this;
			}
			
			this.topple();
			opponent.topple();
			return null;
		}

		if (this.getLesserRanks().contains(opponent.getValue())) {
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

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public boolean isCaptured() {		
		return this.isCaptured;
	}

	@Override
	public boolean isFlag() {
		return this.getValue() == Constant.FLAG_VALUE;
	}
	
	public boolean isFlagCaptured(){
		return this.isFlag() && this.isCaptured;
	}

	public void capturePiece() {
		this.isCaptured = true;
	}
	
	
}
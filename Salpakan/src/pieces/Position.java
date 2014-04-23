package pieces;

import utils.Constant;
import game.exceptions.InvalidBoardXCoordinate;
import game.exceptions.InvalidBoardYCoordinate;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

/**
 * Coordinate relative to the board
 * 
 * @author Reggie Senal
 * 
 */
public class Position {

	private int x;
	private int y;	

	public Position() throws InvalidBoardXCoordinate, InvalidBoardYCoordinate, PositionOccupiedException {
		setPosition(0, 0);
	}

	public Position(int x, int y) throws InvalidBoardXCoordinate, InvalidBoardYCoordinate, PositionOccupiedException {
		setPosition(x, y);
	}

	public Position(int x, int y, Player p, TilePiece tilePiece) throws 
							InvalidBoardXCoordinate, InvalidBoardYCoordinate, 
							PositionOccupiedException {
		setPosition(x, y);
	}

	public void setPosition(int x, int y) throws InvalidBoardXCoordinate, 
													InvalidBoardYCoordinate {
		
		if (x < 0 || x > Constant.MAX_BOARD_X)
			throw new InvalidBoardXCoordinate();
		
		if (y < 0 || y > Constant.MAX_BOARD_Y)
			throw new InvalidBoardYCoordinate();
		
		x = (x < 0) ? 0 : ((x > Constant.MAX_BOARD_X) ? Constant.MAX_BOARD_X
				: x);
		y = (y < 0) ? 0 : ((y > Constant.MAX_BOARD_Y) ? Constant.MAX_BOARD_Y
				: y);
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {		
		return "Position (x, y): " + x + ", " + y + " ";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Position){
			Position p = (Position) obj;
			return ((this.x == p.x) && (this.y == p.y));
		}
		return false;
	}
}

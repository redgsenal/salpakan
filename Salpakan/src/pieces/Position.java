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

/*
 *  Y
 *  | -------------------------------------
 *  8 |1,8|   |   |   |   |   |   |   |   |
 *    -------------------------------------
 * 	7 |1,7|   |   |   |   |   |   |   |   |
 *    -------------------------------------
 * 	6 |1,6|   |   |   |   |   |   |   |   |
 *    -------------------------------------
 * 	5 |1,5|   |   |   |   |   |   |   |   |
 *    -------------------------------------
 * 	4 |1,4|   |   |   |   |   |   |   |   |
 *    -------------------------------------
 * 	3 |1,3|   |   |   |   |   |   |   |   |
 *    -------------------------------------
 * 	2 |1,2|   |   |   |   |   |   |   |   |
 *    -------------------------------------
 * 	1 |1,1|2,1|3,1|4,1|5,1|6,1|7,1|8,1|9,1|
 *    -------------------------------------
 * 	    1 	2 	3 	4 	5 	6	7 	8 	9 - X
 * 
 */
public class Position {

	private int x = 1;
	private int y = 1;	

	public Position() throws InvalidBoardXCoordinate, InvalidBoardYCoordinate, PositionOccupiedException {
		setPosition(1, 1);
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
		
		if (x < Constant.MIN_BOARD_X || x > Constant.MAX_BOARD_X)
			throw new InvalidBoardXCoordinate(x, y);
		
		if (y < Constant.MIN_BOARD_Y || y > Constant.MAX_BOARD_Y)
			throw new InvalidBoardYCoordinate(x, y);
		
		//x = (x < 1) ? 1 : ((x > Constant.MAX_BOARD_X) ? Constant.MAX_BOARD_X : x);
		//y = (y < 1) ? 1 : ((y > Constant.MAX_BOARD_Y) ? Constant.MAX_BOARD_Y : y);
		
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
		return "(x, y): " + x + ", " + y + " ";
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

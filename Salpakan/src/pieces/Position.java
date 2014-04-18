package pieces;

import com.sun.org.apache.bcel.internal.Constants;

/**
 * Coordinate relative to the board
 * 
 * @author Reggie Senal
 * 
 */
public class Position {

	private int x;
	private int y;
	public Position() {
		setPosition(0, 0);
	}
	
	public Position(int x, int y) {
		setPosition(x, y);
	}
	
	public void setPosition(int x, int y) {
		x = (x < 0) ? 0 : ((x > Constant.MAX_BOARD_X) ? Constant.MAX_BOARD_X : x);
		y = (y < 0) ? 0 : ((y > Constant.MAX_BOARD_Y) ? Constant.MAX_BOARD_Y : y);		
		this.x = x;
		this.y = y;
	}
}

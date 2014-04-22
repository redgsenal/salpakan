package pieces;

import utils.Constant;
import utils.X;
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
public class Position implements Placement {

	private int x;
	private int y;
	private Player playerObj = new Player("noname");
	private TilePiece tilePiece = new TilePiece();

	public Position() throws InvalidBoardXCoordinate, InvalidBoardYCoordinate, PositionOccupiedException {
		setPosition(0, 0);
	}

	public Position(int x, int y) throws InvalidBoardXCoordinate, InvalidBoardYCoordinate, PositionOccupiedException {
		setPosition(x, y);
	}

	public Position(int x, int y, Player p, TilePiece tilePiece) throws 
							InvalidBoardXCoordinate, InvalidBoardYCoordinate, 
							PositionOccupiedException {
		this.playerObj = p;
		this.setTilePiece(tilePiece);
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

	public Player getPlayerObj() {
		return playerObj;
	}

	public void setPlayerObj(Player playerObj) {
		this.playerObj = playerObj;
	}

	@Override
	public void clear() {
		this.playerObj = null;
		try {
			this.setTilePiece(null);
		} catch (PositionOccupiedException e) {
			X.log("should not happen when clearing position");
			e.printStackTrace();
		}
	}

	public TilePiece getTilePiece() {
		return tilePiece;
	}

	public void setTilePiece(TilePiece tilePiece) throws PositionOccupiedException {
		if (this.tilePiece != null)
			throw new PositionOccupiedException();
		this.tilePiece = tilePiece;
	}

	@Override
	public boolean isOccupied() {
		return (this.playerObj != null && this.tilePiece != null);
	}

	@Override
	public void occupy(Player player, TilePiece tilePiece) throws PositionOccupiedException {
		if (isOccupied()){
			throw new PositionOccupiedException();
		}
			
		this.playerObj = player;
		this.tilePiece = tilePiece;
	}

	@Override
	public TilePiece proclaim(TilePiece challenger, TilePiece defender) {
		return challenger.getWinner(defender);
	}
	
	@Override
	public String toString() {		
		return "Player : " + this.playerObj.getName() + " piece: " + this.tilePiece.toString() + " position (x, y): " + x + ", " + y;
	}
}

package play;

import java.util.ArrayList;
import java.util.HashMap;

import pieces.Position;
import pieces.TilePiece;
import pieces.TilePosition;
import game.board.Board;
import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.InvalidBoardXCoordinate;
import game.exceptions.InvalidBoardYCoordinate;
import game.exceptions.InvalidPieceCountException;
import game.exceptions.PositionOccupiedException;
import game.player.Player;
import utils.Constant;
import utils.X;

public class Play {
	public static void main(String[] args) {
		
		try {
			Board b = new Board();
			//Player p1 = new Player("player1");
			Player p2 = new Player("player2");
			//ArrayList<TilePosition> tilemap1 = new ArrayList<TilePosition>();
			/*tilemap1.add(new TilePosition(new Position(3, 5), Constant.FLAG));
			tilemap1.add(new TilePosition(new Position(7, 5), Constant.SPY));
			tilemap1.add(new TilePosition(new Position(2, 6), Constant.FIVE_STAR_GENERAL));*/
			
			ArrayList<TilePosition> tilemap2 = new ArrayList<TilePosition>();
			tilemap2.add(new TilePosition(new Position(3, 6), Constant.SPY));
			tilemap2.add(new TilePosition(new Position(1, 3), Constant.FLAG));
			tilemap2.add(new TilePosition(new Position(7, 5), Constant.SPY));
			tilemap2.add(new TilePosition(new Position(2, 6), Constant.LIEUTENANT_COLONEL));
			tilemap2.add(new TilePosition(new Position(3, 5), Constant.FIRST_LIEUTENANT));
			tilemap2.add(new TilePosition(new Position(2, 2), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(6, 2), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(4, 2), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(3, 2), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(2, 4), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(1, 3), Constant.PRIVATE));
			

			//b.initialPiecePlayerPosition(p1, tilemap1);
			b.initialPiecePlayerPosition(p2, tilemap2);

			//X.log(b.getTilePiecesInMap());

			//X.log(b.getPlayerTilePieces(p1));
			
		} catch (InvalidBoardCoordinate e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PositionOccupiedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidBoardXCoordinate e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidBoardYCoordinate e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPieceCountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

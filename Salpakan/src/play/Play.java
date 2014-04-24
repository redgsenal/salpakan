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
import game.exceptions.InvalidInitialTilePiecePosition;
import game.exceptions.InvalidPieceCountException;
import game.exceptions.PositionOccupiedException;
import game.player.Player;
import utils.Constant;
import utils.X;

public class Play {
	public static void main(String[] args) {
		
		try {
			
			//Player p1 = new Player("player1");
			Player p2 = new Player("player2");
			p2.setStartingPlayer(true);
			Board b = new Board(p2);
			//ArrayList<TilePosition> tilemap1 = new ArrayList<TilePosition>();
			/*tilemap1.add(new TilePosition(new Position(3, 5), Constant.FLAG));
			tilemap1.add(new TilePosition(new Position(7, 5), Constant.SPY));
			tilemap1.add(new TilePosition(new Position(2, 6), Constant.FIVE_STAR_GENERAL));*/
			
			ArrayList<TilePosition> tilemap2 = new ArrayList<TilePosition>();
			tilemap2.add(new TilePosition(new Position(1, 7), Constant.SPY));
			tilemap2.add(new TilePosition(new Position(2, 7), Constant.FLAG));
			tilemap2.add(new TilePosition(new Position(3, 7), Constant.SPY));
			tilemap2.add(new TilePosition(new Position(4, 7), Constant.LIEUTENANT_COLONEL));
			tilemap2.add(new TilePosition(new Position(5, 7), Constant.FIRST_LIEUTENANT));
			tilemap2.add(new TilePosition(new Position(6, 6), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(7, 7), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(8, 7), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(9, 7), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(1, 8), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(2, 8), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(3, 8), Constant.FIVE_STAR_GENERAL));
			
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
		} catch (InvalidPieceCountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidInitialTilePiecePosition e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

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
import game.exceptions.PositionOccupiedException;
import game.player.Player;
import utils.Constant;
import utils.X;

public class Play {
	public static void main(String[] args) {
		X.log("test");
		try {
			Board b = new Board();
			ArrayList<TilePosition> tilemap1 = new ArrayList<TilePosition>();
			tilemap1.add(new TilePosition(new Position(3, 5), Constant.FLAG));
			tilemap1.add(new TilePosition(new Position(7, 5), Constant.PRIVATE));
			tilemap1.add(new TilePosition(new Position(2, 6), Constant.BRIGADIER_GENERAL));
			
			ArrayList<TilePosition> tilemap2 = new ArrayList<TilePosition>();
			tilemap2.add(new TilePosition(new Position(3, 6), Constant.FLAG));
			tilemap2.add(new TilePosition(new Position(8, 2), Constant.PRIVATE));
			tilemap2.add(new TilePosition(new Position(4, 6), Constant.BRIGADIER_GENERAL));

			b.initialPiecePlayerPosition(new Player("player1"), tilemap1);
			b.initialPiecePlayerPosition(new Player("player2"), tilemap2);
			
			X.log(b.getTilePiecePlayersMap());
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
		}
	}
}

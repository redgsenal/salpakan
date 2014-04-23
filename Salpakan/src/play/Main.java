package play;

import game.board.Board;
import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.InvalidBoardXCoordinate;
import game.exceptions.InvalidBoardYCoordinate;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

import java.util.HashMap;
import java.util.Map;

import pieces.Position;
import pieces.TilePiece;
import utils.Constant;

public class Main {

	public static void main(String[] args) {
		/*Player p1 = new Player("Player1");
		Player p2 = new Player("Player2");
		Board b = new Board(p1, p2);
		HashMap<Position, TilePiece> mapperP1 = new HashMap<>();
		try {
			mapperP1.put(new Position(4, 6), Constant.FLAG);
			mapperP1.put(new Position(2, 5), Constant.LIEUTENANT_COLONEL);
			mapperP1.put(new Position(4, 2), Constant.FIRST_LIEUTENANT);
			
			ArrayList<Position> pos = p1.initialPiecePositions(mapperP1);
			X.log(pos.size());
			for (Position position : pos) {
				X.log(position.toString());
			}
			
			HashMap<Position, TilePiece> mapperP2 = new HashMap<>();
			mapperP2.put(new Position(4, 5), Constant.FLAG);
			mapperP2.put(new Position(2, 2), Constant.LIEUTENANT_COLONEL);
			mapperP2.put(new Position(4, 3), Constant.FIRST_LIEUTENANT);
			ArrayList<Position> pos2 = p2.initialPiecePositions(mapperP2);
			for (Position position : pos2) {
				X.log(position.toString());
			}
			b.initialPiecePlayerPosition(p1, mapperP1);
			b.initialPiecePlayerPosition(p2, mapperP2);
			b.toString();
		} catch (InvalidBoardXCoordinate | InvalidBoardYCoordinate | PositionOccupiedException | InvalidBoardCoordinate e) {
			e.printStackTrace();
		}*/
	}

}
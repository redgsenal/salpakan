package testunits;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import game.exceptions.InvalidBoardXCoordinate;
import game.exceptions.InvalidBoardYCoordinate;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

import org.junit.Test;

import pieces.Position;
import pieces.TilePiece;
import utils.Constant;
import utils.X;

public class TestSettingPositions {

	@Test
	public void test() {
		Player p1 = new Player("Player1");
		Player p2 = new Player("Player2");
		Map<Position, TilePiece> mapper = new HashMap<>();
		try {
			mapper.put(new Position(4, 6), Constant.FLAG);
			mapper.put(new Position(2, 5), Constant.LIEUTENANT_COLONEL);
			mapper.put(new Position(4, 2), Constant.FIRST_LIEUTENANT);
			
			ArrayList<Position> pos = p1.initialPiecePositions(mapper);
			for (Position position : pos) {
				X.log(position.toString());
			}
		} catch (InvalidBoardXCoordinate | InvalidBoardYCoordinate | PositionOccupiedException e) {
			e.printStackTrace();
		}
	}
}

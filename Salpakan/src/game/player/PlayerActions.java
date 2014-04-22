package game.player;

import java.util.ArrayList;
import java.util.Map;

import pieces.Position;
import pieces.TilePiece;

public interface PlayerActions {
	
	public ArrayList<Position> initialPiecePositions(Map<Position, TilePiece> startingPositions);
	
}

package game.board;

import game.player.Player;

import java.util.ArrayList;
import java.util.Arrays;

import pieces.Position;
import pieces.PositionOccupiedException;
import pieces.TilePiece;
import utils.Constant;

public class Board implements Regulations{
	private ArrayList<Position> positions = Constant.initializePositions();
	private ArrayList<Player> players = new ArrayList<Player>(Arrays.asList((new Player("Player1")), (new Player("Player2"))));
	
	public Board() {				
	}

	@Override
	public void clearing(Position p) {
		p.clear();
	}

	@Override
	public void proclame(Position p, TilePiece piece) {
		// TODO Auto-generated method stub
	}

	@Override
	public void occupy(Position p, TilePiece piece) {
		// TODO Auto-generated method stub
	}
}
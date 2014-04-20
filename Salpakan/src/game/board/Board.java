package game.board;

import game.player.Player;

import java.util.ArrayList;

import pieces.Position;
import pieces.TilePiece;
import utils.Constant;

public class Board implements Regulations{
	private ArrayList<Position> positions = Constant.initializePositions();
	private ArrayList<Player> players = new ArrayList<Player>();
	private Player p1;
	private Player p2;
	
	public Board() {
	}
	
	public Board(Player p1, Player p2) {
		players.add(p1);
		players.add(p2);
		this.p1 = p1;
		this.p2 = p2;
				
	}
	
	
	 @Override
	public void clearPositions() {	
		for(Position p : positions){
			p.clear();
		}
	}

	@Override
	public void switchTurn() {
		//should only have 2 players
		Player p1 = players.get(0);
		Player p2 = players.get(1);
		p1.setTurn(p2.isTurn());
		p2.setTurn(!p2.isTurn());
	}

	@Override
	public void stepBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player getWinner() {
		//check if each player has flag captured
		if (isPlayerFlagCaptured(p1))			
			return p2;
		if (isPlayerFlagCaptured(p2))			
			return p1;		
		return null;
	}
	
	private boolean isPlayerFlagCaptured(Player p){
		for(TilePiece piece : p.getPieces()){
			if (piece.isFlagCaptured())
				return true;
		}
		return false;
	}

	@Override
	public void setMove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasWinner() {		
		return (getWinner() != null);
	}

	@Override
	public void removePiece(Player player, TilePiece piece) {
		if (player.getPieces().contains(piece))
			piece.capturePiece();
		
	}	
}
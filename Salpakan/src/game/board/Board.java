package game.board;

import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.InvalidPieceCountException;
import game.exceptions.PositionOccupiedException;
import game.player.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import pieces.Position;
import pieces.TilePiece;
import pieces.TilePieceSet;
import pieces.TilePosition;
import utils.Constant;
import utils.X;

public class Board implements BoardActions {
	// holds the piece and corresponding position to which player it belongs to
	private Map<TilePosition, Player> tilePiecePlayerMap = new HashMap<TilePosition, Player> ();
	private Player p1;
	private Player p2;

	public Board() {
	}

	public Board(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public void switchTurn() {
		// should only have 2 players
		p1.setTurn(p2.isTurn());
		p2.setTurn(!p2.isTurn());
	}

	@Override
	public void stepBack() {
		// TODO Auto-generated method stub
	}

	@Override
	public Player getWinner() {
		// check if each player has flag captured
		if (isPlayerFlagCaptured(p1))
			return p2;
		if (isPlayerFlagCaptured(p2))
			return p1;
		return null;
	}

	private boolean isPlayerFlagCaptured(Player p) {
		for (TilePiece piece : p.getPieces()) {
			if (piece.isFlagCaptured())
				return true;
		}
		return false;
	}
	
	public Map<TilePosition, Player> getTilePiecesInMap() {
		return tilePiecePlayerMap;
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

	@Override
	public void removePiece(Position position) {
	}

	@Override
	public void initialPiecePlayerPosition(Player p, ArrayList<TilePosition> tilemap) throws InvalidBoardCoordinate, PositionOccupiedException, InvalidPieceCountException {
		// just because its empty
		if (tilemap.isEmpty())
			return;
		
		for (TilePosition tilePosition : tilemap) {
			if (isPositionOccupied(tilePosition.getPosition()))
				throw new PositionOccupiedException(tilePosition.getPosition());
			if (isInvalidPieceCount(p, tilePosition.getPiece()))
				throw new InvalidPieceCountException(tilePosition.getPiece());
			tilePiecePlayerMap.put(tilePosition, p);
		}
	}
	
	private boolean isInvalidPieceCount(Player player, TilePiece piece) {
		// get piece count
		int pieceCount = getPlayerPieceCount(player, piece);
		if (pieceCount > 0){
			for (TilePieceSet tps : Constant.TILE_PIECES){
				if (tps.getTilepiece().equals(piece)){					
					return pieceCount > tps.getSetCount();
				}				
			}
		}
		return false;
	}

	private boolean isPositionOccupied(TilePosition tilePosition){
		return isPositionOccupied(tilePosition.getPosition());
	}
	
	private boolean isPositionOccupied(Position p){
		if (!tilePiecePlayerMap.isEmpty()){
			Iterator items = tilePiecePlayerMap.entrySet().iterator();
			while(items.hasNext()){
				Map.Entry<TilePosition, Player> item = (Entry<TilePosition, Player>) items.next();
				TilePosition mapitem = (TilePosition) item.getKey();
				if (mapitem.getPosition().equals(p))
					return true;
			}
		}			
		return false;
	}
	
	private int getPlayerPieceCount(Player player, TilePiece piece){
		int count = 1;
		if (!tilePiecePlayerMap.isEmpty()){
			 ArrayList<TilePiece> pieces = getPlayerTilePieces(player);
			 for(TilePiece tp : pieces){
				 if (tp.equals(piece))
					 count++;
			 }
		}
		return count;
	}
	
	public ArrayList<TilePiece> getPlayerTilePieces(Player p){
		ArrayList<TilePiece> tilePieces = new ArrayList<>();
		if (!tilePiecePlayerMap.isEmpty()){
			Iterator items = tilePiecePlayerMap.entrySet().iterator();
			while(items.hasNext()){
				Map.Entry<TilePosition, Player> item = (Entry<TilePosition, Player>) items.next();
				if (item.getValue().equals(p)){
					TilePosition mapitem = (TilePosition) item.getKey();
					tilePieces.add(mapitem.getPiece());
				}
			}
		}
		return tilePieces;
	}
	
	@Override
	public void setTilePiecePosition(TilePiece tilePiece, int x, int y) throws InvalidBoardCoordinate, PositionOccupiedException {
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Board pieces and coordinates: ");
		return sb.toString();
	}

	@Override
	public void clearPositions() {
		tilePiecePlayerMap = new HashMap<TilePosition, Player> ();
	}
}
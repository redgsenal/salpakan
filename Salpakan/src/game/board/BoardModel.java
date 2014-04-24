package game.board;

import game.exceptions.InvalidBoardCoordinate;
import game.exceptions.InvalidInitialTilePiecePosition;
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

public class BoardModel implements BoardActions {
	// holds the piece and corresponding position to which player it belongs to
	private Map<TilePosition, Player> tilePiecePlayerMap = new HashMap<TilePosition, Player> ();
	private Player p1;
	private Player p2;

	public BoardModel() {
	}
	
	public BoardModel(Player p) {
		this.p1 = p;
		setStartingPlayer();
	}

	public BoardModel(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;		
		setStartingPlayer();
	}

	/**
	 * Flip coin to start player
	 */
	private void setStartingPlayer() {
		
		// a better way to do this
		if (p1 != null && p2 != null){			
			p1.setStartingPlayer(true);
			p2.setStartingPlayer(false);
			return;
		}
		
		if (p1 != null)
			p1.setStartingPlayer(true);

		if (p2 != null)
			p2.setStartingPlayer(true);
			
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
	public void initialPiecePlayerPosition(Player p, ArrayList<TilePosition> tilemap) throws InvalidBoardCoordinate, PositionOccupiedException, InvalidPieceCountException, InvalidInitialTilePiecePosition {
		// just because its empty
		if (tilemap.isEmpty())
			return;
		
		Player player = getPlayerObject(p);
		
		for (TilePosition tp : tilemap) {
			if (isInvalidInitialTilePiecePosition(player, tp))
				throw new InvalidInitialTilePiecePosition(player, tp);
			occupyPlayerTilePosition(player, tp);
		}
	}
	
	private Player getPlayerObject(Player p) {
		if (p1.equals(p))
			return p1;
		
		if (p2.equals(p))
			return p2;
		
		this.p1 = p; 
		setStartingPlayer();
		return p;
	}

	private boolean isInvalidInitialTilePiecePosition(Player plyr, TilePosition tp) {
		// the starting player will have limited Y from 1 to 3 (bottom of the board)
		// opponent limited Y from 7 to 9 (top of the board)
		int positionMaxYLimit = Constant.INITIAL_TOP_MAX_Y_LIMIT;
		int positionMinYLimit = Constant.INITIAL_TOP_MIN_Y_LIMIT;
		
		if (plyr.isStartingPlayer()){
			positionMaxYLimit = Constant.INITIAL_BOTTOM_MAX_Y_LIMIT;
			positionMinYLimit = Constant.INITIAL_BOTTOM_MIN_Y_LIMIT;
		}
		
		int y = tp.getPosition().getY();
		return (y < positionMinYLimit || y > positionMaxYLimit);
	}

	private boolean isInvalidBoardCoordinate(Position pos){
		return (((pos.getX() < Constant.MIN_BOARD_X) || (pos.getX() > Constant.MAX_BOARD_X)) || ((pos.getY() < Constant.MIN_BOARD_Y) || (pos.getY() > Constant.MAX_BOARD_Y))); 
	}
	
	private void occupyPlayerTilePosition(Player p, TilePosition tp) throws PositionOccupiedException, InvalidPieceCountException, InvalidBoardCoordinate{
		if (isPositionOccupied(tp.getPosition()))
			throw new PositionOccupiedException(tp);
		if (hasExceedPieceCount(p, tp.getPiece()))
			throw new InvalidPieceCountException(tp.getPiece());
		if (isInvalidBoardCoordinate(tp.getPosition()))
			throw new InvalidBoardCoordinate();
		tilePiecePlayerMap.put(tp, p);
	}
	
	private boolean hasExceedPieceCount(Player player, TilePiece piece) {
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
	
	private Player getTurnPlayer(){
		if (p1 != null && p2 != null)
			return (p1.isTurn() ? p1 : p2);
	
		if (p1 != null)
			return p1;
		
		if (p2 != null)
			return p2;
		
		return null;
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
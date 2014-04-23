package utils;

import game.exceptions.InvalidBoardXCoordinate;
import game.exceptions.InvalidBoardYCoordinate;
import game.exceptions.PositionOccupiedException;

import java.util.ArrayList;
import java.util.Arrays;

import pieces.Position;
import pieces.TilePiece;
import pieces.TilePieceSet;
import utils.Constant;;

public final class Utils {
	public static  ArrayList<TilePieceSet> getTilePieceSetUp(){
		return new ArrayList<TilePieceSet>(Arrays.asList(
				new TilePieceSet(new TilePiece("Flag", Constant.FLAG_VALUE, Constant.FLAG_LESSER_RANKS), 1), // FLAG_SET
				new TilePieceSet(new TilePiece("5 Star General", Constant.FIVE_STAR_GENERAL_VALUE, Constant.FIVE_STAR_GENERAL_LESSER_RANKS), 1), //FIVE_STAR_GENERAL_SET,
				new TilePieceSet(new TilePiece("4 Star General", Constant.FOUR_STAR_GENERAL_VALUE, Constant.FOUR_STAR_GENERAL_LESSER_RANKS), 1), //FOUR_STAR_GENERAL_SET,
				new TilePieceSet(new TilePiece("Lieutenant General", Constant.LIEUTENANT_GENERAL_VALUE, Constant.LIEUTENANT_GENERAL_LESSER_RANKS), 1), //LIEUTENANT_GENERAL_SET,
				new TilePieceSet(new TilePiece("Major General", Constant.MAJOR_GENERAL_VALUE, Constant.MAJOR_GENERAL_LESSER_RANKS), 1), //MAJOR_GENERAL_SET,
				new TilePieceSet(new TilePiece("Brigadier General", Constant.BRIGADIER_GENERAL_VALUE, Constant.BRIGADIER_GENERAL_LESSER_RANKS), 1), //BRIGADIER_GENERAL_SET,
				new TilePieceSet(new TilePiece("Colonel", Constant.COLONEL_VALUE, Constant.COLONEL_LESSER_RANKS), 1), //COLONEL_SET,
				new TilePieceSet(new TilePiece("Lieutenant Colonel", Constant.LIEUTENANT_COLONEL_VALUE, Constant.LIEUTENANT_COLONEL_LESSER_RANKS), 1), //LIEUTENANT_COLONEL_SET,
				new TilePieceSet(new TilePiece("Major", Constant.MAJOR_VALUE, Constant.MAJOR_LESSER_RANKS), 1), //MAJOR_SET,
				new TilePieceSet(new TilePiece("Captain", Constant.CAPTAIN_VALUE, Constant.CAPTAIN_LESSER_RANKS), 1), //CAPTAIN_SET,
				new TilePieceSet(new TilePiece("First Lieutenant", Constant.FIRST_LIEUTENANT_VALUE, Constant.FIRST_LIEUTENANT_LESSER_RANKS), 1), //FIRST_LIEUTENANT_SET,
				new TilePieceSet(new TilePiece("Second Lieutenant", Constant.SECOND_LIEUTENANT_VALUE, Constant.SECOND_LIEUTENANT_LESSER_RANKS), 1), //SECOND_LIEUTENANT_SET,
				new TilePieceSet(new TilePiece("Sergent", Constant.SERGENT_VALUE, Constant.SERGENT_LESSER_RANKS), 1), //SERGENT_SET,
				new TilePieceSet(new TilePiece("Private", Constant.PRIVATE_VALUE, Constant.PRIVATE_LESSER_RANKS), 6), //PRIVATE_SET,
				new TilePieceSet(new TilePiece("Spy", Constant.SPY_VALUE, Constant.SPY_LESSER_RANKS), 2)//SPY_SET
			)
		);
	}
	
	public static ArrayList<TilePiece> initializePieces(){
		ArrayList<TilePiece> tps = new ArrayList<>();
		ArrayList<TilePieceSet> setupPieces = Utils.getTilePieceSetUp();
		for(TilePieceSet setPieces : setupPieces){
			tps.addAll(setPieces.getTilePieces());
		}
		return tps;
	}

	public static ArrayList<Position> initializePositions(){
		ArrayList<Position> ps = new ArrayList<>();
		for (int x = 0; x < Constant.MAX_BOARD_X; x++){
			for(int y = 0; y < Constant.MAX_BOARD_Y; y++){
				try {
					ps.add(new Position(x, y));
				} catch (InvalidBoardXCoordinate e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidBoardYCoordinate e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PositionOccupiedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return ps;		
	}
}

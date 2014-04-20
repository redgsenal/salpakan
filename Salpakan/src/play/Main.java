package play;

import java.util.ArrayList;

import pieces.TilePiece;
import pieces.TilePieceSet;
import utils.Constant;
import utils.X;

public class Main {

	public static void main(String[] args) {
		// initialize tile pieces
		ArrayList<TilePiece> tps = new ArrayList<>();
		for(TilePieceSet setPieces : Constant.TILE_PIECES){
			tps.addAll(setPieces.getTilePieces());
		}
		
		for(TilePiece tp : tps){
			X.log(tp.toString());
		}
	}

}
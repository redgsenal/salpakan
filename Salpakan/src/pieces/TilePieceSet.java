package pieces;

import java.util.ArrayList;

public class TilePieceSet {

	private TilePiece tilepiece;
	private int setCount;
	private ArrayList<TilePiece> tilePieces;
	
	public TilePieceSet(TilePiece tilePiece, int setCount) {
		this.tilepiece = tilePiece;
		this.setCount = setCount;

		for (int i = 0; i < setCount; i++){
			try {
				tilePieces.add((TilePiece) tilePiece.clone());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<TilePiece> getTilePieces() {
		return tilePieces;
	}
}

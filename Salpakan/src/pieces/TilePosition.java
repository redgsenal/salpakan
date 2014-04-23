package pieces;

public class TilePosition {

	private TilePiece piece;
	private Position position;
	
	public TilePosition() {
	}
	
	public TilePosition(Position position, TilePiece piece) {
		this.piece = piece;
		this.position = position;
	}

	public TilePiece getPiece() {
		return piece;
	}

	public void setPiece(TilePiece piece) {
		this.piece = piece;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "(" + this.position.toString() + "|" + this.piece.toString() + ")";
	}
}
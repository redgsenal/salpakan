package pieces;

public interface TileContest {
	void challenge(TilePiece opponent);
	void topple();
	TilePiece getWinner(TilePiece opponent);
	boolean isCaptured();
	boolean isFlag();
}

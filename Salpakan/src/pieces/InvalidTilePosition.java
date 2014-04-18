package pieces;

public class InvalidTilePosition extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTilePosition(String errmsg) {
		super(errmsg);
	}
}

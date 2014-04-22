package game.exceptions;

public class BoardException extends Exception {
	private static final long serialVersionUID = -763564726518763825L;	
	public BoardException() {
		super("Board exception thrown");
	}
	public BoardException(String msg) {
		super(msg);
	}
}

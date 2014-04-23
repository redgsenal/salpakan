package play;

import game.player.Player;
import utils.X;

public class Play {
	public static void main(String[] args) {
		X.log("test");
		Player p = new Player();
		X.log(p.getPieces().size());		
	}
}

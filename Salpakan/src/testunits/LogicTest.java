package testunits;

import static org.junit.Assert.*;

import org.junit.Test;

import pieces.Constant;
import pieces.TilePiece;
import utils.X;

public class LogicTest {

	@Test
	public void test() {
		TilePiece winner =  Constant.LIEUTENANT_COLONEL.getWinner(Constant.SECOND_LIEUTENANT);
		X.log(winner);
		assertTrue("check tile value", winner == Constant.SECOND_LIEUTENANT);
	}
}

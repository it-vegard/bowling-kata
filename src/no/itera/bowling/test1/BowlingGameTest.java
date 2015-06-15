package no.itera.bowling.test1;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	
	public void testGutterGame() throws Exception {
		Game game = new Game();
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0,  game.score());
	}

}

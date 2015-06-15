package no.itera.bowling.test2;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	
	private Game game;
	
	@Override
	protected void setUp() throws Exception {
		game = new Game();
	}
	
	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++) {
			game.roll(pins);
		}
	}
	
	public void testGutterGame() throws Exception {
		rollMany(20, 0);
		assertEquals(0,  game.score());
	}
	
	public void testAllOnes() throws Exception {
		rollMany(20, 1);
		assertEquals(20, game.score());
	}

}

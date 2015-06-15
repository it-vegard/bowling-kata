package no.itera.bowling.test3;

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
	
	public void testOneSpare() throws Exception {
		rollSpare();
		game.roll(3);
		rollMany(17,0);
		assertEquals(16, game.score());
	}
	
	private void rollSpare() {
		game.roll(5);
		game.roll(5);
	}

}

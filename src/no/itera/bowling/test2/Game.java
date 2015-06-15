package no.itera.bowling.test2;

public class Game {

	private int score = 0;
	
	public void roll(int pins) {
		score += pins;
	}
	
	public int score() {
		return score;
	}
	
}

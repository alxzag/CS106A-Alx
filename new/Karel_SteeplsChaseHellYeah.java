/*
 * File: SteeplsChase.java
 * ---------------------
 * This is a SteeplsChase project.
 * Karel runs a steeple chase the is 9 avenues long.
 * Hurdles are of arbitrary height and placement. Yeah
 */


import stanford.karel.*;

public class SteeplsChase extends SuperKarel {
	
	/* 
	 * Since we have a 9 avenue long, we move 8 times
	 * Check if there is a clear path and move.
	 * Otherwise start the jump.
	 */
	
	public void run() { 
		for (int i=0; i<8; i++) {
			if (frontIsClear()) {
				move();
			} else {
				jumpHurdle();
			}
		}
	
	}
	
	/* 
	 * Jump = Ascend + Cross the Hurdle + Descend.
	 * Pay attention to the direction Karel is looking
	 */
	
	private void jumpHurdle() {
		ascendHurdle();
		move();
		descendHurdle();
	}
	
	/* 
	 * We have to face South, so we turn Left.
	 * Start ascending.
	 * Look to the East above the Hurdle
	 */
	
	private void ascendHurdle() {
		turnLeft();
		ascend();
		turnRight();
	}
	
	/*
	 * Face North.
	 * Start descending.
	 * Look to the East when you reach the ground.
	 * 
	 */
	
	private void descendHurdle() {
		turnRight();
		descend();
		turnLeft();
	} 
	
	private void ascend() {
		while (rightIsBlocked()) {
			move();
		}
	}
	
	/*
	 * Descending.
	 * If we use rightIsBlocked method, we have a problem when we reach the ground.
	 */
	
	private void descend() {
		while (frontIsClear()) {
			move();
		}
	}
	
}

/*
 * File: SteeplsChase.java
 * ---------------------
 * This is a SteeplsChase project.
 */


import stanford.karel.*;

public class SteeplsChase extends SuperKarel {
	
	public void run() { 
		for (int i=0; i<8; i++) {
			if (frontIsClear()) {
				move();
			} else {
				jumpHurdle();
			}
		}
	
	}
	
	private void jumpHurdle() {
		//turnLeft();
		ascendHurdle();
		move();
		descendHurdle();
	}
	
	private void ascendHurdle() {
		turnLeft();
		while (rightIsBlocked()) {
			move();
		}
		turnRight();
		//move();
	}
	
	private void descendHurdle() {
		turnRight();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	} 
	
}


/*
 * File: OurDoubleBeepersgit mv 
 */


import stanford.karel.*;

public class OurDoubleBeepers extends SuperKarel {
	
	public void run() {
		
		/* 
		 * Go one corner in front,
		 * where the beepers are!
		 */		 
		move();
		doubleBeepersInPile();
		moveBackward();
	}
	
	/*
	 * Karel moves backward to the corner he started.
	 * Facing East
	 */
	
	private void moveBackward() {
		turnAround();
		move();
		turnAround();
	}
	
	/*
	 * Place 2 beepers in the corner in front of you.
	 */
	
	private void doubleBeepersInPile() {
		while (beepersPresent()) {
			pickBeeper();
			putTwoBeepersNextDoor();
		}
		movePileNextDoorBack();
	}
	
	/*
	 * The actual method that doubles beepers next corner.
	 */
	
	private void putTwoBeepersNextDoor() {
		move();
		putBeeper();
		putBeeper();
		moveBackward();
	}
	
	/*
	 * I am facing East at this moment.
	 * Sitting on the empty beeper corner 
	 */
	
	private void movePileNextDoorBack() {
		move();
		while (beepersPresent()) {
			moveOneBeeperBack();
		}
		moveBackward();
	}
	
	/*
	 * Place all beepers to the original corner we started.
	 */
	
	private void moveOneBeeperBack() {
		pickBeeper();
		moveBackward();
		putBeeper();
		move();
	}
}


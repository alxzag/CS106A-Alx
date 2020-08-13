/*
 * File: CleanUpKarel.java
 * ---------------------
 * We want to help Karel clean up his world by writing a program that has
 * Karel go through the world and pick up any beepers that may be scattered about. We
 * assume that:
 * -	Karel starts at corner (1, 1) facing East
 * -	Each corner of Karel's world may either be empty or contain at most one beeper,
 * 		and when Karel is done there should be no more beepers on any corner
 * -	Karel can finish his task at any location and orientation
 */


import stanford.karel.*;

public class CleanUpKarel extends SuperKarel {
	
	public void run() {
		while (frontIsClear()) {
		collectLineOfBeepers();
		//changeLine();
		}
	}
	
	private void collectLineOfBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			if (frontIsClear()) {
				move();
			}
		}
		move();
	}
	
	

	
	
}


/*
 * File: LineOfBeepers.java
 * ---------------------
 * Creates a line of beepers beginning at Karel’s current corner 
 * and proceeding forward to the next wall.
 * We have an infinite number of beepers
 */


import stanford.karel.*;

public class LineOfBeepers extends Karel {
	
	public void run() {
		while (frontIsClear()) {
			createBeeperLine();
		}
		
		/*
		 * We have to put a putBeeper method if we want
		 * a beeper on the last corner.
		 */
		
		putBeeper();
	}
	
	/*
	 * A method that creates a beeper line and proceeds to the next corner. 
	 */
	
	private void createBeeperLine() {
		putBeeper();
		move();
	}
}


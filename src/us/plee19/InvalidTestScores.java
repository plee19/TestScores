package us.plee19;

/**
 * InvalidTestScores exceptions are thrown by TestScores when
 * a given score in the array is less than 0 or greater than 100.
 * @author plee19
 * @version 1
 */
public class InvalidTestScores extends Exception {
    public InvalidTestScores() {
        super("Score in array is out of range");
    }

}

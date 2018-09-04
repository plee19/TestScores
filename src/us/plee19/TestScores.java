package us.plee19;

/**
 * TestScores class is initialized with an array of floats, and has the getAverage method to generate the average
 * of those floats.
 * @author plee19
 * @version 1
 */
public class TestScores {
    float[] scoreArray;

    /**
     * TestScores constructor creates a new instance of TestScores object with an array of floats.
     * @param array Array of floats
     */
    public TestScores(float[] array) {
        scoreArray = array;
    }

    /**
     * getAverage method runs on specified TestScores object and returns the average of all floats in the scoreArray.
     * @return float Average of all floats in array
     */
    public float getAverage() throws InvalidTestScores {
        int count = 0;
        float sum = 0;
        for (int i = 0; i < scoreArray.length; i++) {
            if (scoreArray[i] < 0 || scoreArray[i] > 100) {
                //IllegalArgumentException line prior to creating InvalidTestScores exception class
                //throw new IllegalArgumentException("Score in array is out of range");
                throw new InvalidTestScores();
            } else {
                sum += scoreArray[i];
                count++;
            }
        }
        return sum / count;
    }
}
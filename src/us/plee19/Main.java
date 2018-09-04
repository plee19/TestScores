package us.plee19;

/**
 * Main method to demonstrate TestScores class and InvalidTestScores exception
 */
public class Main {

    public static void main(String[] args) throws InvalidTestScores {
        float[] testArray = new float[]{50, 75, 95};
        float[] failArray = new float[]{50, -50, 105};
        TestScores testObject = new TestScores(testArray);
        TestScores failObject = new TestScores(failArray);
        System.out.println(testObject.getAverage());
        System.out.println(failObject.getAverage());
    }
}

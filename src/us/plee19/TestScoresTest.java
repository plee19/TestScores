package us.plee19;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestScoresTest {
    float[] badArray = new float[]{50, 70, 104};
    float[] goodArray = new float[]{50, 70, 85};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = us.plee19.InvalidTestScores.class)
    public void testGetAverage() throws InvalidTestScores {
        TestScores testObject = new TestScores(badArray);
        System.out.println(testObject.getAverage());
    }

    @Test
    public void testGetAverage2() throws InvalidTestScores {
        TestScores testObject = new TestScores(goodArray);
        assertEquals(68.333336, testObject.getAverage(), 0.0001);
    }
}
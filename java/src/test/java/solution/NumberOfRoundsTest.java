package solution;

import junit.framework.TestCase;

public class NumberOfRoundsTest extends TestCase {

    public void testNumberOfRounds() {
        var numberOfRounds = new NumberOfRounds();
        assertEquals(1, numberOfRounds.numberOfRounds("12:01", "12:44"));
        assertEquals(40, numberOfRounds.numberOfRounds("20:00", "06:00"));
        assertEquals(0, numberOfRounds.numberOfRounds("00:47", "00:57"));
    }

    public void testGetCount() {
    }
}
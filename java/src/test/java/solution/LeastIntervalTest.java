package solution;

import junit.framework.TestCase;

public class LeastIntervalTest extends TestCase {

    public void testLeastInterval() {
        var leastInterval = new LeastInterval();
        assertEquals(8, leastInterval.leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        assertEquals(6, leastInterval.leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B'}, 0));
        assertEquals(16, leastInterval.leastInterval(new char[] {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2));

        // A, B, C, A, B, C, D, E, idle, D
        // A, B, C, D, A, B, C, D, E
        assertEquals(12, leastInterval.leastInterval(new char[] {'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E'}, 2));
    }
}
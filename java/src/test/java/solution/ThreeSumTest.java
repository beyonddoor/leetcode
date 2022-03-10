package solution;

import junit.framework.TestCase;

public class ThreeSumTest extends TestCase {

    public void testThreeSum() {
        var threeSum = new ThreeSum();
        var result = threeSum.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
        // new int[][] {{-1, -1, 2}, {-1, 0, 1}
        assertEquals(2, result.size());
    }
}
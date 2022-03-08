package solution;

import junit.framework.TestCase;

public class FindMedianSortedArraysTest extends TestCase {

    public void testFindMedianSortedArrays() {
        FindMedianSortedArrays f = new FindMedianSortedArrays();
        assertEquals(2.0, f.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.0001);
        assertEquals(2.5, f.findMedianSortedArrays(new int[]{1, 3}, new int[]{2,4}), 0.0001);
        assertEquals(2.5, f.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}), 0.0001);
    }
}
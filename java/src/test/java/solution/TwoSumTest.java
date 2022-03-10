package solution;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest extends TestCase {

    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = new TwoSum().twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    public void testTwoSumWithCache() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = new TwoSum().twoSumWithCache(nums, target);
        assertArrayEquals(expected, actual);
    }
}
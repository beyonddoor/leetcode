package solution;

import junit.framework.TestCase;
import testUtil.AssertUtil;

import java.util.Arrays;
import java.util.Comparator;

public class FourSumTest extends TestCase {

    public void testFourSum() {
        var solution = new FourSum();
        {
            var result = solution.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
            assertEquals(3, result.size());
            AssertUtil.assertListEqualsIgnoreOrder(result.get(0), Arrays.asList(-2, -1, 1, 2), Comparator.naturalOrder());
            AssertUtil.assertListEqualsIgnoreOrder(result.get(1), Arrays.asList(-2,0,0,2), Comparator.naturalOrder());
            AssertUtil.assertListEqualsIgnoreOrder(result.get(2), Arrays.asList(-1,0,0,1), Comparator.naturalOrder());
        }

        {
            var result = solution.fourSum(new int[] {2,2,2,2,2}, 8);
            assertEquals(1, result.size());
        }
    }
}
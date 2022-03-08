package solution;

import junit.framework.TestCase;

public class CountPrimesTest extends TestCase {

    public void testCountPrimes() {
        var countPrimes = new CountPrimes();
        assertEquals(4, countPrimes.countPrimes(10));
    }
}
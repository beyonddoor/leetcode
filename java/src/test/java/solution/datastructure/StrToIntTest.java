package solution.datastructure;

import junit.framework.TestCase;

public class StrToIntTest extends TestCase {

    public void testStrToInt() {
        var solution = new StrToInt();
        assertEquals(1234, solution.strToInt("1234"));
        assertEquals(1234, solution.strToInt("   1234 asda "));
        assertEquals(-1234, solution.strToInt("   -1234 asda "));
    }
}
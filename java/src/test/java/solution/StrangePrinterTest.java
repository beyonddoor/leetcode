package solution;

import junit.framework.TestCase;

public class StrangePrinterTest extends TestCase {

    public void testStrangePrinter() {
        var solution = new StrangePrinter();
        assertEquals(2, solution.strangePrinter("aaabbb"));
        assertEquals(2, solution.strangePrinter("aba"));
    }
}
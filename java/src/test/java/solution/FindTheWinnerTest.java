package solution;

import junit.framework.TestCase;

public class FindTheWinnerTest extends TestCase {

    public void testFindTheWinner() {
        var findTheWinner = new FindTheWinner();
        assertEquals(3, findTheWinner.findTheWinner(5,2));
        assertEquals(1, findTheWinner.findTheWinner(6,5));
    }
}
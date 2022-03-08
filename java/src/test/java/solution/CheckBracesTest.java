package solution;

import junit.framework.TestCase;

public class CheckBracesTest extends TestCase {

    public void testIsValid() {
        CheckBraces solution = new CheckBraces();
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("{()}"));
        assertTrue(solution.isValid("{[()]}"));
        assertFalse(solution.isValid("{[()]}}"));
        assertTrue(solution.isValid("{{[()]}}"));
    }
}
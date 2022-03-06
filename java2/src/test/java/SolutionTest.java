import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testIsValid() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("{()}"));
        assertTrue(solution.isValid("{[()]}"));
        assertFalse(solution.isValid("{[()]}}"));
        assertTrue(solution.isValid("{{[()]}}"));
    }
}
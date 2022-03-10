package solution.datastructure;

import junit.framework.TestCase;

public class MinStackTest extends TestCase {

    public void testPush() {
        var stack = new MinStack();
        stack.push(1);
        assertEquals(1, stack.min());
        stack.push(0);
        assertEquals(0, stack.min());
        stack.push(2);
        assertEquals(0, stack.min());
        stack.pop();
        assertEquals(0, stack.min());
        stack.pop();
        assertEquals(1, stack.min());
    }

    public void testPop() {
    }

    public void testTop() {
    }

    public void testMin() {
    }
}
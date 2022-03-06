package utils;

import junit.framework.TestCase;

public class LinkListTest extends TestCase {

    public void testIsEmpty() {
        var list = new LinkList<String>(new String[]
                {
                        "a", "b", "c", "d"
                });
        assertFalse(list.isEmpty());
        assertTrue(new LinkList<String>(new String[0]).isEmpty());
    }

    public void testSize() {
    }

    public void testAdd() {
    }

    public void testGet() {
    }

    public void testClear() {
    }
}
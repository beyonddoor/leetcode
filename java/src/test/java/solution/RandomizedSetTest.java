package solution;

import junit.framework.TestCase;

public class RandomizedSetTest extends TestCase {

    public void testInsert() {
        var set = new RandomizedSet();
        assertTrue(set.insert(1));
        assertFalse(set.insert(1));
    }

    public void testRemove() {
        var set = new RandomizedSet();
        assertTrue(set.insert(1));
        assertTrue(set.remove(1));
        assertFalse(set.remove(1));
    }

    public void testGetRandom() {
        var set = new RandomizedSet();
        for (int i = 0; i < 10; i++) {
            set.insert(i);
        }
        System.out.println(set.getRandom());
    }
}
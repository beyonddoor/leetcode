package solution.data_structure;

import junit.framework.TestCase;

public class MaxQueueTest extends TestCase {
    public void testSimple() {
        var queue = new MaxQueue();
        assertEquals(-1, queue.max_value());
        queue.push_back(1);
        assertEquals(1, queue.max_value());
        queue.push_back(2);
        assertEquals(2, queue.max_value());
        assertEquals(1, queue.pop_front());
        assertEquals(2, queue.max_value());
    }

    void autoTest() {
        var actions = new String[]{"MaxQueue", "max_value", "pop_front", "max_value", "push_back", "max_value", "pop_front", "max_value", "pop_front", "push_back", "pop_front", "pop_front", "pop_front", "push_back", "pop_front", "max_value", "pop_front", "max_value", "push_back", "push_back", "max_value", "push_back", "max_value", "max_value", "max_value", "push_back", "pop_front", "max_value", "push_back", "max_value", "max_value", "max_value", "pop_front", "push_back", "push_back", "push_back", "push_back", "pop_front", "pop_front", "max_value", "pop_front", "pop_front", "max_value", "push_back", "push_back", "pop_front", "push_back", "push_back", "push_back", "push_back", "pop_front", "max_value", "push_back", "max_value", "max_value", "pop_front", "max_value", "max_value", "max_value", "push_back", "pop_front", "push_back", "pop_front", "max_value", "max_value", "max_value", "push_back", "pop_front", "push_back", "push_back", "push_back", "pop_front", "max_value", "pop_front", "max_value", "max_value", "max_value", "pop_front", "push_back", "pop_front", "push_back", "push_back", "pop_front", "push_back", "pop_front", "push_back", "pop_front", "pop_front", "push_back", "pop_front", "pop_front", "pop_front", "push_back", "push_back", "max_value", "push_back", "pop_front", "push_back", "push_back", "pop_front"};
        // [[],[],[],[],[46],[],[],[],[],[868],[],[],[],[525],[],[],[],[],[123],[646],[],[229],[],[],[],[871],[],[],[285],[],[],[],[],[45],[140],[837],[545],[],[],[],[],[],[],[561],[237],[],[633],[98],[806],[717],[],[],[186],[],[],[],[],[],[],[268],[],[29],[],[],[],[],[866],[],[239],[3],[850],[],[],[],[],[],[],[],[310],[],[674],[770],[],[525],[],[425],[],[],[720],[],[],[],[373],[411],[],[831],[],[765],[701],[]]
    }
}
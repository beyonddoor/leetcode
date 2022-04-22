package solution.data_structure;

import junit.framework.TestCase;

public class CopyRandomListTest extends TestCase {

    public void testCopyRandomList() {
        var solution = new CopyRandomList();

        CopyRandomList.Node head = createNodeList(10);
        var newHead = solution.copyRandomList(head);
        checkNodeList(newHead, 10);
    }

    public void testSolution_HashMap() {
        var solution = new CopyRandomList();

        CopyRandomList.Node head = createNodeList(10);
        var newHead = solution.solution_HashMap(head);
        checkNodeList(newHead, 10);
    }

    private void checkNodeList(CopyRandomList.Node newHead, int len) {
        CopyRandomList.Node[] newArrays = new CopyRandomList.Node[len];
        int index = 0;
        for (var cur = newHead; cur != null; cur = cur.next, index++) {
            newArrays[index] = cur;
        }
        for (int i = 0; i < len; i++) {
            assertEquals(i, newArrays[i].val);
            assertEquals((i + 1) % len, newArrays[i].random.val);
        }
    }

    private CopyRandomList.Node createNodeList(int len) {
        CopyRandomList.Node prev = null;
        CopyRandomList.Node head = null;
        CopyRandomList.Node[] arrays = new CopyRandomList.Node[len];
        for (int i = 0; i < len; i++) {
            var cur = new CopyRandomList.Node(i);
            cur.random = cur;

            if (head == null) {
                head = cur;
            }

            if (prev != null) {
                prev.next = cur;
            }

            prev = cur;
            arrays[i] = cur;
        }

        for (int i = 0; i < len; i++) {
            arrays[i].random = arrays[(i + 1) % len];
        }
        return head;
    }
}
package solution;

import junit.framework.TestCase;
import leetcode.TreeNode;

public class BstFromPreorderTest extends TestCase {

    public void testBstFromPreorder() {
        BstFromPreorder bstFromPreorder = new BstFromPreorder();
        TreeNode root = bstFromPreorder.bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12});
        assertEquals(8, root.val);
        assertEquals(5, root.left.val);
        assertEquals(10, root.right.val);
        assertEquals(1, root.left.left.val);
        assertEquals(7, root.left.right.val);
        assertEquals(12, root.right.right.val);
    }
}
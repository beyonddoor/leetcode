package solution.datastructure;

import junit.framework.TestCase;
import leetcode.LinkListUtil;
import testUtil.AssertUtil;

public class ReverseLinkList_InplaceTest extends TestCase {

    public void testReverseList() {
        var solution = new ReverseLinkList_Inplace();

        {
            var list = LinkListUtil.createLinkList(new int[]{1, 2, 3, 4, 5});
            var newList = solution.reverseList(list);
            assertTrue(LinkListUtil.isEqual(list, new int[]{1}));
            LinkListUtil.printLinkList(newList);
            assertTrue(LinkListUtil.isEqual(newList, new int[]{5, 4, 3, 2, 1}));
        }

        {
            var list = LinkListUtil.createLinkList(new int[]{1});
            var newList = solution.reverseList(list);
            assertTrue(LinkListUtil.isEqual(newList, new int[]{1}));
        }

        {
            var list = LinkListUtil.createLinkList(new int[]{});
            var newList = solution.reverseList(list);
            assertTrue(LinkListUtil.isEqual(newList, new int[]{}));
        }
    }
}
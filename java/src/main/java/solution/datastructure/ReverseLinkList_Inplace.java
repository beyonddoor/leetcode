package solution.datastructure;

import leetcode.ListNode;

/**
 * https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/9pdjbm/
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class ReverseLinkList_Inplace {

    /**
     * 可以使用双指针法
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            var tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return prev;
    }
}

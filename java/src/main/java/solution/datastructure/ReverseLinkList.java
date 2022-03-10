package solution.datastructure;

import leetcode.ListNode;

/**
 * https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/5dt66m/
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 1. 使用递归
 * 2. 使用栈
 * 3. 普通迭代
 */
public class ReverseLinkList {
    public int[] reversePrint(ListNode head) {
        return solution_Simple(head);
    }

    /**
     * 递归的解法
     * @param head
     * @return
     */
    public int[] solution_Recursive(ListNode head) {
        int len = 0;
        for(ListNode cur=head; cur != null; cur=cur.next) {
            len ++;
        }

        var array = new int[len];
        recursiveReverse(head, 0, len, array);
        return array;
    }

    private void recursiveReverse(ListNode head, int start, int end, int[] array) {
        if(head == null) {
            return;
        }
        array[end - start - 1] = head.val;
        recursiveReverse(head.next, start + 1, end, array);
    }

    public int[] solution_Simple(ListNode head) {
        int len = 0;
        for(ListNode cur=head; cur != null; cur=cur.next) {
            len ++;
        }
        var array = new int[len];

        int index = 0;
        for(ListNode cur = head; cur != null; cur=cur.next) {
            array[len - index - 1] = cur.val;
            index++;
        }
        return array;
    }
}

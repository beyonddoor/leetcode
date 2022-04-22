package solution.data_structure;

import leetcode.ListNode;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/9p0yy1/
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 * 作者：Krahets
 * 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/9p0yy1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class CopyRandomList {
    public static class Node extends ListNode {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        return solution_MergeList(head);
    }

    /**
     * 方法很巧妙，将新的linklist编入原来的linklist，最后分开两个linklist
     * @param head
     * @return
     */
    public Node solution_MergeList(Node head) {
        if(head == null)
        {
            return null;
        }

        // 新的linklist编入原来的linklist中
        for(var cur=head; cur != null; )
        {
            var newNode = new Node(cur.val);
            var tmp = cur.next;
            cur.next = newNode;
            newNode.next = tmp;

            cur = tmp;
        }

        // 更新random
        for (var cur = head; cur != null; )
        {
            if(cur.random != null)
            {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        // 分离list
        Node newHead = head.next;
        for(var cur = head; cur != null; )
        {
            if(cur.next != null)
            {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return newHead;
    }

    /**
     * 使用hash map的方案
     * @param head
     * @return
     */
    public Node solution_HashMap(Node head) {
        var oldToNewNodeMap = new HashMap<Node, Node>();

        Node newHead = null;
        Node newPrev = null;
        for(var cur = head; cur != null; cur = cur.next)
        {
            var newCur = new Node(cur.val);
            if(newHead == null)
            {
                newHead = newCur;
            }

            if(newPrev != null)
            {
                newPrev.next = newCur;
            }
            newPrev = newCur;
            oldToNewNodeMap.put(cur, newCur);
        }

        {
            var oldCur = head;
            var newCur = newHead;
            for(; newCur != null; newCur = newCur.next, oldCur=oldCur.next)
            {
                if(oldCur.random != null)
                {
                    newCur.random = oldToNewNodeMap.get(oldCur.random);
                }
            }
        }

        return newHead;
    }
}

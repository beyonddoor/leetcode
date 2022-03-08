package solution;

import leetcode.ListNode;

class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode current = null;
        while(list1 != null && list2 != null)
        {
            int val;
            if(list1.val <= list2.val)
            {
                val = list1.val;
                list1 = list1.next;
            }
            else
            {
                val = list2.val;
                list2 = list2.next;
            }

            if(current == null)
            {
                current = new ListNode(val);
                result = current;
            }
            else
            {
                current.next = new ListNode(val);
                current = current.next;
            }
        }

        while (list1 != null)
        {
            current.next = new ListNode(list1.val);
            current = current.next;
            list1 = list1.next;
        }

        while (list2 != null)
        {
            current.next = new ListNode(list2.val);
            current = current.next;
            list2 = list2.next;
        }

        return result;
    }
}

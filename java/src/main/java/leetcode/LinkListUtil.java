package leetcode;

/**
 * 方便调试的接口
 */
public class LinkListUtil {
    public static ListNode createLinkList(int[] arr) {
        if(arr == null || arr.length == 0) {
            return null;
        }
        return createLinkList(arr, 0, arr.length - 1);
    }

    public static void printLinkList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode createLinkList(int[] arr, int start, int end) {
        ListNode head = new ListNode(arr[start]);
        ListNode cur = head;
        for (int i = start + 1; i <= end; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    public static boolean isEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    public static boolean isEqual(ListNode l1, int[] arr) {
        if(arr == null || arr.length == 0) {
            return l1 == null;
        }

        int index = 0;
        for(; index < arr.length && l1 != null; index++, l1 = l1.next) {
            if (l1.val != arr[index]) {
                return false;
            }
        }
        return index == arr.length && l1 == null;
    }
}

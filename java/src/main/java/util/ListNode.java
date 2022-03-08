package util;

/**
 * 链表节点
 * @param <T>
 */
public class ListNode<T> {
    public T value;
    public ListNode<T> next;

    public ListNode() {
    }

    public ListNode(T val) {
        this.value = val;
    }

    public ListNode(T val, ListNode<T> next) {
        this.value = val;
        this.next = next;
    }
}


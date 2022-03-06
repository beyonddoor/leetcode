package utils;

/**
 * 双向链表节点
 * @param <T>
 */
public class BiListNode<T> {
    public T val;
    public BiListNode<T> next;
    public BiListNode<T> prev;

    public BiListNode(T val) {
        this.val = val;
    }
}
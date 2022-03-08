package util;

import java.util.*;

/**
 * 单向链表
 * @param <T>
 */
public class LinkList<T> extends AbstractList<T> implements List<T> {
    private ListNode<T> head = new ListNode<>();
    public LinkList(){
    }

    public LinkList(T[] arr){
        for(T t: arr){
            add(t);
        }
    }

    @Override
    public boolean isEmpty()
    {
        return head.next == null;
    }

    @Override
    public int size()
    {
        var first = head.next;
        int count = 0;
        for(; first != null; first = first.next)
        {
            count++;
        }
        return count;
    }

    @Override
    public boolean add(T value)
    {
        var prev = head;
        for(; prev.next != null; prev = prev.next)
        {
        }
        prev.next = new ListNode<>(value);
        return true;
    }

    @Override
    public T get(int index)
    {
        var current = head;
        for(int i=0; i<index; i++)
        {
            current = current.next;
            if(current == null)
            {
                throw new NoSuchElementException();
            }
        }
        return current.value;
    }

    @Override
    public void clear()
    {
        head.next = null;
    }
}

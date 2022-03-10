package solution.datastructure;

import util.LinkList;

import java.util.LinkedList;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/50bp33/
 *
 * 使用一个stack，保持序关系，栈顶是最小值
 */
public class MinStack {

    private final LinkedList<Integer> stack = new LinkedList<>();
    private final LinkedList<Integer> minStack = new LinkedList<>();

    public MinStack() {
    }

    public void push(int x) {
        stack.addLast(x);
        if(minStack.isEmpty() || x <= minStack.getLast())
        {
            minStack.addLast(x);
        }
    }

    public void pop() {
        var last = stack.removeLast();
        if(last.equals(minStack.getLast()))
        {
            minStack.removeLast();
        }
    }

    public int top() {
        return stack.getLast();
    }

    public int min() {
        return minStack.getLast();
    }
}

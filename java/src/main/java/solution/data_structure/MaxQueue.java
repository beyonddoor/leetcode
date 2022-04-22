package solution.data_structure;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * <p>
 * 作者：Krahets
 * 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/e2t5ug/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MaxQueue {

    /**
     * 队列的头部保存最大值
     */
    LinkedList<Integer> maxQueue = new LinkedList<>();
    LinkedList<Integer> queue = new LinkedList<>();

    public MaxQueue() {
    }

    public int max_value() {
        if (!maxQueue.isEmpty()) {
            return maxQueue.getFirst();
        }
        return -1;
    }

    public void push_back(int value) {
        if (!maxQueue.isEmpty()) {
            if (maxQueue.getFirst() <= value) {
                maxQueue.addFirst(value);
            }
        } else {
            maxQueue.addFirst(value);
        }

        queue.addFirst(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }

        if (!maxQueue.isEmpty() && maxQueue.getLast().equals(queue.getLast())) {
            maxQueue.removeLast();
        }
        return queue.removeLast();
    }
}

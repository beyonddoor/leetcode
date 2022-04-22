package solution.data_structure;

import java.util.Stack;

/**
 * https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/5d3i87/
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 */
public class TwoStackAsQueue {

    public class CQueue {

        public CQueue() {
        }

        public void appendTail(int value) {
            stackTail.push(value);
        }

        public int deleteHead() {
            if(stackHead.isEmpty())
            {
                if(stackTail.isEmpty())
                {
                    return -1;
                }

                while(stackTail.size() > 0)
                {
                    stackHead.push(stackTail.pop());
                }
            }

            return stackHead.pop();
        }

        /**
         * 栈顶作为队列的头部
         */
        private Stack<Integer> stackHead = new Stack<>();
        /**
         * 栈顶作为队列的尾部
         */
        private Stack<Integer> stackTail = new Stack<>();
    }
}

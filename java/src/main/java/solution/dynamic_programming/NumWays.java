package solution.dynamic_programming;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 作者：Krahets
 * 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/57hyl5/
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class NumWays {
    /**
     * 仍然是fib函数
     * @param n
     * @return
     */
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        int prev = 1, cur = 1;
        for (int i = 2; i <= n; i++) {
            int temp = prev;
            prev = cur;
            cur = (temp + prev) % 1000000007;
        }
        return cur;
    }
}

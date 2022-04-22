package solution.dynamic_programming;

import java.util.Map;

public class Fib {
    public int fib(int n) {
        return fib_simple(n);
    }

    /**
     * 暴力计算
     *
     * @param n
     * @return
     */
    public int fib_recursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib_recursive(n - 1) + fib_recursive(n - 2);
    }

    /**
     * 迭代计算
     *
     * @param n
     * @return
     */
    public int fib_simple(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int prev = 0, cur = 1;
        for (int i = 2; i <= n; i++) {
            int temp = prev;
            prev = cur;
            cur = (temp + prev) % 1000000007;
        }
        return cur;
    }
}

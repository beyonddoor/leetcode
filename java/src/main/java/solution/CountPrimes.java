package solution;

/**
 * 给定整数 n ，返回 所有小于非负整数 n 的质数的数量 。
 * https://leetcode-cn.com/problems/count-primes/submissions/
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }

        var notPrimes = new boolean[n];
        notPrimes[0] = true;
        notPrimes[1] = true;
        for (int i = 2; i < n; i++) {
            if (notPrimes[i]) {
                continue;
            }

            for (int j = 2; i * j < n; j++) {
                notPrimes[i * j] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!notPrimes[i]) {
                count++;
            }
        }
        return count;
    }
}

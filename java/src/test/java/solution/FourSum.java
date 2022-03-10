package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 * <p>
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/4sum
 */
public class FourSum {

    /**
     * 这个方法是参考了题解，使用双指针方法，降低时间复杂度
     * TODO 这个版本有问题
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        var numsCopy = new int[nums.length];
        System.arraycopy(nums, 0, numsCopy, 0, nums.length);

        var result = new ArrayList<List<Integer>>();
        Arrays.sort(numsCopy);
        for (int i = 0; i < numsCopy.length; i++) {
            for (int j = i + 1; j < numsCopy.length; j++) {
                for (int left = j + 1, right = numsCopy.length - 1; left < right; ) {
                    var sum = numsCopy[i] + numsCopy[j] + numsCopy[left] + numsCopy[right];
                    if (sum == target) {
                        result.add(Arrays.asList(numsCopy[i], numsCopy[j], numsCopy[left], numsCopy[right]));
                        for (; left < right && numsCopy[left] == numsCopy[left + 1]; left++) ;
                        left++;
                        for (; left < right && numsCopy[right] == numsCopy[right - 1]; right--) ;
                        right--;
                    } else if (sum < target) {
                        for (; left < right && numsCopy[left] == numsCopy[left + 1]; left++) ;
                        left++;
                    } else {
                        for (; left < right && numsCopy[right] == numsCopy[right - 1]; right--) ;
                        right--;
                    }
                }
                // 跳过相等的
                for (; j < numsCopy.length - 1 && nums[j] == nums[j + 1]; j++) ;
            }
            // 跳过相等的
            for (; i < numsCopy.length - 1 && nums[i] == nums[i + 1]; i++) ;
        }
        return result;
    }
}

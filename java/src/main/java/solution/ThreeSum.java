package solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum {
    static class IndexPair2 {
        int index1;
        int index2;
    }

    static class IndexPair3 {
        public IndexPair3(int value1, int value2, int value3) {
            this.values[0] = value1;
            this.values[1] = value2;
            this.values[2] = value3;
            Arrays.sort(this.values);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IndexPair3 that = (IndexPair3) o;
            return Arrays.equals(values, that.values);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(values);
        }

        int[] values = new int[3];
    }


    /**
     * 暴力搜索
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        var set = new HashSet<IndexPair3>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        set.add(new IndexPair3(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        set.forEach(indexPair3 -> {
            result.add(Arrays.stream(indexPair3.values).boxed().collect(Collectors.toList()));
        });
        return result;
    }
}

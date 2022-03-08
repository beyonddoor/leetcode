package solution;

/**
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 * 合并数组，并查找中位数
 */
class FindMedianSortedArrays {
    /**
     * 寻找两个正序数组的中位数
     * 1. 最直观的方式：将两个数组合并，查找中位数，代价是存储。算法复杂度为O(m+n)
     * 2. TODO 更有效的
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var newArray = mergeArray(nums1, nums2);
        var half = newArray.length / 2;
        if (newArray.length % 2 == 0) {
            return (newArray[half] + newArray[half - 1]) / 2.0;
        }
        return newArray[half];
    }

    private int[] mergeArray(int[] nums1, int[] nums2) {
        int[] newNums = new int[nums1.length + nums2.length];
        int i1 = 0, i2 = 0;
        int i = 0;
        for (; i1 < nums1.length && i2 < nums2.length; i++) {
            if (nums1[i1] < nums2[i2]) {
                newNums[i] = nums1[i1];
                i1++;
            } else {
                newNums[i] = nums2[i2];
                i2++;
            }
        }

        for(; i1< nums1.length; i1++, i++){
            newNums[i] = nums1[i1];
        }

        for(; i2< nums2.length; i2++, i++){
            newNums[i] = nums2[i2];
        }

        return newNums;
    }
}
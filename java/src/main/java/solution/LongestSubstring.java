import util.NotImplementException;

/**
 * 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        throw new NotImplementException();
//        int maxLength = 0;
//        for (int i = 0; i < s.length(); i++) {
//
//            int max = getMaxLength(s, i, s.length());
//            if (max <= maxLength) {
//                continue;
//            }
//
//            boolean isBigger = true;
//            int currentMax = max;
//            for (int j = i + 1; j < i + max; j++) {
//                int max2 = getMaxLength(s, j, i + max);
//                if (max2 < maxLength) {
//                    isBigger = false;
//                    break;
//                }
//
//            }
//
//            if (isBigger) {
//                maxLength = currentMax;
//            }
//        }
    }

    private int getMaxLength(String str, int startIndex, int endIndex) {
        int result = 1;
        for (int i = startIndex + 1; i < endIndex; i++) {
            if (str.charAt(i) == str.charAt(startIndex)) {
                break;
            }
            result++;
        }
        return result;
    }
}

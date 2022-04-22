package solution.data_structure;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/50ywkd/
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        var sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

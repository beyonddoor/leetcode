package solution.data_structure;

/**
 * https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/589fz2/
 *
 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

 作者：Krahets
 链接：https://leetcode-cn.com/leetbook/read/illustration-of-algorithm/589fz2/
 来源：力扣（LeetCode）
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        var sb = new StringBuilder();
        sb.append(s.substring(n, s.length()));
        sb.append(s.substring(0, n));
        return sb.toString();
    }
}

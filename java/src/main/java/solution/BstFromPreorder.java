package solution;

import leetcode.TreeNode;

/**
 * https://leetcode-cn.com/problems/construct-binary-search-tree-from-preorder-traversal/
 * 给定一个整数数组，它表示BST(即 二叉搜索树 )的 先序遍历 ，构造树并返回其根。
 * <p>
 * 保证 对于给定的测试用例，总是有可能找到具有给定需求的二叉搜索树。
 * 二叉搜索树 是一棵二叉树，其中每个节点， Node.left 的任何后代的值 严格小于 Node.val , Node.right 的任何后代的值 严格大于 Node.val。
 * 二叉树的 前序遍历 首先显示节点的值，然后遍历Node.left，最后遍历Node.right。
 * <p>
 * 输入：preorder = [8,5,1,7,10,12]
 * 输出：[8,5,10,1,7,null,12]
 */
public class BstFromPreorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        return createRecursive(preorder, 0, preorder.length);
    }

    private TreeNode createRecursive(int[] preorder, int start, int end) {
        if (start >= end) {
            return null;
        }

        var root = new TreeNode(preorder[start]);
        var splitIndex = end;
        for (int i = start + 1; i < end; i++) {
            if (preorder[i] > preorder[start]) {
                splitIndex = i;
                break;
            }
        }

        root.left = createRecursive(preorder, start + 1, splitIndex);
        root.right = createRecursive(preorder, splitIndex, end);
        return root;
    }
}

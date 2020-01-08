package tree;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Leetcode110 {

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }

    return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left)
        && isBalanced(root.right);

  }

  public int depth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(depth(root.left), depth(root.right));

  }
}
/**
 * 执行用时 : 2 ms , 在所有 Java 提交中击败了 17.10% 的用户 内存消耗 : 41.5 MB , 在所有 Java 提交中击败了 5.00% 的用户
 */
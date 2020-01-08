package tree;

public class Leetcode112 {

  public boolean hasPathSum(TreeNode root, int sum) {

    if (root == null) {
      return false;
    }

    sum -= root.val;

    if (root.left == null && root.right == null) {
      return sum == 0;
    }
    return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 37.3 MB , 在所有 Java 提交中击败了 67.76% 的用户
 */



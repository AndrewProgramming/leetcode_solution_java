package tree;

public class Leetcode101 {

  public boolean isSymmetric(TreeNode root) {
    return helper(root, root);


  }

  public boolean helper(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    return (left.val == right.val) && helper(left.left, right.right) && helper(left.right,
        right.left);
  }



}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 59.36% 的用户
 * 内存消耗 : 37.7 MB , 在所有 Java 提交中击败了 66.36% 的用户
 */
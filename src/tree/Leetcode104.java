package tree;

public class Leetcode104 {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

  }

}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 38.9 MB , 在所有 Java 提交中击败了 17.05% 的用户
 */
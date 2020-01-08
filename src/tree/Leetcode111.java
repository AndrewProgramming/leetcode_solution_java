package tree;

public class Leetcode111 {

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if(root.left == null && root.right == null) return 1;
    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
  }
}

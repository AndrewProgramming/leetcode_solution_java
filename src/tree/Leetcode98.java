package tree;

public class Leetcode98 {

  public boolean isValidBST(TreeNode root) {

    if (root == null) {
      return false;
    }

    if (root.left == null && root.right == null) {
      return true;
    }

    if (root.left==null|| root.right==null) return false;

    if (root.val < root.left.val || root.val > root.right.val) {
      return false;
    }

    if (root.val > root.left.val && root.val < root.right.val) {
      return true;
    }

    return isValidBST(root.left) && isValidBST(root.right);
  }
}

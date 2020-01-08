package linkedlist;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class Leetcode114 {

  private TreeNode pre = null;

  public void flatten(TreeNode root) {

    if (root == null) {
      return;
    }
    flatten(root.right);
    flatten(root.left);
    root.right = pre;
    root.left = null;
    pre = root;
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 36 MB , 在所有 Java 提交中击败了 81.11% 的用户
 */

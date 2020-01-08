package tree;

public class Leetcode100 {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    // p and q are both null
    if (p == null && q == null) {
      return true;
    }
    // one of p and q is null
    if (q == null || p == null) {
      return false;
    }
    if (p.val != q.val) {
      return false;
    }
    return isSameTree(p.right, q.right) &&
        isSameTree(p.left, q.left);
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 34.4 MB , 在所有 Java 提交中击败了 82.40% 的用户
 */

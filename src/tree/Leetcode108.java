package tree;

public class Leetcode108 {

  /**
   * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
   * right; TreeNode(int x) { val = x; } }
   */

  public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length - 1);

  }

  public TreeNode helper(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }

    int mid = start + (end - start) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = helper(nums, start, mid - 1);
    node.right = helper(nums, mid + 1, end);
    return node;
  }
}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 50.06% 的用户
 * 内存消耗 : 37 MB , 在所有 Java 提交中击败了 98.72% 的用户
 */


package array;

public class Leetcode162 {

  public int findPeakElement(int[] nums) {
    return helper(nums, 0, nums.length - 1);
  }

  public int helper(int[] nums, int l, int r) {
    if (l == r) {
      return l;
    }
    int mid = (l + r) / 2;
    if (nums[mid] > nums[mid + 1]) {
      return helper(nums, l, mid);
    }
    return helper(nums, mid + 1, r);
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 38.9 MB , 在所有 Java 提交中击败了 29.52% 的用户
 */

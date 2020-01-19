package dp;

public class Leetcode53 {

  public int maxSubArray(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int max = nums[0], imax = nums[0];
    for (int i = 1; i < nums.length; i++) {
      imax = Math.max(nums[i], imax + nums[i]);//重点是这里的这一步，如果说当前的元素比历史元素大，那么当前元素就更新为最新的连续数值起点
      max = Math.max(max, imax);
    }
    return max;
  }
}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 99.96% 的用户 内存消耗 : 37.1 MB , 在所有 Java 提交中击败了 96.26% 的用户
 */

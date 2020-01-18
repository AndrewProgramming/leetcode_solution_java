package dp;

public class Leetcode152 {

  /**
   * 题解动画演示
   * https://leetcode-cn.com/problems/maximum-product-subarray/solution/hua-jie-suan-fa-152-cheng-ji-zui-da-zi-xu-lie-by-g/
   */
  public int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int max = nums[0], imax = nums[0], imin = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < 0) {
        int tmp = imax;
        imax = imin;
        imin = tmp;
      }

      imax = Math.max(imax * nums[i], nums[i]);
      imin = Math.min(imin * nums[i], nums[i]);
      max = Math.max(imax, max);

    }

    return max;
  }
}
/**
 * 执行用时 : 2 ms , 在所有 Java 提交中击败了 92.60% 的用户 内存消耗 : 36.3 MB , 在所有 Java 提交中击败了 93.39% 的用户
 */

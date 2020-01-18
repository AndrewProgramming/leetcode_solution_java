package array;

import java.util.Arrays;

public class Leetcode164 {

  public int maximumGap(int[] nums) {
    if (nums.length < 2) {
      return 0;
    }

    Arrays.sort(nums);

    int[] dp = new int[nums.length + 1];

    int max = nums[1] - nums[0];

    for (int i = 2; i < nums.length; i++) {
      max = Math.max(max, nums[i] - nums[i - 1]);
    }
    return max;
  }
}
/**
 * 执行用时 : 4 ms , 在所有 Java 提交中击败了 72.26% 的用户 内存消耗 : 38.5 MB , 在所有 Java 提交中击败了 6.94% 的用户
 */
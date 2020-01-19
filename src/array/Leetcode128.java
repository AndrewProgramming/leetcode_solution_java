package array;

import java.util.Arrays;

public class Leetcode128 {

  public int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    Arrays.sort(nums);

    int max = 1, imax = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) { // 如果相等就跳过，不计数
        continue;
      } else if (nums[i] == nums[i - 1] + 1) {
        imax++;
        max = Math.max(max, imax);
      } else {
        imax = 1;
      }
    }
    return max;
  }
}
/**
 * 执行用时 : 5 ms , 在所有 Java 提交中击败了 83.28% 的用户 内存消耗 : 36.9 MB , 在所有 Java 提交中击败了 94.98% 的用户
 */
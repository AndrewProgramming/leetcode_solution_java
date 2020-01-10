package array;

import java.util.Arrays;

public class Leetcode16 {

  public int threeSumClosest(int[] nums, int target) {
    int ans = nums[0] + nums[1] + nums[2];

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      int s = i + 1;
      int e = nums.length - 1;
      while (s < e) {
        int sum = nums[i] + nums[s] + nums[e];
        if (Math.abs(target - sum) < Math.abs(target - ans)) {
          ans = sum;
        }

        if (sum > target) {
          e--;
        } else if (sum < target) {
          s++;
        } else {
          return ans;
        }
      }
    }

    return ans;
  }
}
/**
 * 执行用时 : 6 ms , 在所有 Java 提交中击败了 85.79% 的用户
 * 内存消耗 : 36.8 MB , 在所有 Java 提交中击败了 83.79% 的用户
 */

package array;

import java.util.Arrays;

public class Leetcode259 {

  public int threeSumSmaller(int[] nums, int target) {
    Arrays.sort(nums);
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum < target) {
          res = res + right - left; //同时统计多个结果，因为是有序，right左边的都可以满足

          left++;
        } else {
          right--;
        }
      }
    }
    return res;
  }
}
/**
 * 执行用时 : 3 ms , 在所有 Java 提交中击败了 99.58% 的用户 内存消耗 : 36 MB , 在所有 Java 提交中击败了 88.79% 的用户
 */

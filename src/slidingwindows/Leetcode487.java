package slidingwindows;

public class Leetcode487 {

  public int findMaxConsecutiveOnes(int[] nums) {

    int l = 0, r = 0, zeros = 0, max = 0;
    while (r < nums.length) {
      if (nums[r] == 0) {
        zeros++;
      }
      while (zeros > 1) {
        if (nums[l++] == 0) {
          zeros--;
        }
      }
      max = Math.max(max, r - l + 1);
      r++;
    }
    return max;
  }
}

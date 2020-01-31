package slidingwindows;

public class Leetcode485 {

  public int findMaxConsecutiveOnes(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int max = 0;
    int counter = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        counter++;
        max = Math.max(max, counter);
      } else {
        counter = 0;
      }
    }
    return max;
  }
}

public class Leetcode283 {

  public void moveZeroes(int[] nums) {
    int index = 0;
    for (int num : nums) {
      if (num != 0) {
        nums[index++] = num;
      }
    }
    while (index < nums.length) {
      nums[index++] = 0;
    }
  }

}

/**
 * 执行用时 :
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗 :
 * 37.1 MB
 * , 在所有 Java 提交中击败了
 * 95.82%
 * 的用户
 */

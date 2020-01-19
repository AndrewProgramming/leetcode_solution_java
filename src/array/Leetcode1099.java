package array;

import java.util.Arrays;

/**
 * 题解：https://leetcode-cn.com/problems/two-sum-less-than-k/solution/tu-jie-xiao-yu-k-de-liang-shu-zhi-he-by-misterbooo/
 */
public class Leetcode1099 {

  public int twoSumLessThanK(int[] A, int K) {
    if (A == null || A.length < 2) {
      return -1;
    }
    Arrays.sort(A);
    int left = 0;
    int right = A.length - 1;

    int result = Integer.MIN_VALUE;

    while (left < right) {
      int sum = A[left] + A[right];
      if (sum < K) {
        left++;
        result = Math.max(result, A[left] + A[right]);

      } else {
        right--;
      }
    }
    return (result == Integer.MIN_VALUE) ? -1 : result;
  }
}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 100.00% 的用户 内存消耗 : 36.6 MB , 在所有 Java 提交中击败了 6.48% 的用户
 */

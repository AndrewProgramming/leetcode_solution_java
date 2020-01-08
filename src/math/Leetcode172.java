package math;

public class Leetcode172 {

  public int trailingZeroes(int n) {
    int count = 0;
    while (n >= 5) {
      count += n / 5;
      n /= 5;
    }
    return count;
  }
}
/**
 * 执行用时: 1ms ,在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗: 33.7MB ,在所有 Java 提交中击败了 79.72% 的用户
 */

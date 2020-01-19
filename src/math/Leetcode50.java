package math;

public class Leetcode50 {

  public double myPow(double x, int n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return x;
    }
    if (n == -1) {
      return 1 / x;
    }
    double half = myPow(x, n / 2);
    double rest = myPow(x, n % 2);
    return half * half * rest;
  }
}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 99.95% 的用户 内存消耗 : 33.9 MB , 在所有 Java 提交中击败了 15.74% 的用户
 */

public class Leetcode1137 {

  public int tribonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1 || n == 2) {
      return 1;
    }

    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }
    return dp[n];

  }
}

/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户 内存消耗 : 33.1 MB , 在所有 Java 提交中击败了 29.46% 的用户
 */

package dp;

public class Leetcode121 {

  public int maxProfit(int[] prices) {
    if (prices.length < 2) {
      return 0;
    }
    int min = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      min = Math.min(min, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - min);
    }

    return maxProfit;
  }
}
/**
 * 执行用时 : 3 ms , 在所有 Java 提交中击败了 36.09% 的用户
 * 内存消耗 : 37.8 MB , 在所有 Java 提交中击败了 61.24% 的用户
 */

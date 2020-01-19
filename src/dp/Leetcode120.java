package dp;

import java.util.List;

/**
 * 解释视频
 * https://www.youtube.com/watch?v=p1LlPZYw42g&list=PLxhNaYPwn9T6Pg2yB4f0lAguaA8Ydm05Z&index=12
 */
public class Leetcode120 {

  public int minimumTotal(List<List<Integer>> triangle) {
    if (triangle == null || triangle.size() == 0) {
      return 0;
    }
    int row = triangle.size();
    int[] dp = new int[row + 1];//加1是因为右下角的节点
    for (int i = row - 1; i >= 0; i++) {
      for (int j = 0; j < i; j++) {
        dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
      }
    }

    return dp[0];
  }

}
/**
 * 执行用时 : 3 ms , 在所有 Java 提交中击败了 84.63% 的用户 内存消耗 : 37.4 MB , 在所有 Java 提交中击败了 55.01% 的用户
 */
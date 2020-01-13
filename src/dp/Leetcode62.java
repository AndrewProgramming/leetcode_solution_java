package dp;

public class Leetcode62 {

  public int uniquePaths(int m, int n) {

    int grid[][] = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0) {
          grid[i][j] = 1;
        } else {
          grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
        }
      }
    }
    return grid[m - 1][n - 1];

  }
}

/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 64.73% 的用户 内存消耗 : 32.9 MB , 在所有 Java 提交中击败了 14.90% 的用户
 */

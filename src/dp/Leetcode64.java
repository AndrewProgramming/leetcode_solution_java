package dp;

public class Leetcode64 {

  public int minPathSum(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {

        if (i == 0 && j == 0) {
          continue;
        } else if (i == 0) {
          grid[i][j] = grid[i][j - 1] + grid[i][j];
        } else if (j == 0) {
          grid[i][j] = grid[i - 1][j] + grid[i][j];
        } else {
          grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
        }
      }
    }
    return grid[grid.length - 1][grid[0].length - 1];
  }
}
/**
 * 执行用时 : 3 ms , 在所有 Java 提交中击败了 84.63% 的用户
 * 内存消耗 : 43.3 MB , 在所有 Java 提交中击败了 28.64% 的用户
 */

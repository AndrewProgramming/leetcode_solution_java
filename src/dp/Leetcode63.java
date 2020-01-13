package dp;

public class Leetcode63 {

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {

    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;

    for (int col = 0; col < n; col++) {
      if (obstacleGrid[0][col] != 1) {
        obstacleGrid[0][col] = 1;
      } else {
        while (col < n) {
          obstacleGrid[0][col] = 0;
        }
      }
    }

    for (int row = 0; row < m; row++) {
      if (obstacleGrid[row][0] != 1) {
        obstacleGrid[row][0] = 1;
      } else {
        while (row < m) {
          obstacleGrid[row][0] = 0;
        }
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (obstacleGrid[0][0] == 0) {
          return 0;
        }
      }
    }
    return obstacleGrid[m - 1][n - 1];
  }
}

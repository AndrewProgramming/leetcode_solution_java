import java.util.LinkedList;
import java.util.Queue;
//MS
//BFS way
public class Leetcode200 {

  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }
    int m = grid.length;
    int n = grid[0].length;

    int num_islands = 0;

    Queue<int[]> queue = new LinkedList<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1') {
          num_islands++;
          grid[i][j] = '*';//标记该点已经被处理了
          queue.offer(new int[]{i, j});
          bsf(grid, queue);
        }
      }
    }

    return num_islands;
  }

  private void bsf(char[][] grid, Queue<int[]> queue) {
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    while (!queue.isEmpty()) {
      int[] curNode = queue.poll();
      for (int[] dir : dirs) {
        int x = curNode[0] + dir[0];
        int y = curNode[1] + dir[1];

        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] != '1') {
          continue;
        }
        grid[x][y] = '*';
        queue.offer(new int[]{x, y});
      }

    }
  }
}
/**
 * 执行用时 : 4 ms , 在所有 Java 提交中击败了 37.35% 的用户
 * 内存消耗 : 41 MB , 在所有 Java 提交中击败了 86.78% 的用户
 */

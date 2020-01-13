package array;

import java.util.LinkedList;
import java.util.List;

public class Leetcode54 {

  public List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> res = new LinkedList<>();
    if (matrix == null || matrix.length == 0) {
      return res;
    }

    int left = 0, top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
    while (true) {

      for (int i = left; i <= right; i++) {
        res.add(matrix[top][i]);
      }
      top++;
      if (top > bottom) {
        break;
      }

      for (int i = top; i <= bottom; i++) {
        res.add(matrix[i][right]);
      }
      right--;
      if (left > right) {
        break;
      }

      for (int i = right; i >= left; i--) {
        res.add(matrix[bottom][i]);
      }
      bottom--;
      if (top > bottom) {
        break;
      }

      for (int i = bottom; i >= top; i--) {
        res.add(matrix[i][left]);
      }
      left++;
      if (left > right) {
        break;
      }
    }
    return res;
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 34.2 MB , 在所有 Java 提交中击败了 82.74% 的用户
 */

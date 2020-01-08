package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode101_2 {

  public boolean isSymmetric(TreeNode root) {

    Queue<TreeNode> queue = new LinkedList();
    if (root!=null) {
      queue.offer(root);

      while (!queue.isEmpty()) {
        List<Integer> curList = new ArrayList<>();
        int i = 0;
        int length = queue.size();

        while (i < length) {
          TreeNode cur = queue.poll();
          if (cur.left != null) {
            queue.offer(cur.left);
          }
          if (cur.right != null) {
            queue.offer(cur.right);
          }
          i++;
          curList.add(cur.val);
        }

        if (!isMirror(curList)) {
          return false;
        }

      }
    }

    return true;

  }

  private boolean isMirror(List<Integer> list) {
    int i = 0;
    int j = list.size() - 1;
    while (i < j) {
      if (list.get(i) != list.get(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }


}

package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode103 {

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if (root == null) {
      return list;
    }

    boolean flag = true;

    LinkedList<TreeNode> queue = new LinkedList<>();

    List<List<Integer>> outList = new ArrayList<>();

    queue.offer(root);

    while (!queue.isEmpty()) {
      List<Integer> innerList = new ArrayList<>();
      int length = queue.size();

      if (flag) {
        for (int i = 0; i < length; i++) {

          TreeNode node = queue.remove(0);
          innerList.add(node.val);
          if (node.left != null) {
            queue.add(node.left);
          }
          if (node.right != null) {
            queue.add(node.right);
          }

        }
      } else {
        for (int i = 0; i < length; i++) {

          TreeNode node = queue.remove(queue.size() - 1);
          innerList.add(node.val);
          if (node.left != null) {
            queue.add(node.right);
          }
          if (node.right != null) {
            queue.add(node.left);
          }

        }
      }

      flag=!flag;

      outList.add(innerList);

    }

    return outList;


  }
}

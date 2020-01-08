package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode102 {

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();

    if (root == null) {
      return list;
    }

    Queue<TreeNode> queue = new LinkedList<>();

    queue.add(root);
    while (queue.size() != 0) {
      List currentLevelList = new ArrayList();
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.remove();
        currentLevelList.add(node.val);

        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }

      }
      list.add(currentLevelList);

    }
    return list;
  }
}

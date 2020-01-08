package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode113 {

  List<List<Integer>> rlist = new ArrayList<>();


  public List<List<Integer>> pathSum(TreeNode root, int sum) {

    treePath(root, new ArrayList(), sum);
    return rlist;
  }

  private void treePath(TreeNode root, List list, int sum) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      if (sum - root.val == 0) {
        List<Integer> copy = new LinkedList<>(list);
        copy.add(root.val);
        rlist.add(copy);
      }
      return;
    }

    list.add(root.val);

    treePath(root.left, list, sum - root.val);
    treePath(root.right, list, sum - root.val);

    list.remove(list.size() - 1);


  }
}

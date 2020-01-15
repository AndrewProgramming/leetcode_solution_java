package tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode257 {

  List<String> res = new ArrayList<>();

  public List<String> binaryTreePaths(TreeNode root) {
    helper(root, "");
    return res;
  }

  private void helper(TreeNode root, String currString) {
    if (root == null) {
      return;
    }
    if (root.left == null && root.right == null) {
      res.add(currString + root.val);
    }

    helper(root.left, currString + root.val + "->");
    helper(root.right, currString + root.val + "->");
  }
}

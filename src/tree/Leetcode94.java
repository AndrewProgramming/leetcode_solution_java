package tree;

import java.util.ArrayList;
import java.util.List;

public class Leetcode94 {

  List<Integer> list = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {
    if (root == null) {
      return list;
    }
    inorderTraversal(root.left);
    list.add(root.val);
    inorderTraversal(root.right);

    return list;
  }
}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 71.34% 的用户 内存消耗 : 35 MB , 在所有 Java 提交中击败了 39.36% 的用户
 */

package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 学习：https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-xiang-jie-by-labuladong-2/
 */
public class Leetcode46 {

  List<List<Integer>> res;

  public List<List<Integer>> permute(int[] nums) {
    res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    helper(nums, list);
    return res;
  }

  private void helper(int[] nums, List<Integer> list) {
    if (nums.length == list.size()) {
      res.add(new ArrayList<>(list));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      // 排除不合法的选择
      if (list.contains(nums[i])) {
        continue;
      }
      // 做选择
      list.add(nums[i]);
      // 进入下一层决策树
      helper(nums, list);
      // 取消选择
      list.remove(list.size() - 1);
    }
  }
}
/**
 * 执行用时 : 2 ms , 在所有 Java 提交中击败了 53.62% 的用户
 * 内存消耗 : 37.4 MB , 在所有 Java 提交中击败了 92.30% 的用户
 */

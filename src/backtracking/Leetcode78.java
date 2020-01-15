package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78 {

  List<List<Integer>> res;

  public List<List<Integer>> subsets(int[] nums) {
    List<Integer> list = new ArrayList<>();
    res = new ArrayList<>();

    helper(nums, list, 0);
    return res;
  }

  private void helper(int[] nums, List<Integer> list, int starter) {
    res.add(new ArrayList<>(list));
    for (int i = starter; i < nums.length; i++) {
      list.add(nums[i]);
      helper(nums, list, i + 1);
      list.remove(list.size() - 1);
    }
  }

}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 99.30% 的用户 内存消耗 : 37.4 MB , 在所有 Java 提交中击败了 36.43% 的用户
 */

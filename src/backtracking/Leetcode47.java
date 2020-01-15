package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode47 {

  List<List<Integer>> res;

  public List<List<Integer>> permuteUnique(int[] nums) {
    res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    helper(nums, list);
    return res;
  }

  private void helper(int[] nums, List<Integer> list) {
    if (list.size() == nums.length) {
      res.add(new ArrayList<>(list));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      list.add(nums[i]);
      helper(nums,list);
      list.remove(list.size()-1);
    }
  }
}

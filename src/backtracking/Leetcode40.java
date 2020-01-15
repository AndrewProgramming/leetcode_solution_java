package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1、每一层往下搜索的时候，只能从这个数的后面开始进行搜索（而不是从这个数的位置开始进行搜索）。
 *
 * 2、还有一点可能引起重复的情况，就是同一层中，如果后面的数和前面的数相同，就会引发重复，这个时候直接continue。
 */
public class Leetcode40 {


  List<List<Integer>> res;

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    res = new ArrayList<>();

    List<Integer> list = new ArrayList<>();
    helper(candidates, target, list, 0);

    return res;

  }

  private void helper(int[] candidates, int target, List<Integer> list, int start) {
    if (target < 0) {
      return;
    } else if (target == 0) {
      res.add(new ArrayList<>(list));
    } else {
      for (int i = start; i < candidates.length; i++) {
        //对应第2点
        if (i > start && candidates[i] == candidates[i - 1]) {
          continue;
        }
        list.add(candidates[i]);
        helper(candidates, target - candidates[i], list, i + 1);//对应第1点
        list.remove(list.size() - 1);
      }
    }
  }
}
/**
 * 执行用时 : 5 ms , 在所有 Java 提交中击败了 62.51% 的用户 内存消耗 : 37.5 MB , 在所有 Java 提交中击败了 89.38% 的用户
 */
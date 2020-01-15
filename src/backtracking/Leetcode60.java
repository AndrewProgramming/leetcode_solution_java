package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Leetcode60 {

  List<List<Integer>> res;

  public String getPermutation(int n, int k) {
    res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = i + 1;
    }
    helper(a, list);

    List<Integer> s = res.get(k - 1);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.size(); i++) {
      sb.append(s.get(i));
    }
    return sb.toString();

  }

  private void helper(int[] a, List<Integer> list) {
    if (list.size() == a.length) {
      res.add(new ArrayList<>(list));
      return;
    }
    for (int i = 0; i < a.length; i++) {
      if (list.contains(a[i])) {
        continue;
      }
      list.add(a[i]);
      helper(a, list);
      list.remove(list.size() - 1);
    }
  }
}

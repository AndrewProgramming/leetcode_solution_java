package backtracking;

import java.util.ArrayList;
import java.util.List;
//https://github.com/bephrem1/backtobackswe/blob/master/Dynamic%20Programming%2C%20Recursion%2C%20%26%20Backtracking/GenerateNMatchedParenStrings/GenerateNMatchedParenStrings.java
public class Leetcode22 {


  public List<String> generateParenthesis(int n) {

    List<String> list = new ArrayList<>();

    helper(n, n, "", list);

    return list;
  }

  private void helper(int left, int right, String s, List<String> list) {
    if (left == 0 && right == 0) {
      list.add(s);
      return;
    }
    if (left > 0) {
      helper(left - 1, right, s + "(", list);
    }
    if (left < right) {
      helper(left, right - 1, s + ")", list);
    }
  }
}

/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 99.54% 的用户
 * 内存消耗 : 36.7 MB , 在所有 Java 提交中击败了 96.27% 的用户
 */

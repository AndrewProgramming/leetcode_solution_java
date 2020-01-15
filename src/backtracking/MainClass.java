package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Leetcode39 {

  List<List<Integer>> res;

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
        list.add(candidates[i]);
        helper(candidates, target - candidates[i], list, i);
        list.remove(list.size() - 1);
      }
    }
  }
}

/**
 * 执行用时 : 8 ms , 在所有 Java 提交中击败了 31.78% 的用户
 * 内存消耗 :37.2 MB , 在所有 Java 提交中击败了 97.11% 的用户
 */

public class MainClass {

  public static int[] stringToIntegerArray(String input) {
    input = input.trim();
    input = input.substring(1, input.length() - 1);
    if (input.length() == 0) {
      return new int[0];
    }

    String[] parts = input.split(",");
    int[] output = new int[parts.length];
    for (int index = 0; index < parts.length; index++) {
      String part = parts[index].trim();
      output[index] = Integer.parseInt(part);
    }
    return output;
  }

  public static String integerArrayListToString(List<Integer> nums, int length) {
    if (length == 0) {
      return "[]";
    }

    String result = "";
    for (int index = 0; index < length; index++) {
      Integer number = nums.get(index);
      result += Integer.toString(number) + ", ";
    }
    return "[" + result.substring(0, result.length() - 2) + "]";
  }

  public static String integerArrayListToString(List<Integer> nums) {
    return integerArrayListToString(nums, nums.size());
  }

  public static String int2dListToString(List<List<Integer>> nums) {
    StringBuilder sb = new StringBuilder("[");
    for (List<Integer> list : nums) {
      sb.append(integerArrayListToString(list));
      sb.append(",");
    }

    sb.setCharAt(sb.length() - 1, ']');
    return sb.toString();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line;
//        while ((line = in.readLine()) != null) {
    int[] candidates = {2, 3, 6, 7};
//    line = in.readLine();
//    int target = Integer.parseInt(line);

    List<List<Integer>> ret = new Leetcode39().combinationSum(candidates, 7);

    String out = int2dListToString(ret);

    System.out.print(out);
  }
//    }
}
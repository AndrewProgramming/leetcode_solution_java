package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> res = new ArrayList<>();
    int r[] = new int[nums.length + 2];
    r[0] = lower;
    r[1] = upper;

    System.arraycopy(nums, 0, r, 2, nums.length);

    Arrays.sort(r);

    for (int i = 1; i < nums.length; i++) {
      if (r[i] - r[i - 1] != 1) {
        String s3 = "";
        int s1 = r[i - 1] + 1;
        int s2 = r[i] - 1;
        if (s1 == s2) {
          s3 = String.valueOf(s1);
        } else {
          s3 = s1 + "->" + s2;
        }
        res.add(s3);
      }
    }
    return res;

  }
}

public class Leetcode163 {
  public static int[] stringToIntegerArray(String input) {
    input = input.trim();
    input = input.substring(1, input.length() - 1);
    if (input.length() == 0) {
      return new int[0];
    }

    String[] parts = input.split(",");
    int[] output = new int[parts.length];
    for(int index = 0; index < parts.length; index++) {
      String part = parts[index].trim();
      output[index] = Integer.parseInt(part);
    }
    return output;
  }

  public static String stringListToString(List<String> stringList) {
    StringBuilder sb = new StringBuilder("[");
    for (String item : stringList) {
      sb.append(item);
      sb.append(",");
    }

    sb.setCharAt(sb.length() - 1, ']');
    return sb.toString();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while ((line = in.readLine()) != null) {
      int[] nums = stringToIntegerArray(line);
      line = in.readLine();
      int lower = Integer.parseInt(line);
      line = in.readLine();
      int upper = Integer.parseInt(line);

      List<String> ret = new Solution().findMissingRanges(nums, lower, upper);

      String out = stringListToString(ret);

      System.out.print(out);
    }
  }
}
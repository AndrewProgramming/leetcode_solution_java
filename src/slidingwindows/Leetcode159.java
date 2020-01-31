package slidingwindows;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Leetcode159 {

  public int lengthOfLongestSubstringTwoDistinct(String s) {
    int max = 0, l = 0, r = 0, diff = 0;
    Map<Character, Integer> map = new HashMap();

    char[] arr = s.toCharArray();

    while (r < arr.length) {
      if (map.size() < 3) {
        map.put(s.charAt(r), r++);
      }
      // slidewindow contains 3 characters
      if (map.size() == 3) {
        // delete the leftmost character
        int del_idx = Collections.min(map.values());
        map.remove(s.charAt(del_idx));
        // move left pointer of the slidewindow
        l = del_idx + 1;
      }

      max = Math.max(max, r - l);

    }
    return max;
  }

  public static void main(String[] args) {
    Map<Character, Integer> map = new HashMap();
    map.put('a',200);
    map.put('b',100);
    map.put('c',150);
    System.out.println(Collections.min(map.values()));
    System.out.println(Collections.max(map.values()));
  }
}

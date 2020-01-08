import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode3_3_longest_substring_without_repeating_characters {

  /**
   * 滑动窗口的解决方案，i，j分别代表开头和结尾
   * @param s
   * @return
   */
  //medium
  public int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }

    int result = 0;

    Set<Character> set = new HashSet<>();

    int length = s.length(), i = 0, j = 0;
    while (i < length && j < length) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        result = Math.max(result, j - i + 1);
      } else {
        set.remove(s.charAt(i++));
      }
    }
    return result;

  }


  public int lengthOfLongestSubstring2(String s) {
    int n = s.length(), ans = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (int j = 0, i = 0; j < n; j++) {
      if (map.containsKey(s.charAt(j))) {
        i = Math.max(map.get(s.charAt(j)), i);
      }
      ans = Math.max(ans, j - i + 1);
      map.put(s.charAt(j), j + 1);
    }
    return ans;
  }
}

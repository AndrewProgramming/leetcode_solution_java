package array;

import java.util.HashSet;
import java.util.Set;

public class Leetcode260 {

  public int[] singleNumber(int[] nums) {

    Set<Integer> set = new HashSet<>();
    for (Integer num : nums) {
      if (!set.add(num)) {
        set.remove(num);
      }
    }

    return set.stream().mapToInt(Number::intValue).toArray();

  }

}
/**
 * 执行用时 : 10 ms , 在所有 Java 提交中击败了 16.18% 的用户
 * 内存消耗 : 37.6 MB , 在所有 Java 提交中击败了 97.90% 的用户
 */

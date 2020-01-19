package array;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


/**
 * 思想：1.排序  2.从头开始遍历，缺哪个数字就提前返回哪个； 3.如果遍历完了也没有提前返回，那就r+1。
 */

class Leetcode41 {

  public int firstMissingPositive(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 1;
    }

    Set<Integer> set = new TreeSet<>();
    for (int num : nums) {
      set.add(num);
    }
    List<Integer> list = set.stream().collect(Collectors.toList());
    int r = 0;
    for (int i = 1; i <= list.get(list.size() - 1); i++) {
      if (!set.contains(i)) {
        return r = i;
      }
      r++;
    }
    return r + 1;
  }
}
/**
 * 执行用时 : 48 ms , 在所有 Java 提交中击败了 6.57% 的用户 内存消耗 : 36.5 MB , 在所有 Java 提交中击败了 5.06% 的用户
 */


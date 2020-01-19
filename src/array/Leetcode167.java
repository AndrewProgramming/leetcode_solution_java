package array;

import java.util.HashMap;
import java.util.Map;

public class Leetcode167 {

  //map
  public int[] twoSum(int[] numbers, int target) {
    int r[] = new int[2];
    if (numbers == null) {
      return r;
    }

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      map.put(numbers[i], i);
    }
    for (int j = 0; j < numbers.length; j++) {
      if (map.containsKey(target - numbers[j])) {
        r[0] = j + 1;
        r[1] = map.get(target - numbers[j]) + 1;
        return r;
      }
    }
    return r;
  }
  /**
   * 执行用时 : 7 ms , 在所有 Java 提交中击败了 21.47% 的用户 内存消耗 : 36.9 MB , 在所有 Java 提交中击败了 93.69% 的用户
   */

  //双指针
  public int[] twoSum_2(int[] numbers, int target) {
    int r[] = new int[2];
    if (numbers.length < 2 || numbers == null) {
      return r;
    }

    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      int sum = numbers[left] + numbers[right];
      if (sum < target) {
        left++;
      } else if (sum > target) {
        right--;
      } else {
        r[0] = left + 1;
        r[1] = right + 1;
        break;
      }
    }

    return r;
  }
  /**
   * 执行用时 :
   * 1 ms
   * , 在所有 Java 提交中击败了
   * 99.04%
   * 的用户
   * 内存消耗 :
   * 37.9 MB
   * , 在所有 Java 提交中击败了
   * 24.90%
   * 的用户
   */
}




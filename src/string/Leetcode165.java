package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode165 {

  public static void main(String[] args) {


  }

  public int compareVersion(String v1, String v2) {

    if (v1 == null || v2 == null) {
      return 0;
    }
    v1 = v1.trim();
    v2 = v2.trim();

    Integer[] v1Array = convertStrToInt(v1.split("\\."));
    Integer[] v2Array = convertStrToInt(v2.split("\\."));

    int length = v1Array.length > v2Array.length ? v1Array.length : v2Array.length;

    List<Integer> list1 = new ArrayList<>(Arrays.asList(v1Array));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(v2Array));

    if (list1.size() < length) {
      int list1Size = list1.size();
      for (int i = 0; i < length - list1Size; i++) {
        list1.add(0);
      }
    } else {
      int list2Size = list2.size();
      for (int i = 0; i < length - list2Size; i++) {
        list2.add(0);
      }
    }
    for (int i = 0; i < length; i++) {
      int value1 = list1.get(i);
      int value2 = list2.get(i);

      if (value1 > value2) {
        return 1;
      } else if (value1 < value2) {
        return -1;
      }
    }
    return 0;
  }

  private Integer[] convertStrToInt(String array[]) {

    Integer[] r = new Integer[array.length];

    for (int i = 0; i < array.length; i++) {
      r[i] = Integer.parseInt(array[i]);
    }
    return r;
  }
}
/**
 * 执行用时 : 3 ms , 在所有 Java 提交中击败了 12.58% 的用户
 * 内存消耗 : 34.2 MB , 在所有 Java 提交中击败了 33.34% 的用户
 */

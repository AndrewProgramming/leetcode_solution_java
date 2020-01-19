package bit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 想法很简单：
 * 1.滑动窗口，大小为10，每次以1个单位步进
 * 2.两个set。第1个set用来判断重复；第2个set用来保存结果，因为结果有可能包含重复的，比如"AAAAAAAAAAAAAAAAAA"
 */
public class Leetcode187 {

  public List<String> findRepeatedDnaSequences(String s) {
    if (s == null || s.length() < 10) {
      return new ArrayList<>();
    }
    int length = s.length() - 9;
    Set<String> set = new HashSet<>();

    Set<String> resultSet = new HashSet<>();

    for (int i = 0; i < length; i++) {
      if (set.contains(s.substring(i, i + 10))) {
        resultSet.add(s.substring(i, i + 10));
      }
      set.add(s.substring(i, i + 10));

    }

    return resultSet.stream().collect(Collectors.toList());
  }

//  public static void main(String[] args) {
//    String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
//    System.out.println(s.length());
////    System.out.println(s.substring(10,32));

}
/**
 * 执行用时 : 30 ms , 在所有 Java 提交中击败了 43.82% 的用户 内存消耗 : 46.8 MB , 在所有 Java 提交中击败了 79.44% 的用户
 */



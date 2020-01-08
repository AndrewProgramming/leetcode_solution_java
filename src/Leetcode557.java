/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest" 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class Leetcode557 {

  public String reverseWords(String s) {
    if (s == null) {
      return s;
    }
    String r[] = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < r.length; i++) {
      StringBuilder sb1 = new StringBuilder(r[i]);
      sb1.reverse();
      sb.append(sb1);
      if (i != r.length - 1) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }
}
/**
 * 执行用时 : 27 ms, 在所有 Java 提交中击败了18.02%的用户 内存消耗 :38.2 MB, 在所有 Java 提交中击败了97.06%的用户
 */
/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 *
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 *
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * 说明：
 *
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class Leetcode151 {

  public String reverseWords(String s) {
    if (s == null) {
      return s;
    }
    String r[] = s.trim().split("\\s+");
    StringBuffer sb = new StringBuffer();

    for (int i = r.length - 1; i >= 0; i--) {
      sb.append(r[i]);
      if (i != 0) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }
}

/**
 * 执行用时 :
 * 8 ms, 在所有 Java 提交中击败了45.30%的用户
 * 内存消耗 :36.2 MB, 在所有 Java 提交中击败了99.12%的用户
 */
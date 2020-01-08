public class Leetcode14 {

  public static void main(String[] args) {
    String s = "abcdef";

    Leetcode14 ins = new Leetcode14();
    String[] a = {"flower", "flow", "flight"};
    ins.longestCommonPrefix(a);
  }

  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    String prefix = strs[0];

    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.length() == 0) {
          return "";
        }
      }
    }
    return prefix;

  }
}

/**
 * 执行用时 :
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗 :
 * 37.9 MB
 * , 在所有 Java 提交中击败了
 * 67.16%
 * 的用户
 */

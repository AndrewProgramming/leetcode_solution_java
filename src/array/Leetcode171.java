package array;

public class Leetcode171 {

  public static void main(String[] args) {
    Leetcode171 ins = new Leetcode171();
    ins.titleToNumber("AAA");
  }

  public int titleToNumber(String s) {
    int ans = 0;
    for (int i = 0; i < s.length(); i++) {
      int num = s.charAt(i) - 'A' + 1;
      ans = ans * 26 + num;
    }
    return ans;
  }

}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 36 MB , 在所有 Java 提交中击败了 37.20% 的用户
 */

package array;

public class Leetcode168 {

  public String convertToTitle(int n) {
    StringBuilder stringBuilder = new StringBuilder();
    while (n != 0) {
      n--;
      stringBuilder.append((char) (n % 26 + 'A'));
      n /= 26;
    }
    return stringBuilder.reverse().toString();
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 34 MB , 在所有 Java 提交中击败了 83.37% 的用户
 */
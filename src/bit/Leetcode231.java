package bit;

/**
 * 题解:https://www.jianshu.com/p/830bb677e1e1
 */
public class Leetcode231 {

  public boolean isPowerOfTwo(int n) {
    return (n > 0) && ((n - 1) & n) == 0;
  }
}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 100.00% 的用户 内存消耗 : 33.4 MB , 在所有 Java 提交中击败了 79.08% 的用户
 */

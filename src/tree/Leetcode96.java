package tree;
//https://leetcode-cn.com/problems/unique-binary-search-trees/solution/bu-tong-de-er-cha-sou-suo-shu-by-leetcode/

public class Leetcode96 {

  public int numTrees(int n) {
    int[] G = new int[n + 1];
    G[0] = 1;
    G[1] = 1;

    for (int i = 2; i <= n; ++i) {
      for (int j = 1; j <= i; ++j) {
        G[i] += G[j - 1] * G[i - j];
      }
    }
    return G[n];
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 32.8 MB , 在所有 Java 提交中击败了 12.25% 的用户
 */


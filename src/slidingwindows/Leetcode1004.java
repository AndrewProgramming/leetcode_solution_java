package slidingwindows;

public class Leetcode1004 {

  public int longestOnes(int[] A, int K) {
    int max = 0, l = 0, r = 0, zeros = 0;

    while (r < A.length) {
      if (A[r] == 0) {
        zeros++;
      }

      while (zeros > K) {
        if (A[l++] == 0) {
          zeros--;
        }
      }
      max = Math.max(max, r - l + 1);
      r++;
    }

    return max;
  }
}

package array;

public class Leetcode189 {

  public void rotate(int[] nums, int k) {
    int r[] = new int[nums.length];

    k = k % nums.length;//这里必须取模一下，因为有可能要旋转的长度超过了数组的长度

    int l = nums.length - k;

    for (int i = 0; i < k; i++) {
      r[i] = nums[l++];
    }

    l = nums.length - k;

    for (int i = 0; i < l; i++) {
      r[k++] = nums[i];
    }
    System.arraycopy(r, 0, nums, 0, nums.length);
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 37.6 MB , 在所有 Java 提交中击败了 17.85% 的用户
 */
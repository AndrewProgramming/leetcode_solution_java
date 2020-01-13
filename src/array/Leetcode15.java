package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {

  public static void main(String[] args) {
    Leetcode15 ins = new Leetcode15();
    int a[] = {-2, 0, 0, 2, 2};
    ins.threeSum(a);
  }

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> rlist = new ArrayList<>();
    if (nums == null || nums.length < 3) {
      return rlist;
    }
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        break;
      }

      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int s = i + 1;
      int e = nums.length - 1;
      while (s < e) {
        int sum = nums[i] + nums[s] + nums[e];
        if (sum == 0) {
          rlist.add(Arrays.asList(nums[i], nums[s], nums[e]));
          while (s < e && nums[s] == nums[s + 1]) {
            s++;
          }
          while (s < e && nums[e] == nums[e - 1]) {
            e--;
          }
          s++;
          e--;
        }
        if (sum < 0) {
          s++;
        } else if (sum > 0) {
          e--;
        }
      }
    }

    return rlist;

  }
}
/**
 * 执行用时 : 31 ms , 在所有 Java 提交中击败了 97.09% 的用户 内存消耗 : 47.5 MB , 在所有 Java 提交中击败了 94.36% 的用户
 */

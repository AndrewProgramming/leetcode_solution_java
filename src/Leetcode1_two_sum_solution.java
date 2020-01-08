import java.util.HashMap;
import java.util.Map;
//easy
public class Leetcode1_two_sum_solution {

  public int[] twoSum(int[] nums, int target) {
    int r[] = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        r[0] = i;
        r[1] = map.get(target - nums[i]);
        break;
      }
      map.put(nums[i], i);
    }
    return r;
  }
}

/*
Success
Details
Runtime: 2 ms, faster than 98.91% of Java online submissions for Two Sum.
Memory Usage: 37.4 MB, less than 98.95% of Java online submissions for Two Sum.
*/

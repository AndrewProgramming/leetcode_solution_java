package backtracking;

public class Leetcode55 {

    public boolean canJump(int[] nums) {
        return helper(0, nums);

    }

    private boolean helper(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }
        int furthestJump = Math.min(position + nums[position], nums.length - 1);

        for (int i = position + 1; i <= furthestJump; i++) {
            return helper(i, nums);
        }

        return false;
    }

}
//超时

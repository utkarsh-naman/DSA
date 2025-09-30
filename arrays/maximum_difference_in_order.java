// https://leetcode.com/problems/maximum-difference-between-increasing-elements/description


// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

package arrays;

public class maximum_difference_in_order {
  public static int solution(int[] nums) {
        int min = nums[0];
        int n= nums.length;
        int maxd;
        if (n < 2)
            return -1;
        maxd = nums[1] - nums[0];
        for (int i = 1; i < n; i++){
            maxd = Math.max(maxd, nums[i]-min);
            min = Math.min(min, nums[i]);
        }

        return (maxd > 0)? maxd: -1;
    }
}

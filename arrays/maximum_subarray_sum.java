package arrays;

public class maximum_subarray_sum {
  public static void main(String[] args) {
    // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    int[] nums = {-2, 1};
    System.out.println(solution(nums));
  }

  public static int solution(int[] nums) {
    int n = nums.length;
    int[] max_sum = new int[n];
    max_sum[0] = nums[0];
    int max = nums[0];
    for (int i  = 1; i < n; i++){
      max_sum[i] = Math.max(nums[i], nums[i]+max_sum[i-1]);
      max = Math.max(max, max_sum[i]);
    }
    return max;
  }
}

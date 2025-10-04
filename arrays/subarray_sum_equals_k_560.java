package arrays;

public class subarray_sum_equals_k_560 {
  public int subarraySum(int[] nums, int k) {
        // use hashmap for efficient solution
        return naiveSolution(nums, k);
  }

  public int naiveSolution(int[] nums, int k){
      int n = nums.length;
      int count = 0;
      int sum = 0;
      for (int i = 0; i < n; i++){
          sum = 0;
          for (int j = i; j < n; j++){
              sum += nums[j];
              if (sum == k){
                  count++;
              }
          }
      }

      return count;
  }
}

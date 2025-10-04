package arrays;

public class range_sum_query_303 {
  private int[] prefix_sum;
  public range_sum_query_303(int[] nums) {
        int n = nums.length;
        prefix_sum = new int[n];
        prefix_sum[0] = nums[0];
        for (int i = 1; i < n; i++){
            prefix_sum[i] = prefix_sum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if (left == 0)
            return prefix_sum[right];
        else
            return prefix_sum[right] - prefix_sum[left-1];
    }

    public class NumArray {

      public int sumRange(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sumRange'");
      }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
package searching;

public class repeating_element_ii {
  public static int solution(int[] nums){
    int n = nums.length;
    int all_sum = 0;
    int max = 1;
    for (int i = 0; i < n; i++){
      all_sum += nums[i];
      if (nums[i] > max)
        max = nums[i];
    }
    // int extra_repeat_count = n-1-max;
    // int natural_sum = max*(max+1)/2;
    // int repeated = (all_sum-natural_sum)/extra_repeat_count;
    // return repeated;
    return ( all_sum - max*(max+1)/2 )/(n-max);
  }
}

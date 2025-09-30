package arrays;

public class longest_even_odd_subarray_with_threshold {

  public static int solution(int[] nums, int threshold) {
    int count = 0;
    int max = 0;
    int n = nums.length;
    for (int i = 0; i < n; i++){
        if ((nums[i]%2 == 0 && nums[i] <= threshold && count%2 == 0) || (nums[i]%2 != 0 && nums[i] <= threshold && count%2 != 0)){
            count++;
            max = Math.max(max, count);
        }

        else if (nums[i]%2 == 0 && nums[i] <= threshold){
            count = 1;
            continue;
        }

        else {
            count = 0;
            continue;
        }
    }
    return max;
  }
}
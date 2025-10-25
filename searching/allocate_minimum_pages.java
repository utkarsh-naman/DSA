package searching;

public class allocate_minimum_pages {

  public static int solution(int[] nums, int k){
    int sum = 0;
    int max = 0;
    int n = nums.length;
    for (int i = 0; i < n; i++){
      sum+=nums[i];
      max = Math.max(max, nums[i]);
    }
    int result = 0;
    int mid;
    int start = max;
    int end = sum;

    while (start <= end){
      mid = (start+end)/2;
      if (isFeasible(nums, n, k, mid)){
        end = mid-1;
        result = mid;
      }
      else 
        start = mid+1;
    }
    return result;
  }
  public static boolean isFeasible(int[] nums, int n, int k, int answer){
    int s = 0;
    int req = 1;
    for (int i = 0; i < n; i++){
      if (s+nums[i]>answer){
        s = nums[i];
        req++;
      }
      else
        s += nums[i];
    }
    return (req <= k);
  }
}
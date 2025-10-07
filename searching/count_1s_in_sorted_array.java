package searching;

public class count_1s_in_sorted_array {
  public static int solution(int[] nums){
    int f = fo(nums, 1);
    if (f == -1)
      return 0;
    return nums.length-f;
  }
  public static int fo(int[] nums, int target) {
    int n = nums.length;
    int index = -1;
    int start = 0;
    int end = n;
    int mid;
    while (start < end){
      mid = start + (end-start)/2;
      if (target < nums[mid])
          end = mid;
      else if (target > nums[mid])
          start = mid+1;
      else{
        index = mid;
        end = mid;
      }
    }
    return index;
  }
}

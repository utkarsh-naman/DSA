package searching;

public class count_occurrences_in_sorted_array {
  public static int solution(int[] nums, int target) {
    int f = fo(nums, target);
    int l = lo(nums, target);
    if (f == -1)
      return 0;
    return l-f+1;
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


  public static int lo(int[] nums, int target) {
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
        start = mid+1;
      }
    }
    return index;
  }


}

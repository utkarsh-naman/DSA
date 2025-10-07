package searching;

public class index_of_last_occurrence {
  public static int solution(int[] nums, int target) {
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

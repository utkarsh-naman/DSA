package sorting;

public class selection_sort {
  public static void solution(int[] nums){
    int n = nums.length;
    if (n < 2)
      return;

    int min = 0;
    for (int i = 0; i < n-1 ; i++){
      min = i;
      for (int j = i+1; j < n ; j++){
        if (nums[j] < nums[min]){
          min = j;
        }
      }
      if (nums[min] < nums[i]){
        nums[i] = nums[i]^nums[min];
        nums[min] = nums[i]^nums[min];
        nums[i] = nums[i]^nums[min];
      }
    }
  }
}

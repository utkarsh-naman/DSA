package sorting;

import java.util.Arrays;

public class insertion_sort {
  public static void solution(int[] nums){
    int n = nums.length;
    int temp;
    int sorted = 0;
    for (int i = sorted+1; i < n; i++){
      
      if (nums[i] < nums[i-1]){
        for (int j = i; j>0; j--){
          if (nums[j] < nums[j-1]){
            temp = nums[j-1];
            nums[j-1] = nums[j];
            nums[j] = temp;
          }
          else
            continue;
        }
      } 
    }
  }
}

package sorting;

import java.util.Arrays;

public class merge_sort {
  public static void solution(int[] nums) {
    int[] temp = new int[nums.length];
    recurse(nums, 0, nums.length-1, temp);
  }

  public static void recurse (int[] nums, int start, int end, int[] temp){
    if (start >= end)
      return;

    int mid = start + (end-start)/2;
    recurse(nums, start, mid, temp);
    recurse(nums, mid+1, end, temp);
    merge(nums, start, mid, end, temp);
  }

  public static void merge(int[] nums, int start, int mid, int end, int[] secondary_arr){

    for (int i = 0; i < end-mid; i++){
      secondary_arr[i] = nums[mid+1+i];
    }

    int i = mid;
    int j = end-mid-1;
    int k = end;
    while (i >= start && j >= 0){
      if (nums[i] > secondary_arr[j])
        nums[k--] = nums[i--];
      else
        nums[k--] = secondary_arr[j--];
    }

    while (j >= 0){
      nums[k--] = secondary_arr[j--];
    }
  }
}

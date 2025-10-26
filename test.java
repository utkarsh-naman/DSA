import sorting.intersection_of_sorted_arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;

public class test {
  public static void main(String[] args){
    //int nums[] = {0,1,0,0,1};
    int nums1[] = {0, 1, 1, 1, 2, 3, 7, 11, 23};
    int nums2[] = { 1, 2, 2, 3, 4, 4,7, 45};
    List<Integer> result = (intersection_of_sorted_arrays.solution(nums1, nums2));
    System.out.println(result.toString());
  }

  
}

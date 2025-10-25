import sorting.merge_sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;

public class test {
  public static void main(String[] args){
    //int nums[] = {0,1,0,0,1};
    int nums1[] = {8, 3, 7, 4, 9, 2};
    merge_sort.solution(nums1);
    System.out.println(Arrays.toString(nums1));
  }

  
}

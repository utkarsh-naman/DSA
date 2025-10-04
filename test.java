import arrays.range_sum_query_303;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class test {
  public static void main(String[] args){
    //int nums[] = {0,1,0,0,1};
    int nums[] = {1,2,3,4,5,6,7,8,9};
    range_sum_query_303 obj = new range_sum_query_303(nums);
    int param_1 = obj.sumRange(2,4);
    System.out.println(param_1);

    
  }

}

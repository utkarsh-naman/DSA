// https://leetcode.com/problems/rotate-array/description/

package arrays;

public class rotate_array_by_one_place {

  public static void main(String[] args){
    //your code here
  }

  public static void solution(int[] arr){
    int n = arr.length;
    int temp;
    if (n >=1){
      temp = arr[0];
      for (int i = 1; i < arr.length; i++){
        arr[i-1] = arr[i];
      }
      arr[n-1] = temp;
    }
  }
}
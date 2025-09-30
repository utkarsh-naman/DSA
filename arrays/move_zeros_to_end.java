// https://leetcode.com/problems/move-zeroes

package arrays;
import java.util.List;
import java.util.ArrayList;
public class move_zeros_to_end {

  public static void main(String[] args){
    // your code here
  }
  public static int[] solution(int arr[]){
    int count = 0;
    for (int i = 0; i< arr.length; i++){
      if ( arr[i] != 0){
        swap(arr, i, count);
        count++;
      }
    }
    return arr;
  }


  public static void swap(int arr[], int index1, int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
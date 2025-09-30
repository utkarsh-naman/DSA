package arrays;

import java.util.ArrayList;
import java.util.List;
public class leaders_in_array {

  public static void main(String[] args) {
    
  }

  public static List<Integer> solution(int[] arr) {
    List<Integer> soln = new ArrayList<>();
    int n = arr.length;
    int current_max  = arr[n-1];
    soln.add(current_max);

    if (n < 2)
      return soln;
    
    for (int i = n-2; i >= 0; i--){
      if (arr[i] > current_max){
        soln.add(arr[i]);
        current_max = arr[i];
      }
    }
    return soln;
  }
}
package arrays;

import java.util.List;
import java.util.ArrayList;

public class remove_duplicate_in_sorted_array {
  public static List<Integer> solution(int arr[]){
    List<Integer> result = new ArrayList<>();
    result.add(arr[0]);
    if (arr.length >= 2 && arr[0] < arr[arr.length-1]){
      for (int i = 1; i < arr.length; i++){
        if (arr[i] > result.get(result.size()-1))
          result.add(arr[i]);
      }
    }
    else{
      for (int i = 1; i < arr.length; i++){
        if (arr[i] < result.get(result.size()-1))
          result.add(arr[i]);
      }
    }
    return result;
  }
}

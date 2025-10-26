package sorting;

import java.util.ArrayList;
import java.util.List;

public class union_of_sorted_arrays {
  public static List<Integer> solution(int[] num1, int[] num2){
    List<Integer> result = new ArrayList<>();
    
    int m = num1.length;
    int n = num2.length;

    int i = 0, j = 0;
    
    while (i < m && j < n){
      if (num1[i] <= num2[j]){
        if (result.isEmpty() || result.get(result.size()-1) != num1[i]){
          result.add(num1[i]);
        }
        i++;
      }

      else {
        if (result.isEmpty() || result.get(result.size()-1) != num2[j]){
          result.add(num2[j]);
        }
        j++;
      }
    }

    System.out.println("i: "+ i + "j: " +j);
    while (i < m){
      if (result.isEmpty() || result.get(result.size()-1) != num1[i]){
        result.add(num1[i]);
      }
      i++;
    }

    while (j < n){
      if (result.isEmpty() || result.get(result.size()-1) != num2[j]){
        result.add(num2[j]);
      }
      j++;
    }
    return result;
  }
}

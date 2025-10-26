package sorting;

import java.util.ArrayList;
import java.util.List;

public class intersection_of_sorted_arrays {
  public static List<Integer> solution(int[] nums1, int[] nums2){
  
    int m = nums1.length;
    int n = nums2.length;

    List<Integer> result = new ArrayList<>();

    int i = 0, j = 0;

    while (i < m && j < n){
      if (nums2[j] == nums1[i]){
        if(result.isEmpty() || result.get(result.size()-1) != nums1[i]){
          result.add(nums1[i]);
        }
        i++;
        j++;
      }

      else if (nums2[j] > nums1[i]){
        i++;
      }

      else{
        j++;
      }
    }
    

    return result;
  }
}

package recursion;

import java.util.ArrayList;
import java.util.List;

public class subset_sum {
  public static void main(String[] args){
    // test your code here
    System.out.println("your code");
  }

  public static List<List<Integer>> solution(List<Integer> arr, int sum){
    List<List<Integer>> soln_set = new ArrayList<>();
    if (sum == 0)
      soln_set.add(new ArrayList<>());
    List<List<Integer>> subset_set = new ArrayList<>();
    subset_set.add(new ArrayList<>());
    return soln_helper(soln_set, arr, sum, arr.size()-1, subset_set);
  }
  
  public static int count(List<Integer> arr, int sum, int index){
    if (index < 0)
      return (sum == 0)? 1: 0;
    
      return count(arr, sum, index-1)+count(arr, (sum-arr.get(index)), index-1);
  }

  public static List<List<Integer>> soln_helper(List<List<Integer>> soln_set, List<Integer> arr, int sum, int index, List<List<Integer>> subset_set){
    
    if (index < 0){
      return soln_set;
    }

    List<List<Integer>> copy_subset_set = new ArrayList<>();
    
    for (List<Integer> subset : subset_set){
      List<Integer> newSubset = new ArrayList<>(subset);  // copy
      newSubset.add(arr.get(index));                      // safe mutation
      copy_subset_set.add(newSubset);                     // add copy, not original
      if (sum_checker(newSubset, sum))
          soln_set.add(newSubset);
    }

    
    subset_set.addAll(copy_subset_set);

    soln_helper(soln_set, arr, sum, index-1, subset_set);

    return soln_set;
  }

  public static boolean sum_checker(List<Integer> subset, int sum){
    int sigma = 0;
    for (int elements : subset){
      sigma+= elements;
      if (sigma > sum)
        return false;
    }

    return (sigma==sum)? true: false;
  }

}

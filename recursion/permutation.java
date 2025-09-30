package recursion;

import java.util.ArrayList;
import java.util.List;


public class permutation{
  public static void main(String args[]){
    // your code here
  }

  public static List<String> solution(String s){
    List<String> solution_set = new ArrayList<>();
    return solution_helper(s, solution_set, 0);
  } 

  public static List<String> solution_helper(String s, List<String> soln, int index){
    if (index == s.length()-1){
      soln.add(s);
      return soln;
    }

    for(int i = index; i < s.length(); i++){

      if (index != i){
      s = s.substring(0, index)+s.charAt(i)+s.substring(index+1, i)+s.charAt(index)+s.substring(i+1, s.length());
      }
      solution_helper(s, soln, index+1);
      if (index != i){
      s = s.substring(0, index)+s.charAt(i)+s.substring(index+1, i)+s.charAt(index)+s.substring(i+1, s.length());
    }}
    return soln;
  }

}
package recursion;
import java.util.ArrayList;
import java.util.List;

public class string_subset {
  public static void main(String[] args){
    System.out.println("lalalala");
  }

  public static List<String> solution(String s){
    List<String> soln= new ArrayList<>();
    return soln_helper(s, soln, s.length());
  }

  private static List<String> soln_helper(String s, List<String> soln, int l){
    String subString = s.substring(0, l);
    if (l == 0){
      soln.add("");
      return soln;
    }
    

    soln = soln_helper(s, soln, l-1);
    int loop_size  = soln.size();
    for (int i = 0; i < loop_size; i++){
      String element = soln.get(i);
      char last_char = s.charAt(l-1);
      soln.add(element+last_char);
    }
    return soln;
  }
}

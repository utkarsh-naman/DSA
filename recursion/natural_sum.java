package recursion;

public class natural_sum {
  public static void main(String[] args){
    System.out.println("lalalala");
  }

  public static int solution(int n){
    return solution_helper(n, 0);
  }

  private static int solution_helper(int n, int acc){
    return n <= 1 ? acc+n: solution_helper(n-1, acc+n);
  }
}

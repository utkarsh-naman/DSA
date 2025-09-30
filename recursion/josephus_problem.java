package recursion;
public class josephus_problem {
  public static void main(String[] artgs){
  }
  public static int solution(int n, int k){
    return solution_helper(n, k);
  }
  private static int solution_helper(int n, int k){
    if (n == 1) return 0;
    return (solution_helper(n-1, k)+k)%n;
  }
} 
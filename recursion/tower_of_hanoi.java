package recursion;

public class tower_of_hanoi {
  public static void main(String[] args){

  }

  public static void solution(int n){
    solution_helper(n, 'a', 'b', 'c');
  }
  private static void solution_helper(int n, char init, char aux, char target){
    if (n <=0) return;
    solution_helper(n-1, init, target, aux);
    System.out.println("Move disc "+n+" from tower "+ init+ " to tower "+target);
    solution_helper(n-1, aux, init, target);
  }
}
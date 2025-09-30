package recursion;
import java.util.Scanner;

public class ropecutting {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values of n a b c ");
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
  }

  public static int solution(int n, int a, int b, int c){
    if (n == 0) return 0;
    if (n < 0) return -1;

    int res = Math.max(solution(n-a, a, b ,c), Math.max(solution(n-b, a, b ,c), solution(n-c, a, b ,c)));
    if (res == -1) return -1;
    return res+1;
  }
}

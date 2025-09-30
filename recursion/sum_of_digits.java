package recursion;

public class sum_of_digits {
  public void main(String[] args){

  }

  public int solution(int n){
    if (n < 10) return n;
    return solution(n/10) + n%10;
  }
}

package searching;

public class square_root {
  public int solution(int x) {
    long num = x;
    if (num <= 1)
        return (int) num;
    long start = 0;
    long end = num;
    long mid;
    long index = 0;
    int ans = 0;
    while (start < end){
      mid = start + (end-start)/2;
      if (mid*mid > num){
          end = mid;
      }
      else if (mid*mid < num){
          start = mid+1;
          index = mid;
          ans = (int) index;
      }
      else
          return (int) mid;
    }
    ans = (int) index;
    return ans;
  }
}

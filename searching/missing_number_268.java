package searching;

public class missing_number_268 {
  public static int solution(int nums[]){
    int n = nums.length;
    int nat_sum = n*(n+1)/2;
    int all_sum = 0;
    for (int i = 0; i < n; i++){
        all_sum += nums[i];
    }

    return nat_sum - all_sum;
  }
}

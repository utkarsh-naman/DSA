package arrays;

public class pivot_index_724 {
  public static int solution(int[] nums) {
    int n = nums.length;
    int prefix[] = new int[n];
    prefix[0] = nums[0];
    for (int i=1; i<n; i++){
      prefix[i] = prefix[i-1]+nums[i];
    }

    if (prefix[n-1] - prefix[0] == 0)
      return 0;
    for (int i = 1; i<n; i++){
      if (prefix[i-1] == prefix[n-1]-prefix[i])
        return i;
    }
    return -1;
  }
}
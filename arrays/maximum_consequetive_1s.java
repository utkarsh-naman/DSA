package arrays;

public class maximum_consequetive_1s {
  public static void main(String[] args) {
    int arr[] = { 0,1,1,0,0,1,1,1,1,0,1,1,1,1,1,0,0,0};
    System.out.println(solution(arr));
  }

  public static int solution(int[] nums) {
    int count = 0;
    int max = 0;
    int n = nums.length;
    for (int i = 0; i < n; i++){
      if (nums[i] == 0)
        count = 0;

      else {
        count++;
        if (count > max)
          max = count;
      }
    }
    return max;
  }

  
}
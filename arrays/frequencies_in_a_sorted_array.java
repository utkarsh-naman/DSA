package arrays;

public class frequencies_in_a_sorted_array {
  public static void solution(int[] nums) {
    int cunt = 1;
    int n = nums.length;
    for (int i = 1; i < n; i++){
      if (nums[i] != nums[i-1]){
        System.out.println(nums[i-1] + ": " + cunt);
        cunt = 0;
      }
      cunt++;
    }
    System.out.println(nums[n-1]+": "+cunt);
  }
}

package arrays;

public class majority_element {
  public static int solution(int[] nums){
    int n = nums.length;
    int candidate = nums[0];
    int count = 1;
    for (int i = 1; i < n; i++){
      if (nums[i] == nums[candidate]){
        count++;
      }

      else 
        count--;
      
        if (count == 0){
          candidate = i;
          count = 1;
        }

        if (count > n/2)
          return nums[candidate];
    }
    
    count = 0;
    for (int i = 0; i < n; i++){
      if (nums[i] == nums[candidate])
        count++;
      if (count > n/2)
        return nums[candidate]; 
    }
    return -1;
  }
}

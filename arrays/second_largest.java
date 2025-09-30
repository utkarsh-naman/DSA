package arrays;

public class second_largest {
  public static void main (String args[]){
    //your code here
  }

  public static int solution(int nums[]){
    int max = 0;
    int max2 = -1;
    for (int i = 0; i < nums.length; i++){
      if (nums[i] > nums[max]){
        max2 = max;
        max = i;
      }
      else if (max2 != -1 && nums[i] > nums[max2]){
        max2 = i;
      }
      else if (max2 == -1 && nums[i] < nums[max]){
        max2 = i;
      }
    }
    return (max2!=-1)?nums[max2]: -1;
  }
}

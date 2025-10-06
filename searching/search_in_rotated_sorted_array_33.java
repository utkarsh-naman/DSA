package searching;

public class search_in_rotated_sorted_array_33 {
    public static int solution(int[] nums, int target) {
        int n = nums.length;
        int index = findk(nums);
        if (index == n)
            return bs(nums, 0,n,target);
        if (nums[0] <= target && target <= nums[index-1])
            return bs(nums, 0, index,target);
        else
            return bs(nums, index, n, target);
    }

    public static int findk(int nums[]){
      int index= nums.length;
      int start = 0;
      int end = nums.length-1;
      int mid;
      while (start < end){
        mid = start + (end-start)/2;
        if(nums[0] <= nums[mid]){
          start = mid+1;
          index = start;}
        else if (nums[0]>=nums[mid]){
          index = mid;
          end = mid;}
      }
      return index;
    }

    public static int bs (int[] nums, int start, int end, int target){
        int mid;
        while (start < end){
            mid = start + (end-start)/2;
            if (target < nums[mid])
                end = mid;
            else if (target > nums[mid])
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }

    
}

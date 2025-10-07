package searching;

public class find_peak_element_162 {
  public int solution(int[] nums) {
        int n = nums.length;

        int start = 0;
        int end = n;
        while(start < end){
            int mid = start + (end-start)/2;
            if ( (mid == 0 || nums[mid-1] <= nums[mid]) && (mid == n-1 || nums[mid] >= nums[mid+1]) )
                return mid;
            if (mid > 0 && nums[mid] <= nums[mid-1])
                end = mid;
            else
                start = mid+1; 
            
        }
        return -1;
    }
}

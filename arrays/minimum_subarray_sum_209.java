package arrays;

public class minimum_subarray_sum_209 {
  // public int solution(int target, int[] nums) {
  //     // prefix sum approach

  //     int n = nums.length;
  //     long[] prefix = new long[n];
  //     prefix[0] = nums[0];
  //     for (int i = 1; i<n; i++){
  //         if (nums[i] >= target)
  //             return 1;
  //         prefix[i] = prefix[i-1] + nums[i];
  //     }


  //     int s = bs(prefix, n, target);
  //     // System.out.println("s= "+s);
  //     int length = s;
  //     int min = Integer.MAX_VALUE;
  //     long sum;
  //     int index = 0;
  //     for (int  i = s; i <n; i++){
  //         sum = prefix[i];
  //         index = 0;
  //         length = i+1;
  //         min = Math.min(min, length);
  //         // System.out.println("sum: "+sum+" index: "+index+" length: "+length+" min: "+min);
  //         while (prefix[i]-prefix[index]>=target){
              
  //             sum -= prefix[index];
  //             index++;
  //             length--;
  //             min = Math.min(min, length);
  //             // System.out.println("sum: "+sum+" index: "+index+" length: "+length+" min: "+min);
  //         }
  //     }
  //     return (min == Integer.MAX_VALUE)? 0: min;

  // }

  //approach 2 with bs in loop

  // public int solution(int target, int[] nums) {
  //     // prefix sum approach

  //     int n = nums.length;
  //     long[] prefix = new long[n];
  //     prefix[0] = nums[0];
  //     for (int i = 1; i<n; i++){
  //         if (nums[i] >= target)
  //             return 1;
  //         prefix[i] = prefix[i-1] + nums[i];
  //     }


  //     int s = bs(prefix, n, target);
  //     // System.out.println("s= "+s);
  //     int length = s;
  //     int min = Integer.MAX_VALUE;
  //     long sum;
  //     int index = 0;
  //     long lookup;
  //     for (int  e = s; e <n; e++){
  //         s = 0;
  //         lookup = prefix[e]-target;
  //         s = bs(prefix, n, lookup);
  //         if (prefix[s] == lookup)
  //             min = Math.min(min, e-s);
  //         else{
  //             min = Math.min(min, e+1-s);
  //         }

  //     }
  //     return (min == Integer.MAX_VALUE)? 0: min;

  // }
  // public int bs(long[] prefix, int n, long target){
  //     int start = 0;
  //     int end = n;
  //     int mid;
  //     while (start < end){
  //         mid = start + (end - start)/2;
  //         if (target < prefix[mid])
  //             end = mid;
  //         else if (target > prefix[mid])
  //             start = mid+1;
  //         else
  //             return mid;
  //     }
  //     return start;
  // }

  public int solution(int target, int[] nums) {
      int n = nums.length;
      int sum = 0;
      int min = Integer.MAX_VALUE;
      int s= 0;
      for (int e = 0; e < n; e++){
          sum += nums[e];
          while (sum >= target){
              min = Math.min(min, e+1-s);
              sum -= nums[s];
              s++;
          }
      }
      return (min == Integer.MAX_VALUE)? 0: min;

  }

}

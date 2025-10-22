package searching;

public class median_of_two_sorted_arrays_4 {
  public static double solution(int nums1[], int nums2[]){
    int m = nums1.length;
    int n = nums2.length;
    if (m > n)
      solution(nums2, nums1);

    int start = 0, end = m;
    int leftA, leftB, rightA, rightB;

    int i,j;
    while (start < end){
      i = start + (end - start)/2;
      j = (m+n+1)/2 - i;

      leftA = (i == 0)? Integer.MIN_VALUE : nums1[i-1];
      leftB = (j == 0)? Integer.MIN_VALUE : nums2[j-1];
      rightA = (i == m)? Integer.MAX_VALUE : nums1[i];
      rightB = (j == n)? Integer.MAX_VALUE : nums2[j];

      if (leftA < rightB && leftB < rightA){
        return ((m+n)/2 == 0)? (double)(Math.max(leftA, leftB) + Math.min(rightA, rightB))/2 : (double) Math.max(leftA, leftB);
      }

      else if (leftA > rightB)
        end = i-1;
      else
        start = i+1;
    }
    return 0.0;
  }
}

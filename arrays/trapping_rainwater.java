// https://leetcode.com/problems/trapping-rain-water/description/

package arrays;

public class trapping_rainwater {
  public static void main(String[] args) {
    // your code here
    // int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    // // int[] height = {4,2,0,3,2,5};
    // // int[] height = {4,2,0,3,2,4,3,4};
    // System.out.println(trap(height));    
  }
  public static int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int leftmax = 0;
        int rightmax = height[n-1];

        


        for (int i = leftmax; i < n; i++){
            //finding left max
            for (int l = i+1; l < n; l++){
                if (height[l] >= height[leftmax]){
                    leftmax = l;
                }
                else {
                    break;
                }
            }

            
            i = leftmax;

            // System.out.println("leftmax: "+ leftmax);
            
            
            rightmax = leftmax+1;
            // finding rightmax index
            for (int j = leftmax+1; j < n; j++){
                if (height[j] >= height[leftmax]){
                    rightmax = j;
                    break;
                }

                else {
                    if (height[j] >= height[rightmax])
                        rightmax = j; 
                }
            }

            // System.out.println("rightmax: "+ rightmax);
            
            if (rightmax == leftmax+1){
                leftmax = rightmax;
                rightmax = leftmax+1;
                continue;
            }
            // System.out.println("leftmax: "+ leftmax+" rightmax: "+rightmax);
            for (i = leftmax+1; i < rightmax; i++)
            if (Math.min(height[leftmax], height[rightmax]) - height[i] > 0){
                water += Math.min(height[leftmax], height[rightmax]) - height[i];
                // System.out.println("water: "+ water);
                //return water;
            }
            // System.out.println("after water calc, \nleftmax: "+ leftmax+" rightmax: "+rightmax);
            leftmax = rightmax;
            i = leftmax - 1;
            // // if (i == rightmax-1){
            // //     leftmax = rightmax;
            // // }
        }
        return water;
    }

    
}

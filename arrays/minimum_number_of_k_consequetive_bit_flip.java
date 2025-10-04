package arrays;

import java.util.List;
import java.util.ArrayList;

public class minimum_number_of_k_consequetive_bit_flip {
  public static int solution(int[] nums, int k) {
        int n = nums.length;
        List<Integer> flip = new ArrayList<>();
        int head = -1;
        int count  = 0;
        int parity = 0;
        for (int i = 0; i<n; i++){
            
            // size of flip = flip.size() - head if head >=0

            if ( flip.size() == 0 ) {
                if (nums[i] == 0 && i+k-1 < n) {
                    flip.add(i+k-1);
                    count++;
                    head++;
                }
                else if (nums[i] == 0 && i+k-1 >= n){
                    parity++;
                }
            }
            
            else { // size of flip is non zero
                if (flip.size() - head > 0){ //check if size of flip queue is non zero
                    if (i > flip.get(head))
                        head++;
                    if ( (nums[i]+flip.size()-head)%2 == 0 && i+k-1 < n) { // check if yes even number of flips
                        flip.add(i+k-1);
                        count++;
                    }
                    else if ((nums[i]+flip.size()-head)%2 == 0 && i+k-1 >= n){
                        parity++;
                    }
                }

                else {
                    if (nums[i] == 0 && i+k-1 < n){
                        flip.add(i+k-1);
                        count++;
                    }
                    else if (nums[i] == 0 && i+k-1 >= n){
                        parity++;
                    }
                }
            }


        }
        return (parity != 0)? -1 : ( (flip.size() == 0)? 0: ( (head == -1)? -1: count) );
    }

  
}


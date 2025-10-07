package searching;

public class two_sum_in_aorted_array_167 {
  public int[] solution(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while (l < r){
            if (numbers[l] + numbers[r] == target)
                return new int[] {l+1,r+1};
            if (numbers[l] + numbers[r] > target)
                r--;
            else
                l++;
        }
        return new int[] {l,r};
    }
}

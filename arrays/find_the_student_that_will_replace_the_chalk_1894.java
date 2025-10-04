package arrays;

public class find_the_student_that_will_replace_the_chalk_1894 {

  public static int solution(int[] chalk, int k) {
    int n = chalk.length;
        long[] prefix = new long[n];
        if (n == 1)
            return 0;

        prefix[0] = chalk[0];
        for (int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + chalk[i];
        }

        return bs(prefix, n, k%prefix[n-1]);

    }

    public static int bs(long[] prefix, int n, long target){
        int start = 0;
        int end = n;

        int mid;
        while (start < end){
            mid = start + (end - start)/2;
            if (target < prefix[mid])
                end = mid;
            else if (target > prefix[mid])
                start = mid+1;
            else
                return mid+1; // to return the next (i+1th) student who will have 0 chalks 
        }
        return start;

    }
}
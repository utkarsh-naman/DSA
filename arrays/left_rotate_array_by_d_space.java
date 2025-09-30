package arrays;

import java.util.Arrays;

public class left_rotate_array_by_d_space {
  public static void main(String[] args){
    //your code here
    int[] original = generateLargeArray(100000); // test with 100,000 elements
    int k = 500; // number of rotations

    // Test solution_1
    int[] arr1 = Arrays.copyOf(original, original.length);
    long start1 = System.nanoTime();
    solution_1(arr1, k);
    long end1 = System.nanoTime();
    System.out.println("solution_1 time (ns): " + (end1 - start1));

    // Test solution_2
    int[] arr2 = Arrays.copyOf(original, original.length);
    long start2 = System.nanoTime();
    solution_2(arr2, k);
    long end2 = System.nanoTime();
    System.out.println("solution_2 time (ns): " + (end2 - start2));

    // Test solution_3
    int[] arr3 = Arrays.copyOf(original, original.length);
    long start3 = System.nanoTime();
    solution_3(arr3, k);
    long end3 = System.nanoTime();
    System.out.println("solution_3 time (ns): " + (end3 - start3));
  }
  
  // Generates a large array with ascending numbers
  public static int[] generateLargeArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = i;
    }
    return arr;
  }
  
  public static void solution(int arr[], int k){

  }

  // this method has the time complexity of O(n*k)  
  public static void solution_1(int arr[], int k){
    int n = arr.length;
    // left rotate the first 
    for (int i = 1; i <= k; i++){

      int temp = arr[0];
      for (int j = 0; j < n-1; j++){
        arr[j] = arr[j+1];
      }
      arr[n-1] = temp;
    }
  }

  // this method has the time complexity O(n) but has space complexity O(k) too
  public static void solution_2(int arr[], int k){
    int n = arr.length;
    int help_arr[] = new int[k];

    // saving the first k elements in helper array in reverse order
    for (int i = 0; i < k; i++){
      help_arr[k-1-i] = arr[i];
    }

    // shift the numbers from the kth index to the left
    for (int i = 0; i < n-k; i++){
      arr[i] = arr[i+k];
    }

    // write the elements from the helper array
    for (int i = 0; i < k; i++){
      arr[i+n-k] = help_arr[i];
    }
  }

  // this method has time complexity O(2*n) and space complexity O(1)
  public static void solution_3(int arr[], int k){
    int n = arr.length;
    //reverse first k elements
 
    reverse(arr, 0, k-1);
    reverse(arr, k, n-1);
    reverse(arr, 0, n-1);
  }

  private static void swap (int[] arr, int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  private static void reverse(int arr[], int start, int end){

    for(int i = 0; i < (end-start)/2; i++){
      swap (arr, start+i, end-i);
    }
  }

}

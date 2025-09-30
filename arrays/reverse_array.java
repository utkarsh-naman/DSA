package arrays;

public class reverse_array {
  public static int[] solution(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n/2; i++){
      arr[i] = arr[i]^arr[n-1-i];
      arr[n-1-i] = arr[i]^arr[n-1-i];
      arr[i] = arr[i]^arr[n-1-i];
    }
    return arr;
  }
}

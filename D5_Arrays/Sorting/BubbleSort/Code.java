package D5_Arrays.Sorting.BubbleSort;

import java.util.Arrays;

public class Code {
  public static void main(String[] args) {
    int [] arr = {3,0,1,-5,4,2};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void bubbleSort(int [] arr){
    int n  = arr.length;
    for(int i = 0; i<n ; i++){
      boolean swapped = false; // To optimize flag
      for(int j = 1; j<n-i; j++){
        if(arr[j-1]> arr[j]){
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
          swapped = true;
        }
      }

      if(!swapped){
        break;
      }
    }
  }
}

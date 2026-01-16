package D5_Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class Code {
  public static void main(String[] args) {
    int [] arr  = {3, 5, 2, 1, 4};
    cyclic(arr);
    System.out.println(Arrays.toString(arr));
  }


  public static void cyclic(int [] arr){
       int i = 0;
       while(i < arr.length){
        int correct  = arr[i] - 1;

        if(arr[i]!=arr[correct]){
          swapped(arr, i, correct);
        }
        else i++;
       }
  }

  public static void swapped(int[] arr, int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

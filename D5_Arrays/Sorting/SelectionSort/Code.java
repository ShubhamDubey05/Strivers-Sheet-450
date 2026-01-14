package D5_Arrays.Sorting.SelectionSort;
import java.util.Arrays;

public class Code {
  public static void main(String[] args) {
     int [] arr = {3,0,1,-5,4,2};
     selectionSort(arr);

     System.out.println(Arrays.toString(arr));
  }

  public static void selectionSort(int [] arr){

    for(int i =0; i<arr.length; i++){

      int lastIndex = arr.length - i-1;

      int getIndex = getMaximum(arr, 0, lastIndex);

      swap(arr, getIndex, lastIndex);
    }
  }

  public static int getMaximum(int [] arr, int start, int last){
    int max = start;
    for(int i=start; i<=last; i++){
       
      if(arr[i]> arr[max] ){
        max= i;
      } 
    }
    return max;
  }

  public static void swap(int [] arr, int i, int j){
    int temp  = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }


}

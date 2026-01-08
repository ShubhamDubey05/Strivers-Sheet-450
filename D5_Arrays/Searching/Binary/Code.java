package D5_Arrays.Searching.Binary;
import java.util.Arrays;
public class Code {
  public static void main(String[] args) {
    int [] arr  = {-45,-18,-7,-2,0,8,9,47,156,788};
    // int [][] nums = {
    //     {10,20,30,40},
    //     {15,25,35,45},
    //     {28,39,47,49},
    // };
      int [][] num = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
    };
   // System.out.println(binarySearch(arr, 788));
   System.out.println(Arrays.toString(search2D(num, 3)));
  }





 static int binarySearch(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(arr[mid] == target)
            return mid;

        if(target > arr[mid])
            start = mid + 1;
        else
            end = mid - 1;
    }
    return -1;
}

static int[] search2D(int[][] arr, int target) {
    int rowSize = arr.length;
    int colSize = arr[0].length;

    int row = 0;
    int col = colSize - 1;

    while (row < rowSize && col >= 0) {
        int ele = arr[row][col];

        if (ele == target) {
            return new int[]{row, col};
        } 
        else if (target > ele) {
            row++;      // neeche jao
        } 
        else {
            col--;      // left jao
        }
    }

    return new int[]{-1, -1};
}


}

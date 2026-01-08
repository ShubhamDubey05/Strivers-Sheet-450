package D5_Arrays.Searching.Binary;

public class Code {
  public static void main(String[] args) {
    int [] arr  = {-45,-18,-7,-2,0,8,9,47,156,788};
    System.out.println(binarySearch(arr, 788));
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

}

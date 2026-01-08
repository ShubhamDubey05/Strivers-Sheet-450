package D5_Arrays.Searching.Binary;

public class OrderAgnosticBS {
  public static void main(String[] args) {
    int [] arr = {78,75,58,46,43,23,16,9,8,6,1};
    System.out.println(orderAgnostic(arr, 1));
  }

  static int orderAgnostic(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target == arr[mid])
        return mid;
      if (isAsc) {
        if (target > arr[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }

    return -1;
  }
}

package D5_Arrays.Easy.largestandsmallest;
// Question - https://www.naukri.com/code360/problems/largest-element-in-the-array-largest-element-in-the-array_5026279
public class Code {
  public static void main(String[] args) {
    int[] arr  = {7,9,8,1,7,3,4,6};
    int largest = largest(arr);
    int smallest = smallest(arr);
    System.out.println(largest +" "+ smallest);
  }

  public static int largest(int []arr){
    int largest = arr[0];
    int i = 1;
    while(i < arr.length){
      if(largest< arr[i]){
        largest = arr[i];
      }
      i++;
    }

    return largest;
  }

   public static int smallest(int []arr){
    int smallest = arr[0];
    int i = 1;
    while(i < arr.length){
      if(smallest> arr[i]){
        smallest = arr[i];
      }
      i++;
    }

    return smallest;
  }
  
}

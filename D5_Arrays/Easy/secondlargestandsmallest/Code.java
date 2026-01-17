package D5_Arrays.Easy.secondlargestandsmallest;

public class Code {
  public static void main(String[] args) {
     int[] arr  = {7,9,8,1,7,3,4,6};
     System.out.println(secondLargest(arr));

  }

  public static int secondLargest(int [] arr){
    int largest = arr[0];
    int slargest= -1;

    for(int i =1; i<arr.length; i++){
      if(largest< arr[i]){
        slargest = largest;
        largest= arr[i];
      }
      else if(arr[i] < largest && arr[i]> slargest){
        slargest = arr[i];
      }
    }

    return slargest;
  }
}

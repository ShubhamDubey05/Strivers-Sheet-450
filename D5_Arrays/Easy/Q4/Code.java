package D5_Arrays.Easy.Q4;

public class Code {
  public static void main(String[] args) {
    int [] nums = {9,6,4,2,3,5,7,0,1};

  }

  public static void swapped(int [] nums , int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j]= temp;
  }

  public static int missingNumber(int [] nums){
    int n = nums.length;
 
    int i =0;

    while( i< n){
      int correct  = nums[i];

      if(nums[i] < n && nums[i]!=nums[correct]){
           swapped(nums, i, correct);
      } else {
           i++;
      }
      
    }
       for(int index = 0; index<n; index++){
        if(nums[index]!=index){
          return index;
        }
       }
     return n;
  }
}

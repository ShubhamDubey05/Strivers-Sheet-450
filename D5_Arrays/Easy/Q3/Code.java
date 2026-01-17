package D5_Arrays.Easy.Q3;

import java.util.HashSet;

public class Code {
  public static void main(String[] args) {
    int [] arr = {1,1,1,3,3,8,8,9,10,11,11,45};
      System.out.println(duplicate1(arr));
      System.out.println(duplicate2(arr));
  }

 // Brute Force
  public static int duplicate1(int []arr){
    HashSet<Integer> mp = new HashSet<>();

    for(int ele : arr){
      mp.add(ele);
    }
    int index = 0;
    for(int ele : mp){
      arr[index++]= ele;
    }

    return index;
    }



    // Optimal

    public static int duplicate2(int [] arr){
      int i = 0;
      int index = 0;
      int j = 1;
      while(j < arr.length){
        if(arr[i]!=arr[j]){
          index++;
          arr[index] = arr[j];
          i = j;
        }
        j++;
      }
      return index+1;
    }
}

package D4_Maths.Pratice;

import java.util.Arrays;
import java.util.HashMap;

public class Q3 {
  public static void main(String[] args) {
    int [] arr1 = {2, 2, 3,2};
    int [] arr2 = {0, 1, 0, 1,0,1, 5};

    // Brute Force  Approach -1

    HashMap<Integer, Integer> mp = new HashMap<>();
    for(int val : arr2){
      mp.put(val, mp.getOrDefault(val, 0)+1);
    }
    // using lamba expression
    // mp.forEach((key,value)->{
    //         System.out.println(key + "   "+ value);
    // });

       for( Integer key :mp.keySet()){
               if(mp.get(key) != 3){
                System.out.println(key);
               }
       }

    // better   Approach -2

       Arrays.sort(arr2); 
        // arr2 = [0, 0, 0, 1, 1, 1, 99]

        int i = 0;
        while (i < arr2.length - 1) {
            if (i + 2 < arr2.length && arr2[i] == arr2[i + 1] && arr2[i] == arr2[i + 2]) {
                i += 3; // skip triplet
            } else {
                System.out.println("Single element: " + arr2[i]);
                return;
            }
        }

        // if the unique element is last
        System.out.println("Single element: " + arr2[arr2.length - 1]);
/*
 
Initialize Result

result = 0

This will store the final single number.

Loop Over All 32 Bits

For each bit position i from 0 to 31 (0 = least significant bit, 31 = most significant bit):

Create a Mask for the Current Bit

temp = 1 << i

This mask helps check the i-th bit of every number.

Count Numbers with Current Bit Set

Initialize count = 0.

For each number num in the array:

If (num & temp) != 0, increment count.

Now count contains how many numbers have a 1 at the i-th bit.

Check if Bit Belongs to Single Number

If count % 3 != 0 → this bit is set in the single number.

Update result using: result = result | temp.

Repeat Steps 3–5 for All Bits (0 to 31)

Return the Result

After checking all bits, result contains the single number.

 */

          int  ans = 0;
        for(int bit = 0; bit<32; bit++){
          int temp = 1<<bit;
          int Ones = 0;

          for(int val: arr2){
            if((val & temp) != 0) Ones++;
            
          }
          if(Ones %3 !=0){
            ans = ans|temp;
          }

        }

        System.out.println(ans);
    
  }
}

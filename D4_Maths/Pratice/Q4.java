package D4_Maths.Pratice;

import java.util.HashMap;

public class Q4 {
  public static void main(String[] args) {
    /*
     
     Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
     */
    int [] num = {1,2,1,3,2,5};
    int [] ans = singleNumber3(num);

    for(int val : ans){
      System.out.println(val);
    }

  }
        // Brute force
   public static int[] singleNumber(int[] nums) {
          int first =0;
          int second =0;
         HashMap<Integer, Integer> mp = new HashMap<>();

          for(int ele : nums){
               mp.put(ele, mp.getOrDefault(ele,0 )+1);
          }

          for(int key : mp.keySet()){
            if(mp.get(key) == 1){
              if(first ==0){
                first = key;
              }else{
                second = key;
              }
            }
          }
       return new int[] {first , second};
   }

public static int[] singleNumber3(int[] arr) {
    /*
       Intuition:

       1️⃣ XOR all elements → gives xor = a ^ b  (where a and b are the two unique numbers)

       2️⃣ In xor = a ^ b, at least one bit is set (1) — meaning a and b differ at that bit.
           Example: xor = 6 → binary 110 → a and b differ at bit position 2 or 3.

       3️⃣ Find the rightmost set bit in xor → helps us divide numbers into two groups:
           - Group A: numbers with that bit set.
           - Group B: numbers with that bit not set.

       4️⃣ XOR within each group → duplicates cancel, leaving one unique number in each group.
    */

    int xor = 0;

    // Step 1: XOR all numbers
    for (int val : arr) {
        xor ^= val;
    }

    // Step 2: Find rightmost set bit (important fix here)
    int mask = xor & (-xor);  // ✅ Correct way, not (~xor)

    int grpA = 0;
    int grpB = 0;

    // Step 3: Divide numbers into two groups based on that bit
    for (int ele : arr) {
        if ((ele & mask) != 0) {
            grpA ^= ele;  // XOR within group A
        } else {
            grpB ^= ele;  // XOR within group B
        }
    }

    return new int[]{grpA, grpB};
}


}

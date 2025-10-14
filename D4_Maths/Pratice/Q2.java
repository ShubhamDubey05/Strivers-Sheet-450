package D4_Maths.Pratice;

import java.util.ArrayList;

public class Q2 {
  public static void main(String[] args) {

    int [] arr = {4, 3, 5, 6};
     /*
       How many subsets will be in the given array
         
       The size of array  is  4
      
       Total subsets will be 2^4 = 16 = 2^size = 1<<size 

          3  2  1  0
      0   0  0  0  0 = {}
      1   0  0  0  1 = {4}
      2   0  0  1  0 = {3}
      3   0  0  1  1 = {4, 3}
      4   0  1  0  0 = {5}
      5   0  1  0  1 = {4, 5}
      6   0  1  1  0 = {3, 5}
      7   0  1  1  1 = {4, 3, 5}
      8   1  0  0  0 = {6}
      9   1  0  0  1 = {4, 6}
      10  1  0  1  0 = {3, 6}
      11  1  0  1  1 = {4, 3, 6}
      12  1  1  0  0 = {5, 6}
      13  1  1  0  1 = {4, 5, 6}
      14  1  1  1  0 = {3, 5, 6}
      15  1  1  1  1 = {4, 3, 5, 6}


     */
    int subsets = 1<<arr.length;
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    for(int num = 0; num<subsets; num++){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
              if((num & (1<<i))!=0){
                 temp.add(arr[i]);
              }
        }
        ans.add(temp);
    }
    System.out.println(ans);
    /*
    Steps:

    Start
    Read the array arr[].
    Find the size of the array → n = arr.length.
    Compute total subsets = totalSubsets = 1 << n     // same as 2^n
    Initialize an empty list ans to store all subsets.
    Repeat for each number num from 0 to totalSubsets - 1:
    a. Create an empty list temp for the current subset.
    b. For each index i from 0 to n - 1:
    i. If the i-th bit of num is set → (num & (1 << i)) != 0
    → Include arr[i] in temp.
    c. After checking all bits, add temp to ans.
    After the loop ends, ans contains all subsets.
    Print or return ans.
    End

       Time complexity  = Outer loop will run 2^n and inner loop will run n
       than
        T(n)=n×2^n

       Space complexity  
       S(n)=O(n×2n)
     */
  }
}

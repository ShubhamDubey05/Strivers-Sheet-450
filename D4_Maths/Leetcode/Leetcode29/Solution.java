public class Solution {
  public static void main(String[] args) {
         int ans  = divide(22,3 );
         System.out.println(ans);

         /*
             Brute Force :-
          Adding the divisor until it reaches the dividend and counting the number of times we added     the divisor.
       sum =0 , count =0
       while(sum + divisor <= dividend){
        count++;
        sum += divisor}
        print count;
          */
  }
   public static int divide(int dividend, int divisor) {
        // check krte hai, dividend aur divisor brabar hai ky  ?
        // yadi equal hai to cancel out hoke  1 ho jayega 

        if (dividend == divisor)
            return 1;

        // hum jante hai Integer min ki value = -2^31 hai koi divisor -1 hua tb
        // dono sign cancel out ho jayenge tb value hogi 2^31 jo ki Integer max ko
        // overflow kregi isliye  hume 2^31 -1 bhejenge jo ki Integer max ki value 
        // Hai

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // we ignore the sign during the calculation

        boolean sign = true;
        if (dividend < 0 && divisor >= 0 || dividend >= 0 && divisor < 0)
            sign = false;

        // isliye hum absolute value lete hai ki negative sign hat jaye aur bad me hum add kr lenege 

        long deno = Math.abs((long) divisor); // Type cast isliye krre hai ki Int min ki value 2^31
        // hoti hai lekin absolute lene pr Int max 2^31 -1 hi hoti isliye type cast krre hai 
        long numi = Math.abs((long) dividend);

        int ans = 0;

        while (numi >= deno) { //   dekhte hai numinator jbtk bada rhega tbtk ye loop chlega 

            int cnt = 0;

            while (numi >= (deno << cnt)) { // 3 << cnt
                cnt++;
            }
            cnt = cnt - 1; // cnt ko balance krna aur numinator me se minus krna 
            numi -= deno << cnt;
            ans += 1 << cnt;

        }

        return sign ? ans : -ans;
    }
}

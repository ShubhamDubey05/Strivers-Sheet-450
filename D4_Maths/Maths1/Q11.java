package D4_Maths.Maths1;

public class Q11 {
  public static void main(String[] args) {
    /*check the given number is power of 2 or not

    Let's understand how to think in bits 

    Brute force 
    1 - convert into the binary 
    2 - count the all set bits
    3 - if sets bit are odd then it is power of 2
        else not power of 2

    Optimal approach

    n = 8       in binary  =  1 0 0 0
    n = 7       in binary  =  0 1 1 1


    n = 16      in binary  =  1 0 0 0 0
    n = 15      in binary  =  0 1 1 1 1

    n = 9       in binary  =  1 0 0 1
    n = 8       in binary  =  1 0 0 0

    we are looking if we do the & with n-1  if it is equal to 0
    than it is power of 2 else not.



    */

    int n  = 11;

    if((n & (n-1)) == 0){
      System.out.print("Power of 2");
    }
    else {
      System.out.print("Not power of 2");
    }
    
  }
}

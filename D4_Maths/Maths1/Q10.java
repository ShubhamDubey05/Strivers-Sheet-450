package D4_Maths.Maths1;

public class Q10 {
  public static void main(String[] args) {
    // Remove the last set bit (right most)

    /*
       Let's understand some observation
        
       Example - 1
       num = 16     in binary  =  10000
       num = 15     in binary  =  01111
       
       Example - 2
       num = 40     in binary  = 101000
       num = 39     in binary  = 100111

      Example - 3
      num = 84      in binary  = 1010100
      num = 83      in binary  = 1010011



      if we take n-1 and take & with n than we can remove the ith right most set bit 

     */

     int n = 13;     // 1101
     int i=0;
      if((n & (1<<i)) !=0){
           System.out.println("Set bit");
       }
       else {
        System.out.println("not set");
       }
        
       n = n&(n-1);
     
     
        if((n & (1<<i)) !=0){
           System.out.println("Set bit");
       }
       else {
        System.out.println("not set");
       }

  }
}

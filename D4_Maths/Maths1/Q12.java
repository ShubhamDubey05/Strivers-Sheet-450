package D4_Maths.Maths1;

public class Q12 {
  public static void main(String[] args) {
    // count set bits of a number 
      /*
          n = 13        count  = 3
          n = 8         count  = 1
          n = 15        count  = 4

       */

       // Brtue Force  

       int n  = 15;
       int count  = 0;
       while(n > 1){
          if(n%2 ==1) count++;
          n = n/2;
       }
       if (n==1) count++;
       System.out.println(count);


       // some changes to optimal and faster
         n = 15;
        int cnt  = 0;
       while(n > 1){
            cnt += n&1;
            n = n>>1;
       }
       if (n==1) cnt++;
       System.out.println(cnt);

       // approach -3

       n = 15;
       int cntt =0;
       while(n!=0){
          n = n & (n-1);
          cntt++;
       }
       System.out.println(cntt);
  }
}

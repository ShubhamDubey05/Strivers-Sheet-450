package D4_Maths.Pratice;

public class Q1 {
  public static void main(String[] args) {
      int start  = 16;   
      int  goal = 15;

      /*
            There is two number first one is 14 to convert 11 how many bit flips are requried.

            14 =  1 1 1 0
            11 =  1 0 1 1

            Step1 -  if we do XOR with start and goal than  we find
                   0 1 0 1 
              it means how many set bits are there

            Step2 -  Count the number of set bits to flip




       */

       int ans  = start^goal;

       int cnt  = 0;
       while(ans > 1){
            cnt += ans&1;
            ans= ans>>1;
       }
       if (ans==1) cnt++;
       System.out.println(cnt);

  }
}

package D4_Maths.Maths1;

public class Q6 {
  public static void main(String[] args) {
    int num = 9;
    int k  = 0;

    // approach 1

      //      3 2 1 0
     // num = 1 1 0 1 

       if((num & (1<<k)) !=0){
           System.out.println("Set bit");
       }
       else {
        System.out.println("not set");
       }


       // approach 2

       if(((num>>k)&1) != 0){
        System.out.println("Set bit");
       }
       else {
        System.out.println("not set");
       }

  }
}

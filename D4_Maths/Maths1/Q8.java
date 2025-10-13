package D4_Maths.Maths1;

public class Q8 {
  public static void main(String[] args) {
    int num = 13;
    int i = 2; 


    // clear the i^th bit , means if it is 1 then turn to 0 and if it is 0 than leave the as it.
    // num =  1 1 0 1
     // i =   1 0 1 1
     // take &

     if((num & (1<<i)) !=0){
           System.out.println("Set bit");
       }
       else {
        System.out.println("not set");
       }

     num = num & (~(1<<i));

     if((num & (1<<i)) !=0){
           System.out.println("Set bit");
       }
       else {
        System.out.println("not set");
       }


  }
}

public class Q9 {
  public static void main(String[] args) {
    int n  =  13;
    int i = 2;

    // Toggle the i^th bit if it is 0 then turn to 1 and vice versa.

       n = n^(1<<i);

        if((n & (1<<i)) !=0){
           System.out.println("Set bit");
       }
       else {
        System.out.println("not set");
       }

  }
}

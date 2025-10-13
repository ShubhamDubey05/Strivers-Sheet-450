package D4_Maths.Maths1;

public class Q7 {
  public static void main(String[] args) {
    int num = 9;
    int i = 2;

     
      num = num|(1<<i);

      
if ((num & (1 << i)) != 0) {
    System.out.println("Set bit");
} else {
    System.out.println("not set");
}
  }
}

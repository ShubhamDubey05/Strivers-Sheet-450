package D4_Maths.Maths1;

public class Q2 {
  public static void main(String[] args) {
    System.out.println(convertToDecimal("1111"));
  }

  public static int convertToDecimal(String s){
    int val  = 0;
    int power = 1;
    for(int i = s.length()-1; i>=0; i--){
           if(s.charAt(i) == '1'){
            val = val + power;
           }
           power = power*2;
    }
      return val;
  }
}

package D4_Maths.Maths1;

public class Q1 {
  public static void main(String[] args) {
       System.out.println(convertToBoolean(16));
  }
  public static String reverse(String s){
    String res = "";
    int len  = s.length();
     for(int i = len-1; i>=0; i--){
      res+=s.charAt(i);
     }
    return res;

  }
  public static String convertToBoolean(int num){
            if(num == 0) return "0";
              String res  = "";
               while(num != 1){
                if(num %2 == 0) res +='0';
                else res +='1';
                num = num/2;
               }
               res+='1';
              return reverse(res);
  }
}

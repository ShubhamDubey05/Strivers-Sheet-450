package D4_Maths.Maths1;

public class Q4 {
  public static void main(String[] args) {
    
  }

  public static String twosComplement(String s){
        String temp = onesComplement(s);
        
  }
   public static String onesComplement(String s){
    String ans = "";
       for(char ch  : s.toCharArray()){
        if(ch=='1') ans+='0';
        else ans+='1';
       }
      return ans;
  }
}

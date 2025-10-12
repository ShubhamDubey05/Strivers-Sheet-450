package D4_Maths.Maths1;

public class Q4 {
  public static void main(String[] args) {
    System.out.println(twosComplement("1011"));
  }


  public static String reverse(String s){
    String res = "";
    int len  = s.length();
     for(int i = len-1; i>=0; i--){
      res+=s.charAt(i);
     }
    return res;

  }
  public static String twosComplement(String s){
        String temp = onesComplement(s);
         String comple = addOne(temp);
         return reverse(comple);
  }
  public static String addOne(String s){
         char carry = '1';
         String temp = "";
         for(int i = s.length()-1; i>=0; i--){
             char c = s.charAt(i);
             if(c== '1' && carry == '1'){
              temp +='0';
              carry = '1';
             }
             else if(carry=='1' && c=='0'){
              temp  += '1';
              carry = '0';       }
              else {
                temp +='c';
              }
         }
         return temp;
         

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

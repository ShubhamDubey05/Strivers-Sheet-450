package D4_Maths.Maths1;

public class Q3 {
  public static void main(String[] args) {
         System.out.println(complement("1010"));
  }
  public static String complement(String s){
    String ans = "";
       for(char ch  : s.toCharArray()){
        if(ch=='1') ans+='0';
        else ans+='1';
       }
      return ans;
  }
}

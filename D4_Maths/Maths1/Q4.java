package D4_Maths.Maths1;

public class Q4 {
    public static void main(String[] args) {
      // step1  1's complement
      // step2  1 add to result
        System.out.println(twosComplement("1011"));
    }

    public static String twosComplement(String s) {
        String ones = onesComplement(s);
        return addOne(ones);
    }

    public static String addOne(String s) {
        char carry = '1';
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '1' && carry == '1') {
                temp = '0' + temp;
                carry = '1';
            } else if (carry == '1' && c == '0') {
                temp = '1' + temp;
                carry = '0';
            } else {
                temp = c + temp;
            }
        }
        if (carry == '1') temp = '1' + temp;
        return temp;
    }

    public static String onesComplement(String s) {
        String ans = "";
        for (char ch : s.toCharArray()) {
            ans += (ch == '1') ? '0' : '1';
        }
        return ans;
    }
}

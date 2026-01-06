package D4_Maths.Pratice;

public class Q6 {
  public static void main(String[] args) {
    int start = 4;
    int end  = 9;
    int ans = xorRange(start-1)^xorRange(end);
    System.out.println(ans);

  }
  public static int xorRange(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }
}

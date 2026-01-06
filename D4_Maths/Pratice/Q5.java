package D4_Maths.Pratice;

public class Q5 {
    public static void main(String[] args) {
        int N = 9;

        /*
          XOR Pattern (0 to N):

          N   |  XOR(0..N)
          ----|------------
          0   |  0
          1   |  1
          2   |  3
          3   |  0
          4   |  4
          5   |  1
          6   |  7
          7   |  0
          8   |  8
          9   |  1
          
          Pattern repeats every 4 numbers:
          ------------------------------------------------
          if N % 4 == 0 → XOR = N
          if N % 4 == 1 → XOR = 1
          if N % 4 == 2 → XOR = N + 1
          if N % 4 == 3 → XOR = 0
        */

        System.out.println("XOR from 0 to " + N + " = " + xorRange(N));
    }

    public static int xorRange(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }
}

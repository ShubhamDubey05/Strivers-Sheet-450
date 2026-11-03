package D2_Patterns.Pratice;

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
    }

    public static void pattern1(int n){
         for(int i =1; i<=n; i++){
            for(int j =1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
}

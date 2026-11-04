package D2_Patterns.Pratice;

public class Patterns {
    public static void main(String[] args) {
        pattern2(4);
    }
public static void pattern2(int n) {
     for(int row=1; row<=2*n-1; row++){
        if(row<=n){
            for(int star =1; star<=row; star++){
                System.out.print("*");
            }
            for(int space=1; space<=2*(n-row); space++){
                System.out.print(" ");
            }
               for(int star =1; star<=row; star++){
                System.out.print("*");
            }
        }
        else{
            for(int star = 1; star<=2*n-row; star++){
                 System.out.print("*");
            }
              for(int space=1; space<=2*(row-n); space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=2*n-row; star++){
                 System.out.print("*");
            }

        }
       System.out.println();
     }
     
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

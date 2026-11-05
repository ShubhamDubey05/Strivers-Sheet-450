package D2_Patterns.Pratice;

public class Patterns {
    public static void main(String[] args) {
        pattern6(4);
    }
    public static void pattern6(int n ){
        for(int row=1;row<=n;row++){
            for(int col=1; col<=2*n-1; col++){
                if(row==n || row+col-n==1 || col-row==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row; col++){
                if(col==1 || row==n || row==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        // row ke liye 
        for(int row= 1;row<=n; row++){
            // space 
            for(int col=1;col<=n-row; col++){
                System.out.print(" ");
            }
        // stars
              for(int col=1;col<=n;col++){
                System.out.print("*");
              }
              System.out.println();
        }
    }
    public static  void pattern3(int n){
        for(int row=1; row<=n; row++){
            if(row%2==0){
               int start= 0;
               for(int print = 1; print<=row; print++){
                System.out.print(start+" ");
                if(start==0){
                    start=1;
                }else{
                    start=0;
                }
               } 
            }else{
                 int start= 1;
               for(int print = 1; print<=row; print++){
                System.out.print(start+" ");
                if(start==0){
                    start=1;
                }else{
                    start=0;
                }
               } 
            }
            System.out.println();
            }
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

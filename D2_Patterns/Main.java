package D2_Patterns;

public class Main {

public static void Pattern1(){
      // How to think this pattern , first of all do yourself , use pen and copy.

      // step-1 there are 5 rows and 5 columns

      for(int i =0; i < 5; i++){ // rows 0 , 1, 2, 3, 4
             for(int j =0; j <5; j++){ // cols 0, 1, 2, 3, 4, 
                 System.out.print("* ");
             }
             System.out.println();
      } 
}
public static void Pattern2(){
      
      for(int i =0; i < 5; i++){ 
             for(int j =0; j <=i; j++){ 
                 System.out.print("* ");
             }
             System.out.println();
      } 
}
public static void Pattern3(){
      
      for(int i =1; i <=5; i++){ 
             for(int j =1; j <=i; j++){ 
                 System.out.print(j+" ");
             }
             System.out.println();
      } 
}
public static void Pattern4(){
      
      for(int i =1; i <=5; i++){ 
             for(int j =1; j <=i; j++){ 
                 System.out.print(i+" ");
             }
             System.out.println();
      } 
}
public static void Pattern5(int n ){
      
      for(int i =1; i <=n; i++){ 
             for(int j =1; j <= n-i+1; j++){ 
                 System.out.print("* ");
             }
             System.out.println();
      } 
}
public static void Pattern6(int n ){
      
      for(int i =1; i <=n; i++){ 
        // for space 
             for(int j =1; j <=i-1 ; j++){ 
                 System.out.print(" ");
             }

        // for star     
             for(int k =i; k <= n; k++){ 
                 System.out.print("*");
             }
        //line change
             System.out.println();
      } 
}

public static void Pattern7(int n ){
      
      for(int i =1; i <=n; i++){ 
        // for space 
             for(int j =1; j <=n-i ; j++){ 
                 System.out.print(" ");
             }

        // for star     
             for(int k =n; k >= n-i+1; k--){ 
                 System.out.print("*");
             }
        //line change
             System.out.println();
      } 
}
public static void Pattern8(int n ){
      
      for(int i =1; i <=n; i++){ 
             for(int j =1; j <= n-i+1; j++){ 
                  System.out.print(j+" ");
             }
             System.out.println();
      } 
}
public static void Pattern9(int n ){
   /*   
      for(int i =1; i <=n; i++){ 
        // for space 
             for(int j =1; j <=n-i ; j++){ 
                 System.out.print(" ");
             }

        // for star     
             for(int k =n-i+1; k <= n+i-1; k++){ 
                 System.out.print("*");
             }

        // for space 
            for(int j =n+i; j <=2*n-1 ; j++){ 
                 System.out.print(" ");
             }
        //line change
             System.out.println();
      } 
             */


             for(int i = 0; i < n; i++){
               // space 
               for(int j  = 0; j< n-i -1; j++){
                System.out.print(" ");
               }
               
                // stars
                for(int k = 0; k<2*i+1; k++){
                    System.out.print("*");
                }

                // space
                for(int j  = 0; j< n-i -1; j++){
                System.out.print(" ");
               }

               System.out.println();
             }
}
public static void Pattern10(int n ){
  
             for(int i = 0; i < n; i++){
               // space 
               for(int j  = 0; j<i; j++){
                System.out.print(" ");
               }
               
                // stars
                for(int k = 0; k< 2*n-(2*i + 1); k++){
                    System.out.print("*");
                }

                for(int j  = 0; j<i; j++){
                System.out.print(" ");
               }


               System.out.println();
             }
}
public static void Pattern11(int n){
    for(int i = 1; i <= 2*n; i++){
        if(i > 4){
            // space
            for(int j = n; j<(i-1);j++){
                System.out.print(" ");
            }
            // star 
             for(int j = 1; j<=2*(2*n -i)+1 ; j++){
                System.out.print("*");
            } 

            // space 
             for(int j = n; j<(i-1);j++){
                System.out.print(" ");
            }
        }
        else {
            // space
            for(int j = 1; j<= (n-i);j++){
                System.out.print(" ");
            }
              
            // star
            for(int j = 1; j<=(2*i-1) ; j++){
                System.out.print("*");
            } 
            // space
            for(int j = 1; j<= (n-i);j++){
                System.out.print(" ");
            } 
        }
        System.out.println();
    }
}
public static void Pattern12(int n){
    for(int i = 1; i<2*n;i++){
        if(i > 4){
            for(int j =1; j<= 2*n-i; j++){
                System.out.print("*");
            }
        }
        else{
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
public static void Pattern13(int n){
    for(int i =1; i<2*n; i++){
        if(i > n){
            // space 
            for(int j=1; j<=i-n;j++){
                System.out.print(" ");
            }
            
            // star

            for(int j=1; j<=(2*n-i); j++){
               System.out.print("*");
            }
        }
        else {
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star

            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
        }
        System.out.println();
       
    }
}
public static void Pattern14(int n) {
    for (int i = 1; i < 2 * n; i++) {

        if (i > n) {
            // Lower half of the butterfly
            int stars = 2 * n - i;
            int spaces = 2 * (i - n) - 1;

            // Left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

        } else {
            // Upper half of the butterfly
            int stars = i;
            int spaces = 2 * (n - i) - 1;

            // Left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
public static void Pattern15(int n){
       int start =1;
    for(int i  =1; i<=n; i++){
          start = (i % 2 == 0) ? 0 : 1;
            for(int j =1; j<=i; j++){
               System.out.print(start+" ");
               start= 1-start;
            }
            System.out.println();
    }
}
public static void Pattern16(int n){
    for(int i =1; i<=n; i++){
        // number
         for(int j =1; j<=i; j++){
            System.out.print(j);
         }
        //space 
         for(int j=1; j<=2*(n-i); j++){
           System.out.print(" ");
         }

        // number
         for(int j =i; j>=1; j--){
            System.out.print(j);
         }
         System.out.println();
    }
}

public static void Pattern17(int n){
    int count  = 1;
    for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
    }
}

public static void Pattern18(int n){
    for(int i =1; i<=n; i++){
        char ch = 'A';
        for(int j = 1; j<=i; j++){
             System.out.print(ch++ +" ");
        }
        System.out.println();
    }
}

public static void Pattern19(int n){
    for(int i =1; i<=n ; i++){
        char ch  = 'A';
        for(int j = 1; j<=(n-i)+1; j++){
             System.out.print(ch++ +" ");
        }
        System.out.println();
    }
}

public static void Pattern20(int n){
    char ch = 'A';
    for(int i =1; i<=n; i++){
        for(int j =1; j<=i; j++){
            System.out.print(ch +" ");
        }
        ch++;
        System.out.println();
    }
}

public static void Pattern21(int n) {
    for (int i = 1; i <= n; i++) {
        // leading spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        // increasing characters (A, AB, ABC, …)
        char ch = 'A';
        for (int j = 1; j <= i; j++) {
            System.out.print(ch++);
        }

        // decreasing characters (for mirror side)
        ch--; // because 'ch' is one step ahead
        for (int j = 1; j < i; j++) {
            System.out.print(--ch);
        }

        // move to next line
        System.out.println();
    }
}
public static void Pattern22(int n) {
    for (int i = 1; i <= n; i++) {
        for (char ch = (char)('E' - i + 1); ch <= 'E'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}

public static void Pattern23(int n) {
    for (int i = 1; i <= 2 * n; i++) {
        if (i <= n) {
            // Left stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
        } else {
            // Lower half
            int k = i - n;

            // Left stars
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - k); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}

public static void Pattern24(int n){
    for(int i=1; i<=n; i++){
         for(int j=1; j<=n; j++){
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
public static void Pattern25(int n){
    int val = n;
    for(int i=1; i<=2*n-1; i++){
          for(int j =1; j<=2*n-1; j++){
            if(i==1 || i==2*n-1 || j==1 || j==2*n-1){
                System.out.print(val);
            }
            else{
                System.out.print(val-1);
            }
          }
          
          System.out.println();
    }
}
public static void main(String[] args) {
    Pattern25(4);
  
}
}

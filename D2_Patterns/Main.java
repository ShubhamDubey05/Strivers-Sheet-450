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
                int right = (2*n-1)-j+1; 
                int left  = j; 
                int up = i;
                int down = (2*n-1)-i+1;
                int mini = Math.min(Math.min(right, left), Math.min(up, down));
                System.out.print(val-mini +" ");
          }
          
          System.out.println();
    }
}
public static void Pattern26(int n){
    for(int i =1; i<=2*n;i++){
        if(i<=n){
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // space
            for(int j= 1; j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            //star
              for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        }
         else {
               // star
               for(int j =1; j<=(2*n - i)+1; j++){
                System.out.print("*");
               }
               //space
               for(int j = 1; j<=2*(i-n)-2;j++){
                System.out.print(" ");
               }
               //star
               for(int j =1; j<=(2*n - i)+1; j++){
                System.out.print("*");
               }
         }
         System.out.println();
    }
}

public static void Pattern27(int n){
    for(int i =1; i<=n; i++){
        // space 
        for(int j =1; j<=n-i; j++){
            System.out.print(" ");
        }
        // star
        for(int j =1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void Pattern28(int n){
    for(int i =1; i<=n; i++){
        // space
        for(int j =1; j<=n-i;j++){
            System.out.print(" ");
        }
        // number
        for(int j= 1; j<=i; j++){
            System.out.print(i+" ");
        }
        
        System.out.println();
    }
}

public static void Pattern29(int n){
      for(int i = 1; i<=n; i++){
        // space
        for(int j =1 ; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j = i; j>=1; j--){
            System.out.print(j);
        }
        for(int j =2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
      }
}

public static void Pattern30(int n){
    for(int i =1; i<=2*n ; i++){
        if(i<=n){
             // space
        for(int j =1; j<=n-i; j++){
            System.out.print(" ");
        }
        // star
        for(int j =1; j<=2*i-1; j++){
            System.out.print("*");
           }
        }
        else {
            // space 
            for(int j = 1; j<= (i-n)-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j =1; j<= 2*(2*n-i)+1; j++){
                System.out.print("*");
            }
        }
        System.out.println();
        
        
    }
}

public static void Pattern31(int n){
    for(int i =1; i<=2*n; i++){
        for(int j =1; j<=2*n; j++){
            if(j==1 || j == 2*n || (i==j) || (i+j)==(2*n+1)){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public static void Pattern32(int n) {
    for (int i = 0; i < n; i++) {                 // outer loop → for each row
        for (int j = 0; j < n - i; j++) {         // print leading spaces
            System.out.print(" ");
        }

        int number = 1;                           // first number in each row is always 1

        for (int j = 0; j <= i; j++) {            // inner loop → print numbers in row
            System.out.print(number + " ");
            number = number * (i - j) / (j + 1);  // formula to get next number
        }

        System.out.println();                     // move to next line
    }
}

public static void Pattern33(int n){
    for(int i  =1; i<=n; i++){
        // space
        for(int j =1; j<=n-i; j++){
            System.out.print(" ");
        }
        // numbers
        int number = 1;
        for(int j =1; j<=i; j++){
            System.out.print(number++ +" ");
        }
        System.out.println();
    }
}

public static void Pattern34(int n){
    for(int i =1; i<=n ; i++){
        // spaces
        for(int j =1; j<=i-1; j++){
            System.out.print(" ");
        }
        // number
        for(int j=1; j<=n-i+1; j++){
            System.out.print(i +" ");
        }
        System.out.println();
    }
}

public static void Pattern35(int n){
    for(int i =1; i<=2*n;i++){
        if(i<=n){
                // spaces
           for(int j = 1; j<=i-1; j++){
            System.out.print(" ");
           }
        // star
        for(int j =1; j<=n-i+1;j++){
            System.out.print("* ");
             }
        }
        else{
            //spaces
            for(int j =1; j<=n-(i-n); j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=i-n; j++){
                System.out.print("* ");
            }
        }
      
        System.out.println();
    }
}

public static void Pattern36(int n){
    for(int i = 1; i<=n; i++){
        if(i == n){
            for(int j =1; j<=2*n-1; j++){
                System.out.print("*");
            }
        } else{
             for(int j =1; j<=2*n-1; j++){
            if(j<n){
                if((i+j)==n+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            else{
                  if((j-i)==n-1){
                    System.out.print("*");
                  }
                  else{
                    System.out.print(" ");
                  }
            }
        }
        }
        
          System.out.println();
    }
}

public static void Pattern37(int n){
    for(int i = 1; i<=n; i++){
         if(i==1){
            for(int j=1; j<=2*n-1; j++){
                System.out.print("*");
            }
         }else{
            for(int j = 1; j<=2*n-1;j++){
                if(j<=n){
                    if(i==j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if((i+j)==2*n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
         }
         
         System.out.println();
        }
}

public static void Pattern38(int n){
    for(int i=1; i<=2*n-1; i++){
        if(i<=n){
            for(int j =1; j<=2*n-1; j++){
                  
                if(j<=n){
                    if(i+j == n+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }else{
                     if(j-i == n-1){
                        System.out.print("*");
                     }
                     else{
                        System.out.print(" ");
                     }
                }
            } 

        }
        else{
            for(int j =1; j<=2*n-1; j++){
                  if(j<=n){
                    if(i-j == n-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                  }
                  else {
                    if(i+j == 2*n+(n-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                  }
            }
        }
    
         System.out.println();
    }
}

public static void Pattern39(int n){
    for(int i = 1; i<=n; i++){
        int val=1;
        for(int j=1; j<=i; j++){
            System.out.print(val+" ");
            val+=2;
        }
        System.out.println();
    }
}

public static void Pattern40(int n){
    for(int i=1; i<=n; i++){
        if(i%2 == 0){
            char ch = 'A';
            for(int j =1; j<=i; j++){
                System.out.print(ch++ +" ");
            }
        }else{
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
        }
        System.out.println();
    }
}

public static void Pattern41(int n){
    for(int i = 1; i<=n; i++){
        for(int j =1; j<=n; j++){
            if(i==j || i+j == n+1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public static void Pattern42(int n){
    for(int i=1; i<=n;  i++){
        if(i==1){
            for(int j=1; j<=2*n-1; j++){
                System.out.print(j);
            }
        }
         else {
            for(int j = 1; j<=n-i+1;j++){
                System.out.print(j);
            }
            for(int j = 1;j<=2*(i-1)-1; j++){
                System.out.print(" ");
            }
            for(int j= n+(i-1);j<=2*n-1; j++){
                System.out.print(j);
            }
         }
        System.out.println();
    }
}

public static void Pattern43(int n) {
    int totalChars = 2 * n - 1; // total characters

    for (int i = 1; i <= n; i++) {
        if (i == 1) {
            // first row
            for (char ch = 'A'; ch < 'A' + totalChars; ch++) {
                System.out.print(ch);
            }
        } else {
            
            for (char ch = 'A'; ch < 'A' + (n - i + 1); ch++) {
                System.out.print(ch);
            }

            // spaces in middle
            for (int s = 1; s <= 2 * (i - 1) - 1; s++) {
                System.out.print(" ");
            }

            
            for (char ch = (char) ('A' + n + i - 2); ch < 'A' + totalChars; ch++) {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    Pattern43(4);
  
}
}

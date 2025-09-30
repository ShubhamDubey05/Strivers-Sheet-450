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
public static void main(String[] args) {
    Pattern8(5);
}
}

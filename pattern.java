
import java.util.Scanner;
void main() {
   for(long i=1; i<=4; i++) {
       for (long j = 1; j <= i; j++) {
           System.out.print("*");
       }
       System.out.println();
   }

//    ================================================================================
//    Inverted Star pattern
    long n=7;
   for(long i =1; i <=n; i++){
     for(long j=1; j<=n-i+1; j++){
         System.out.print("*");
     }
       System.out.println();
   }

//    Half pyramid pattern
   long n=4;
   for(long i =1; i<=n; i++){
       for(long num=1; num<=i; num++){
           System.out.print(num);
       }
       System.out.println();
   }

//    ===============================================================================

   Print character pattern
   long n=7;
   char ch='A';
   for(long i=1; i<=n; i++){
       for(long j=1; j<=i; j++){
           System.out.print(ch);
           ch++;
       }
       System.out.println();

   }

//    =================================================================================

//    Hollow rectangle pattern user input

//    ******
//    *    *
//    *    *
//    ******

Scanner sc = new Scanner (System.in);
   System.out.println("Enter your row");
   long row = sc.nextLong();
   System.out.println("Enter your cols");
   long cols= sc.nextLong();
   for(long i = 1;    i<=row; i++){
       for(long j =1; j<=cols; j++){
           if(i==1 || i==row || j==1 || j==cols){
               System.out.print ("*");
           }else{
               System.out.print(" ");
           }
       }
       System.out.println();
   }

//    ====================================================================================

//    INVERTED & ROTATED HALF-PYRAMID pattern user input

//         *
//        **
//       ***
//      ****
//     *****

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your row");
   long n = sc.nextLong();
   for (long i = 1; i <= n; i++) {
       //space
       for (long j = 1; j <= n - i; j++) {
           System.out.print(" ");
       }
//        star
       for (long j = 1; j <= i; j++) {
           System.out.print("*");
       }
       System.out.println();
   }

//    =========================================================================

//  INVERTED HALF-PYRAMID with Numbers pattern

//    1 2 3 4 5
//    1 2 3 4
//    1 2 3
//    1 2
//    1

   Scanner sc = new  Scanner(System.in);
   System.out.println("Enter your num");
   long n = sc.nextLong();
   for(long i=1; i<=n; i++){
      for(long num=1; num<=n-i+1; num++){
          System.out.print(num);
      }
       System.out.println();
   }

//    ==============================================================================

//    FLOYD'S Triangle pattern user input
//    1
//    2 3
//    4 5 6
//    7 8 9 10
//    11 12 13 14 15

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your row");
   long row= sc.nextLong();
   long counter = 1;
   for(long i =1; i<=row; i++){
     for(long j=1; j<=i; j++){
         System.out.print(counter +" ");
         counter++;
     }
       System.out.println();
   }

//    ================================================================================

//         FLOYD'S Triangle pattern user input
//    A
//    B C
//    D E F
//    G H I J
//    K L M N O

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your row");
   long row= sc.nextLong();
   char ch = 'A';
   for(long i =1; i<=row; i++){
     for(long j=1; j<=i; j++){
         System.out.print(ch +" ");
         ch++;
     }
   System.out.println();
   }

//    =====================================================================================

//      0-1 Triangle pattern
//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your row");
   long row = sc.nextLong();
   for (long i = 1; i <= row; i++) {
       for (long j = 1; j <= i; j++) {
           if ((i + j) % 2 == 0) {
               System.out.print("1 ");
           } else {
               System.out.print("0 ");
           }
       }
       System.out.println();
   }

//    ======================================================================================

//    BUTTERFLY pattern
//    *      *
//    **    **
//    ***  ***
//    ********
//    ********
//    ***  ***
//    **    **
//    *      *

   Scanner sc  = new Scanner(System.in);
   System.out.println("Enter your number");
   long n = sc.nextLong();
//    1st half
   for(long i=1; i<=n; i++){
//        star-i
      for(long j=1; j<=i; j++ ){
          System.out.print("*");
      }
//       space-2(n-i)
      for(long j=1; j<=2*(n-i); j++){
          System.out.print(" ");
      }
//       star-i
     for(long j=1; j<=i; j++){
         System.out.print("*");
     }
       System.out.println();
   }
//   2nd half
   for(long i=n; i>=1; i--){
//  star-i
      for(long j=1; j<=i; j++){
          System.out.print("*");
      }
//     space-2*(n-i)
   for(long j=1; j<=2*(n-i); j++){
       System.out.print(" ");
   }
//    star-i
       for(long j=1; j<=i; j++){
           System.out.print("*");
       }
       System.out.println();
   }

//    ==================================================================================================

//    SOLID RHOMBUS pattern
//      *****
//     *****
//    *****
//   *****
//  *****

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your num");
   long n = sc.nextLong();
   for(long i=1; i<=n; i++){
//        space-i
       for(long j=1; j<=n-i; j++){
           System.out.print(" ");
       }
//        star-i
       for(long j=1; j<=n; j++){
           System.out.print("*");
       }
       System.out.println();
   }

//    ================================================================================================

//    HOLLOW RHOMBUS pattern
//        *****
//       *   *
//      *   *
//     *   *
//    *****

  Scanner sc = new Scanner(System.in);
   System.out.println("Enter your number");
   long n= sc.nextLong();
   for(long i=1; i<=n; i++){
//        space-i
      for(long j=1; j<=(n-i); j++){
          System.out.print(" ");
      }
//       hollow rectangle
      for(long j=1; j<=n; j++){
          if(i==1 || i==n || j==1 || j==n){
              System.out.print("*");
          }else{
              System.out.print(" ");
          }
      }
       System.out.println();
   }

//    ==================================================================================================

//    Diamond pattern
//         *
//        ***
//       *****
//      *******
//     *********
//      *******
//       *****
//        ***
//         *

   Scanner sc = new Scanner (System.in);
   System.out.println("Enter your number");
   long n= sc.nextLong();
//    1st half
   for(long i=1; i<=n; i++){
//        space-i
     for(long j=1; j<=n-i; j++){
         System.out.print(" ");
     }
//      star-* diamond star print karne ke liye (2*i-1) lagega
       for(long j=1; j<=2*i-1; j++){
           System.out.print("*");
       }
       System.out.println();
   }

//    2nd half
   for(long i=n; i>=1; i--){
//        space-i
       for(long j=1; j<=n-i; j++){
           System.out.print(" ");
       }
//        star-*
       for(long j=1; j<=2*i-1; j++){
           System.out.print("*");
       }
       System.out.println();
   }

//    ===========================================================================================

//    Number pyramid pattern
//        1
//       123
//      12345
//     1234567
//    123456789

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your number");
   long n = sc.nextLong();
   for(long i=1; i<=n; i++){
//        space-i
       for(long j=1; j<=n-i; j++){
           System.out.print(" ");
       }
//        number-i
      for(long j=1; j<=2*i-1; j++){
          System.out.print(j + " ");
      }
       System.out.println();
   }

//    ===================================================================================================

//    PALINDROMIC Pattern with Numbers pattern

//            1
//          2 1 2
//        3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your number");
   long n = sc.nextLong();
   for(long i=1; i<=n; i++){
//        space
     for(long j=1;j<=n-i; j++){
         System.out.print(" ");
     }
//      Decreasing number
     for(long j=i; j>=1; j--){
         System.out.print(j + " "); 
     }
//      Increasing number
     for(long j=2; j<=i; j++){
         System.out.print(j + " ");
     }
       System.out.println();
   }
}


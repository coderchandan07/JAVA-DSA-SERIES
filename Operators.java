//<-- arithmetic Operators-->//
public class Operators{
      static void main(){
        int solvedThisWeek=15;
        int solvedLastWeek=27;

        int Total= solvedLastWeek + solvedThisWeek;
        int Difference= solvedLastWeek - solvedThisWeek;
        int projected=solvedThisWeek*6;
        int average= solvedLastWeek/3;
        int remainder=solvedLastWeek%3;

        System.out.println(Total);
        System.out.println(Difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        // <--relational operators-->//

        int currentStrick=45;
        int targetStrick= 58;

        System.out.println(currentStrick == targetStrick);
        System.out.println(currentStrick != targetStrick);
        System.out.println(currentStrick > targetStrick);
        System.out.println(currentStrick < targetStrick);
        System.out.println(currentStrick >= targetStrick);
        System.out.println(currentStrick <= targetStrick);

        // <--Logical operators--> //

        boolean CompletedDSA= true;
        boolean CompletedCORE= false;

        System.out.println(CompletedDSA && CompletedCORE);
        System.out.println(CompletedDSA || CompletedCORE);
        System.out.println( !CompletedCORE );

        //<--Assignment Operators-->//


        int ratingPoint= 100;

        ratingPoint +=20;
        System.out.println(ratingPoint);

        ratingPoint -=10;
        System.out.println(ratingPoint);

        ratingPoint *=2;
        System.out.println(ratingPoint);

        ratingPoint /=4;
        System.out.println(ratingPoint);

         ratingPoint %=30;
        System.out.println(ratingPoint);


        //<--Unary INC and DEC Operators-->//
          
        int activeUsers = 100;

        int Prefix = ++activeUsers;
        //pahle active user increment huwa and bangya -> 101
        //fir prifix me copy huwa , sp prefix ki value -> 102
        
        int Postfix = activeUsers++;
        // activeUser = 101
        // pahle use  karte hai ,postfix me copy hoke, postfix ->101
        // uake bad increment kar dia, activeUsers -> 102

        System.out.println(Prefix);
        System.out.println(Postfix);
        System.out.println(activeUsers);  
        
        //<-- Bitwise Operators-->

        int x = 6;  // 00000110  
        int y = 3;  // 00000011  
        
        System.out.println(x & y);
         System.out.println(x | y);
         System.out.println(x ^ y);
         System.out.println(~x);
         System.out.println(x << 1);
         System.out.println(x >> 1);

        // 6 in binary = 00000110
        // 3 in binary = 00000011
        // x & y → 00000010 → 2
        // x | y → 00000111 → 7
        // x ^ y → 00000101 → 5
        // ~x → bitwise flip
        // x << 1 → left shift → multiply by 2
        // x >> 1 → right shift → divide by 2



     }
    }


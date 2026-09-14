import java.util.*;
import java.math.BigInteger;

public class Takinginput {

     static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for firstNum: ");
        int firstNum = sc.nextInt();

        System.out.println("Enter the value for secondNum: ");
        int secondNum = sc.nextInt();

        int ans = firstNum + secondNum;

        System.out.println("Answer is: " + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger" +bg);
        
        System.out.println("Enter the value for flag");
        Boolean flag = sc.nextBoolean();

        System.out.println("Enter the value for flag");
        Short shortval = sc.nextShort();
        
        System.out.println("Enter the value for flag");
        Float floatval = sc.nextFloat();

        System.out.println("flag is: " +flag);
        System.out.println("shortval is: " +shortval );
        System.out.println("floatval is: " +floatval );

        sc.close();


    }
}

    
    


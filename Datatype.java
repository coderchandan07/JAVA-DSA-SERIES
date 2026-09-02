public class Datatype {
     static void main(){

        // Numeric data types short byte int long flot char double

        byte num1=127;
        System.out.println(num1);

        short num2=32767;
        System.out.println(num2);

        int num3=50000;
        long num4=666236561;
        System.out.println(num3);
        System.out.println(num4);

        // floating DTs
        float num5= 3.245667f;
        System.out.println(num5);

        double num6= 3.13121154616131;
        System.out.println(num6);

        //other - char, boolean
        boolean eligibletovote=true;
        System.out.println(eligibletovote);

        char firstcharacter='a';
        System.out.println("My first character is: " +  (char)(firstcharacter +2));
       
        //Data type explicit or implicit conversion
        //-- implicit conversion:--
        byte num7=124;
        int num8= num7;
         System.out.println(num8);

         //-- explicit connversion--
         long num9= 154541211;
         int num10= (int)num9;
         System.out.println(num10);
    }
}

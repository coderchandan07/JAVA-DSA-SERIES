public class Loop {
    static void main() {
        // -- First Loop--//
        for (int i = 0; i <= 10; i++) {
            System.out.println("Value of i" + i);

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Sanjeet ka Jaan srishty");
        }
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // ---Nested Loop---//
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("i =" + i + "j = " + j);
            }
        }

        // --- Break and Continue keyword---//
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 2; i <= 8; i++) {
            if (i == 4 || i == 6 || i == 3) {
                continue;
            }
            System.out.println("value of i" + i);
        }

        // --- While Loop--//
        int i = 1;

        while (i < 8) {
            System.out.println("I Love Anamika");
            i++;
        }
        // ---Nested While Loop---//
        int k = 1;
        while (k <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.println("k= " + k + "j " + j);
                j++;
            }
            k++;
        }

       //-- Do while Loop---//
       
       String print = "jai shree Ram";
        int p= 1;
        do{
            System.out.println(print);
           p++;

        }while(p<=5);
        
       

    }
}

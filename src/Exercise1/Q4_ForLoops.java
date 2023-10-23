package Exercise1;

public class Q4_ForLoops {

    //Example 1: type code to print Hello Java 3 times on the console

    public static void main(String[] args) {

        for (int i = 1; i < 4 ; i++) {

            System.out.println("Hello Java");

        }

        System.out.println("==========");

    //Example 2: type code to print integers = from 16 to 7

        for (int i = 16; i > 7 ; i--) {

            System.out.print(i + " ");

        }

        System.out.println("==========");

    //Example 3: type code to print even integers from 5 to 19
        for (int i = 5; i < 19; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            } //better, just java language
        }
        System.out.println("============");

    //Other way for same question;
        for (int i = 6; i < 19 ; i+=2) {
            System.out.print(i+" ");
        }
    }
}

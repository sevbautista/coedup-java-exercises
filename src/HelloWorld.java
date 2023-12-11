import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        int id;
        boolean isLoggedIn;
        float bankAccountBalance;
        id = 123;
        isLoggedIn = false;
        bankAccountBalance = 1000.23F;

        int theAnswer = 42;
        String question = "What is your favorite color?";

//        JAVA HAS A NOTION OF CONSTANTS, DENOTED BY THE FINAL KEYWORD.

        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";

        int myInteger = 900;
        long morePrecise = myInteger;

        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println(pi);
        System.out.println(almostPi);
//        ==================EXERCISES======================
//  1
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);
//  2
        String myString = "this is the story of a girl";
        System.out.println(myString);
//  3
//        REASSIGNING THE STRING MUST BE DONE WITH DOUBLE QUOTES, SINGLE QUOTES WILL BRING BACK AND ERROR ABOUT THE CHAR NOT BEING ABLE TO BE A STRING
//        myString = "T";
//        System.out.println(myString);
//        myString = 't';
//        System.out.println(myString);

//  4

        myString = "3.14159";
        System.out.println(myString);
//       myString = 3.14;
//        System.out.println(myString);
//        long myNumber = 3.14;
//        long myNumber = (long) pi;
//        System.out.println(myNumber);
//        long myNumber = (long) myString;
//        System.out.println(myNumber);

//        long myNumber = (long) 123L;
//        System.out.println(myNumber);
//        long myNumber;
//        myNumber = (long) 123;
//        System.out.println(myNumber);
        float myNumber = (byte) 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        BOTTOM BLOCK INCREMENTS BEFORE THE NUMBER IS PRINTED OUT, TOP BLOCK DOES SO AFTER SO THAT THE REPRINT WILL SHOW THE CHANGE
//        class MyStuddy{ } = 12344;
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;



        int x = 4;
//        x = (int) x + 5;
        x += 5;
        System.out.println(x);


        int w = 3;
        int y = 4;


        y *= w;
        System.out.println(y);

        int a = 10;
        int b = 2;
//        a = a / b;
//        System.out.println(a);
//        b = b - a;
//        System.out.println(b);

        a /= b;
        System.out.println(a);
        b -= a;
        System.out.println(b);


        byte myByte = 127;
        System.out.println(myByte++);
        System.out.println(myByte);
//            WILL LOOP BACK TO THE FIRST NUMBER IN ITS DATA TYPE RANGE

//        int myByte = Integer.MAX_VALUE;
//        System.out.println(myByte);



//================CONSOLE INPUT AND OUTPUT LECTURE===================


//        System.out.println("hello");
//        System.out.print(" world");

        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you. %n", name);
        String greeting = "Salutations";
        System.out.printf("%s, %s %n", greeting, name);

Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
    String userInput = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <--");



    }

}

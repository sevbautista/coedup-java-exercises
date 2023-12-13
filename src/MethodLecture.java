import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodLecture {

    public static void main(String[] args) {
        System.out.println(startingApplication());

//        System.out.println(sayHello("Hello","Sev"));
        System.out.println(sayHello());
        System.out.println(sayHello("hello", "bob"));
        System.out.println(sayHello("hello"));

        System.out.println(addingNums(5, 3));

        System.out.println(nameAge("Sev", 100));

        String changeMe = "hello codeup!";
        changeString(changeMe);
        System.out.println(changeMe);
        count(10);
        int base = 2;
        int exponent = 3;
        long result = getPower(base, exponent);
        System.out.println(base + "^" + exponent + "=" + result);
//    Defining Methods
//    - Methods are similar to functions, meaning it is built to perform a specific task
//    - Similar to functions in JS, methods accept parameters and produce an output

//    Basic Syntax:
//    public static returnType methodName([param1[, param2[, ...]]) {
        // the statements of the method
        // a return statement, if a return type is declared
//    }

//        * public: is the visibility modified
//                    - CAN BE PUBLIC, PRIVATE, PROTECTED, DEFAULT(PACKAGE-PRIVATE)
//            - shows that this method can be accessed by code outside of the class
//        * static:
//                    - CAN BE FINAL, ABSTRACT, SYNCHRONIZED, NATIVE, STRICTFP, STATIC

//            - When declared it states the method belongs to the class rather than a specific instance.
//            - Meaning it can be called without creating an instance of the class.
//            - Allows a method, to be called before an object of the class is created,
//            - Static Methods can: access static data directly & call other static methods only
//
//        * returnType:

//            - THis is the return type of the method
//            - All methods must define the type of the value they will return
//            - If there is no return, use the special keyword 'void'
//                  - CAN BE INT, FLOAT, DOUBLE, LONG, CHAR, BOOLEAN, VOID


//        * methodName
//            - The name of the function/method

//        * param1:
//             Parameters the method accepts
//            - A method can have no parameters, one parameters, or multiple parameters.
//            - Must include the type that specifies each parameter.
//            * Everything inside the curly braces is the body of the method.
//
//        - When building methods, they will need to be on the outside of the main method.
    }

    //    Example:
//    EXAMPLE OF NO PARAMETER
    public static String startingApplication() { //BASIC METHOD
        return "Starting my application";
    }

    //    EXAMPLE WITH TWO PARAMETERS
//    public static String sayHello(String greeter, String name) {
//        return greeter + " " + name;
//    }

    //    CREATE A METHOD THAT TAKES IN TWO NUMBERS AND RETURNS THE SUM OF THE NUMBERS. NAME THE METHOD 'addingNums'
    public static int addingNums(int one, int two) {
        return one + two;
    }
//    CREATE A METHOD THAT TAKES IN TWO PARAMETERS, THE FIRST ONE IS A NAME AND THE SECOND PARAMETER IS THE AGE. IT SHOULD RETURN NAME + AGE

    public static String nameAge(String name, int age) {
//        return name + ": " + age;
//        return name + age;
        return String.format("%s: %d", name, age);

    }

    //    METHOD OVERLOADING
//    EXAMPLE:
    public static String sayHello() {
        return "Hello Hello";

    }

    public static String sayHello(String greeter, String name) {
        return greeter + " " + name;
    }

    public static String sayHello(String name) {
        return name;

    }

    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
        System.out.println(s);
    }

    //    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//
//    }
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    //    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

// I-SPY
    public static void iSpy(String objectToFind, String hint) {
        System.out.println("Player 1: I spy with my little eyes something" + hint.concat("!"));
        Scanner spyaneer = new Scanner(System.in);
        String guess = spyaneer.nextLine();
        System.out.println("Player 2: I spy, with my litte eyes" + guess);
        if (guess.equalsIgnoreCase((objectToFind))) {

            System.out.println("You won!!");
            return;
        }
        System.out.println("keep guessing!");
        iSpy(objectToFind, hint);
        }
}







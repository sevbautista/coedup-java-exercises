import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(5, 4));
//        System.out.println(subtraction(5, 4));
//        System.out.println(multiplication(5, 4));
//        System.out.println(division(5, 4));
//        System.out.println(modulus(15, 5));
//        System.out.println(byZero(1,0));
//        System.out.println(multiSansStar(5, 3));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial());
//        do {
//            long result = factorial();
//            System.out.println("Factorial result: " + result);
//        } while (confirm());
//        Scanner scanner = new Scanner(System.in);
//        int uI1 = scanner.nextInt();
//        System.out.println(diceRoll(uI1));


//        do {
//            System.out.println(dice());
//        } while (confirm());
//====================================================================

//    1. BASIC ARITHMETIC
//    1a1. ADDITION
//    public static int addition(int a, int b) {
//        return a + b;
//
//    }
//====================================================================

//    1a2. SUBTRACTION
//    public static int subtraction(int a, int b) {
//        return a - b;
//
//    }
//====================================================================

        //    1a3. MULTIPLICATION
//    public static int multiplication(int a, int b) {
//        return a * b;
//
//    }
//====================================================================

        //    1a4. DIVISION
//    public static double division(double a, double b) {
//        return a / b;
//
//    }
//====================================================================

//    1d. MODULUS
//    public static int modulus(int a, int b) {
//        return a % b;
//
//    }
//====================================================================

//    DIVIDE BY ZERO
//            public static double byZero (double a, double b) { // SYSTEM DOES NOT LIKE THIS
//        return a / b; // SHOULD RETURN ZERO
//
//    }

//====================================================================

//    BONUS: MULTIPLICATION WITHOUT *
// WHILE LOOP WAS WRONG, HAD MY RETURN IN THE WRONG SPOT, AND WAS RETURNING THE WRONG THING
//    public static int multiSansStar(int a, int b) {
//        for (int i = 1; i < b; i++) {
//            a += a;
//        }
//        return a;
//    }

//====================================================================

        //        2. GET INTEGER WITHIN A RANGE
//    public static int getInteger(int min, int max) {
////        System.out.println("Enter a number between 1 and 10: ");
//        System.out.println("Enter a number between " + min + " and " + max);
//        Scanner scanner = new Scanner(System.in);
//        int uI = scanner.nextInt();
//
//        if (uI <= max && uI >= min) {
//            System.out.println("You are valid, you have worth.");
//            return uI;
//
//        } else {
//            System.out.println("try again, seek validation.");
//            return getInteger(min, max);
//
//        }
//    }

//====================================================================

        //    3. GET FACTORIAL OF A NUMBER
//    public static int factorial(int a) {
//        System.out.println("Enter a number between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int uI = scanner.nextInt();
//        int i, fact = 1;
//        for (i = 1; i <= uI; i++) {
//            fact = fact * i;
//        }
//        System.out.println(fact);
//        return fact;
//    }
//
//            if (uI >= b) {
//                int result = uI * (b - 1);
//                return result;
//
//            }
////            USER PUTS IN A NUMBER, THAT NUMBER WILL BE ITERATED DOWN TO
//            return a;
//    public static long factorial() {
//        int numToFactorialize = getInteger(1, 10);
//
//        long currentSum = 1;
//        for (int counter = 1; counter <= numToFactorialize; counter++) {
//            currentSum *= counter;
//        }
//        return currentSum;
//
//    }
//
//    public static boolean confirm() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Would you like to go again? [y/n]");
//        String answer = scanner.nextLine();
//        return answer.equalsIgnoreCase("y");
//    }
//====================================================================

        //  4.  CREATE AN APPLICATION THAT SIMULATES DICE ROLLING

        //        REQUIRES A NUMBER KEYED IN TO INITIATE, PRINTS OUT THE NUMBER KEYED IN AFTER AS WELL.
//    public static int diceRoll(int UI1) {
//        System.out.println("Enter the number of sides for a pair of dice");
//        Scanner scanner = new Scanner(System.in);
//        int uI1 = scanner.nextInt();
//        Random rand = new Random();
//        int randInt1 = rand.nextInt(uI1);
//        int randInt2 = rand.nextInt(uI1);
//        System.out.println("Num 1: " + randInt1);
//        System.out.println("Num 2: " + randInt2);
//
//        return uI1;
//    }
//
//        public static String dice () {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("How many sides does your dice have?");
//            int sides = scanner.nextInt();
//            int dice1 = (int) ((Math.random() * sides) + 1);
//            int dice2 = (int) ((Math.random() * sides) + 1);
//            return "dice #1 = " + dice1 + ", dice #2 = " + dice2;
//
//
//        }

//====================================================================


//    5. GAME DEVELOPMENT 101

    }
}
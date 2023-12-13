import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        EXERCISE 1a: WHILE LOOP
//        int i = 5;
//        while ( i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        EXERCISE 1b: DO WHILE LOOP
        //============ //============//
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//            i++;
//
//        } while (i <= 100);
        //============ //============//
//
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//
//        } while (i >= -10);
        //============ //============//
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//
//        } while (i <= 1000000);
        //============ FOR LOOP REFACTORS//============//
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
        //============ //============//
//        for (int i = 0; i <= 100; i = i+2){
//            System.out.println(i);
//        }
        //============ //============//
//        for (int i = 100; i >= -10; i = i - 5){
//            System.out.println(i);
//        }
        //============ //============//
//for (long i = 2; i <= 1000000; i *= i){
//    System.out.println(i);
//}

//        EXERCISE 2: FIZZBUZZ

//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        EXERCISE 3: TABLE OF POWERS
//
//        Scanner newScan = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//
//        int uI = newScan.nextInt();
//
//        for (int i = 1; i <= uI; i++) {
//            if (i < 5) {
//
//                System.out.println(i);
//                System.out.println(i * i);
//                System.out.println((i * i) * i);
//
//
//                Scanner sC = new Scanner(System.in);
//                System.out.println("would you like to continue? [y/n]");
//                String userInput = sC.next();
//
//                boolean response = userInput.equals("y");
//                System.out.println("then let's continue");
//
//            }
//            if (i == 5) {
//                System.out.println("We're finished.");
//                break;
//            }
//            //    Scanner sC = new Scanner(System.in);
//            //    String userInput = sC.next();
//            //    boolean response2 = userInput.equals("n");
//            //    System.out.println("Then let's pause.");
//    }

        //============ FARRUKH'S EXAMPLE//============//
//        Scanner scanner = new Scanner(System.in);
//        boolean confirm;
//        do {
//            System.out.println("What number would you like to go up to?");
//            int uI = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i =  1; i <= uI; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//
//                System.out.printf("%-7s|%-9s|%-6s\n", i, square, cubed);
//            }
//                System.out.println("Continue [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//
//    }while(confirm);
//        System.out.println("Cool. See you next time!");

//        EXERCISE 3: NUMBER GRADES TO LETTER GRADES


        Scanner sC = new Scanner(System.in);
//        System.out.println("Give me the grade from 0 to 100:");
//        while (sC.hasNext()) {
//            int uI = sC.nextInt();
//            if (uI >= 99) {
//                System.out.println("Then you get an A+. That's Awesome!");
//            } else if (uI >= 88) {
//                System.out.println("Then you get an A. Good Job!");
//            } else if (uI >= 85) {
//                System.out.println("Then you get a B+. Not too shabby.");
//            } else if (uI >= 80) {
//                System.out.println("Then you get a B. Not bad.");
//            } else if (uI >= 75) {
//                System.out.println("Then you get a C+. Getting there.");
//            } else if (uI >= 67) {
//                System.out.println("Then you get a C. Needs a bit of work.");
//            } else if (uI >= 60) {
//                System.out.println("Then you get a D. See me after class.");
//            } else if (uI < 25) {
//                System.out.println("Then you get an F-. How?");
//            } else if (uI < 60) {
//                System.out.println("Then you get an F");
//            }
//            Scanner nG = new Scanner(System.in);
//            System.out.println("Would you like to try again with a different grade?");
//            String userInput = nG.next();
//
//            boolean response = userInput.equals("y");
//            System.out.print("then let's continue. Give me the grade from 0 to 100:");
//
//        }
////        if (boolean response = userInput.equals("n")) {
////            System.out.print("then let's stop. You got what you got. So be it.");
////            break;
////    }
//        FARRUKH'S EXAMPLE:
        boolean confirm;

        do {
            System.out.println("Enter a numerical grade from 0 to 100: ");
            int userGrade = sC.nextInt();

            if (userGrade >= 88 && userGrade <= 100) {
                System.out.println("A");
            } else if (userGrade >= 80 && userGrade <= 87) {
                System.out.println("B");
            } else if (userGrade >= 67 && userGrade <= 79) {
                System.out.println("C");
            } else {
                System.out.println("F");
            }
            System.out.println("Continue? [y/n]");
            confirm = sC.next().equalsIgnoreCase("y");
        } while (confirm);
        System.out.println("K thanks bye!");
    }
}







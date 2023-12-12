import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args) { //    MAIN METHOD - WILL RUN THE APPLICATION, LIKE "FUNCTION" FOR JAVASCRIPT
        // PUBLIC - SEEN IN OTHER METHODS, PRIVATE - ONLY BELONGS TO THIS METHOD, CAN'T BE USED WITH OTHER METHODS
        // STATIC - BELONGS TO THIS MAIN METHOD ITSELF
        // VOID - WILL NOT RETURN ANYTHING, DOES NOT HAVE RETURN STATEMENT
        // MAIN - RESERVED KEYWORD, CAN'T USE IT ELSEWHERE
        // ===============BOOLEAN EXPRESSIONS====================
        System.out.println(10 > 5);
        System.out.println(5 == 5);
        System.out.println(true == false);
        System.out.println(); // ln WILL PRODUCE A NEW LINE
        System.out.println(2 <= 2);

        //===============LOGICAL OPERATORS====================
        boolean isLoggedIn = true;
        boolean isAdmin = true;
        if (isLoggedIn && isAdmin) { // USER IS LOGGED IN -AND- IS AN ADMIN
            // SHOW THE ADMIN PANEL
            System.out.println("admin page");
        }
        System.out.println((true == true) || true == false);

        //===============STRING COMPARISON====================
        Scanner sc = new Scanner(System.in); // GOING INTO THE PROMPT TO GRAB SOMETHING
        System.out.println("Continue? [y/N]");
        String userInput = sc.next(); // STORING USER INPUT AS A STRING, STRING ISN'T PRIMITIVE, STRING IS REFERENCE, STRING IS AN OBJECT

        boolean confirmationA = userInput == "y"; // DO NOT DO THIS
        System.out.println(confirmationA);
        System.out.println(userInput == "y");

        boolean confirmationB = userInput.equals("y"); // INSTEAD DO THIS
        System.out.println(confirmationB);
        System.out.println(userInput == "y");
        System.out.println("---");

        //===============CONTROL STRUCTURE====================

        boolean lectureTime = true;

        if (lectureTime) {
            System.out.println("Learning Something");
        } else {
            System.out.println("this will always run");
        }
        System.out.println("----");

        boolean learningJava = true;
        boolean learningJavaScript = true;
        boolean learningHTML = true;

        if (learningJava && learningJavaScript && learningHTML) {
            System.out.println(" Learning JAVA, JavaScript, HTML");
        } else if (learningJavaScript) {
            System.out.println("learning JavaScript");
        } else if (learningHTML) {
            System.out.println("learning html");
        } else if (learningJava) {
            System.out.println("Learning JAVA");
        } else {
            System.out.println("Learning something else");

        }
        System.out.println("------");

//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
////                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

//        SWITCH CASE
        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1 -> System.out.println("Case 1");
            // Fall through!
            case 2 -> System.out.println("Case 2");
            default -> System.out.println("Default case");
        }


//        int i = 11;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        DO WHILE

//        do {
//            System.out.println("You will see this despite the condition!");
//        } while (false);
//        do {
//                System.out.println("i is " + i);
//                i++;
//            }
//            while (i < 10) ;


//            FOR LOOP

            for (int i = 0; i <20; i ++) {
                if (i == 7) {
                    System.out.println( "i = " + i + " Whoo - that's a lucky number!");
                    continue; // WILL SKIP OVER PRINTING 7
                }
                if(i == 9) {
                    System.out.println("break the loop");
                    break; // WILL STOP BEFORE PRINTING OUT 9
                }
                System.out.println("i = " + i);
            }

    }

}




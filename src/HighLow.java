import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        boolean confirm;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of sides for a pair of dice");
        Random rand = new Random();
        int randInt = rand.nextInt(1, 10);
        System.out.println("Can you guess the number?");
        int g = 3;
        int i;
        do {

            int uI = scanner.nextInt();
            if (uI > randInt) {
                System.out.println("LOWER :)");
            } else if (uI < randInt) {
                System.out.println("HIGHER ;)");
            } else if (uI == randInt) {
                System.out.println("GOOD GUESS :D");
                break;
            }
            System.out.println("Guess again? [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");

        } while (confirm);
    }
}
//            for (i = 0; i <= g; i++) {
//                    if (i == g) {
//                    System.out.println("AW, NO MORE GUESSES!");
//                    }
//                    }
//ITERATION FOR NUMBER OF GUESSES, i = iteration, G = 10, IF i = G, sout "AW, NO MORE GUESSES!"
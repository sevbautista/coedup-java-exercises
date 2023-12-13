import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Bob {
    public static void main(String[] args) throws InterruptedException {

//        EXERCISE 2: BOB
//        Create a class named Bob with a main method for the following exercise.
//
//Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//He answers 'Whatever.' to anything else.
//Write the Java code necessary so that a user of your command line application can have a conversation with Bob.


        Scanner scanner = new Scanner(System.in);
        boolean confirm;
        System.out.println("\"Would you like to chat with 'Bob'?\"");
        String inR = scanner.nextLine();

        System.out.println("Yo, I'm Bob.");
        do {
            if (inR.equalsIgnoreCase("y")) {
                System.out.println("Suh, what do you want?");
                String uI = scanner.nextLine();

                if (uI.endsWith("?")) {
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("Sure.");
                } else if (uI.endsWith("!")) {
                    TimeUnit.MILLISECONDS.sleep(250);
                    System.out.println("Whoa, chill out!");
                } else if (uI.isEmpty()) {
                    TimeUnit.MILLISECONDS.sleep(650);
                    System.out.println("Fine. Be that way!");
                } else {
                    TimeUnit.MILLISECONDS.sleep(100);
                    System.out.println("whatever.");
                }
            } else {
                break;
            }
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("...is that it?");

            confirm = scanner.next().equalsIgnoreCase("no");
            System.out.println("ok...");
            TimeUnit.MILLISECONDS.sleep(1000);
        } while (confirm);
        System.out.println("pfft, yeah bye.");
    }
}

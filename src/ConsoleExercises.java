import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;


//String valueOfPie = "The value of pi is approximately ";
//        System.out.printf(" The value of pi is approximately %.2f%n", pi);


//THE %s IS FOR STRINGS, %d  IS FOR DOUBLE,
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an Integer: ");
//
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//
//        Scanner threeWords = new Scanner(System.in);
//        System.out.println("Enter an Integer: ");
//        String userWord0 = threeWords.next();
//        String userWord1 = threeWords.next();
//        String userWord2 = threeWords.next();
//        System.out.printf("Your Integer was: %d%n", userInput);
//
//        System.out.println(userWord0);
//        System.out.println(userWord1);
//        System.out.println(userWord2);
//        System.out.printf("%s %s %s,", userWord2, userWord1, userWord0);


        Scanner classDimensions = new Scanner(System.in);
        System.out.println("Enter Dimensions Please:");
        String users = classDimensions.nextLine();

        int w = Integer.parseInt(users);

        double l = classDimensions.nextInt();
        double area = w + w;
        double perimeter = l + l;
        System.out.printf("Room's area is ");
        System.out.println(l * w);
//        width = (float)width;
        System.out.printf("Room's perimeter is ");
        System.out.println(area *= perimeter);

    }

}


public class StringLec {
    public static void main(String[] args) {
//        String message = "Hello";
//        System.out.println(message);
//        message = message + "World!";
//        System.out.println(message);
//
//
//        String day = "Wednesday";
//        String day2 = new String("Wednesday");
//        System.out.println(day.equals(day2));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

// DON'T DO THIS!
//        boolean confirmation = userInput == "y";
//        System.out.println(confirmation);

//  DO THIS INSTEAD
//        boolean confirmation = userInput.equals("y");
//        System.out.println(confirmation);


// DON'T DO THIS
//        if ("I am a string" == "I am a string") {
//            System.out.println("Strings are equal");
//        }

//        But in general we cannot rely on that behavior, and should use either the
//`equals` or `equalsIgnoreCase` method on a string object to compare string
//        values.

//        DO THIS INSTEAD
//        if ("I am a string".equals("I am a string")) {
//            System.out.println("Strings are equal");
//        }

        String input = "Codeup Rocks!";

        input.equals("codeup rocks!"); // false
        input.equals("Codeup Rocks!"); // true

        input.equalsIgnoreCase("codeup rocks!"); // true
        input.equalsIgnoreCase("Codeup Rocks!"); // true

        input.startsWith("codeup"); // false
        input.startsWith("Codeup"); // true

        input.endsWith("rocks");// false
        input.endsWith("rocks!");// false
        input.endsWith("Rocks!"); // true

//        STRING MANIPULATION METHODS
        String manipulation = "String to manipulate";
        String trimTest = " String to manipulate ";
        System.out.println(manipulation.charAt(4)); // - n: CHARACTERS START AT INDEX 0
        System.out.println(manipulation.indexOf("y")); // - 1: DOES NOT CONTAIN y
        System.out.println(manipulation.indexOf("i")); // 3:  INDEX OF FIRST i
        System.out.println(manipulation.lastIndexOf("n")); // 12: THE LAST INDEX OF THAT CHAR
        System.out.println(manipulation.length()); // ENTIRE LENGTH OF STRING
        System.out.println(manipulation.replace("manipulate", "change")); // CHANGE SELECTED PORTION OF STRING
        System.out.println(manipulation.substring(4, 15)); // DISPLAY A NEW STRING OF SELECTED PORTION, START REQUIRED, LAST OPTIONAL
        System.out.println(manipulation);
        System.out.println(manipulation.toLowerCase());
        System.out.println(manipulation.toUpperCase());
        System.out.println(trimTest.trim());

    }
}


// Java program to read data of various types using Scanner class.

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;


public class HelloWorld {

    public static void main(String[] args) {
        /* TODO: use the scanner to take in the name of the month you were
        born and print it back out
        */

//        Scanner sc = new Scanner(System.in);
//        System.out.print("What is your favorite quote: ");
//        String quote = sc.nextLine();
//        System.out.println(quote);
//
//
//        System.out.printf("Please enter your age: ");
//        int age = sc.nextInt();
//        System.out.println("Your are " + age + " years old");
//
//        Date date = new Date();
//        System.out.println("Today's date is: " + date);
//
//
//        /* TODO: use the scanner to take in your birthday as an integer and then name
//            of the month you were born and print it back out
//            - remember to first prompt the user for the birthday day of the month and
//            store as an integer
//            - next take in name of the month with .nextLine()
//            - print out the result
//            - use a fix to prevent the month name input from being skipped
//            Collapse
//        */
//        System.out.print("Please enter the day of the month you were born: ");
//        int day = sc.nextInt(); // 9\
//        System.out.printf("Please enter the month that you were born in: ");
//        sc.nextLine();  // clears out the new line
//        String month = sc.nextLine();
//        System.out.println("You were born " + month + " / " + day);
//
//
//        double number = 0.9999999999999;
//        DecimalFormat numberFormat = new DecimalFormat("#.00");
//        System.out.println(numberFormat.format(number));
//
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

// ==================== Slide 3

        // no >== ,or <==, or === because only value comparisons are available
        // truthy and falsy values don't exist in Java


        // ==================== Slide 5

        // && will only check second value if first is true
        // & will check both
        // this can be used to check what would otherwise result in a syntax error
        // same comparison process for || and |

        // x will only increment in second condition if first condition is true using &&
//                int x = 2;
//                int y = 3;
//
//                if (false && ++x == y) {
//                    System.out.println("Equal");
//                } else {
//                    System.out.println("Not equal");;
//                }
//                System.out.println(x);


        // ==================== Slide 7

        // DO NOT COMPARE STRINGS WITH == !!!!

//                Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine();
//                String cat2 = "cat";
//                System.out.println(cat1);
//                System.out.println(cat2);
//                System.out.println(cat1 == cat2);

        // do use equals(),

//    boolean stringValuesAreEqual = "Test".equals("Tes");
//    System.out.printf("The result is: %s", stringValuesAreEqual);


        // or use equalsIgnoreCase()

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

        // does not equal

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));



        // ==================== Slides 8 - 16

        // basically the same as JS :)


//            String caseSwitch = "Fred";
//            switch (caseSwitch) {
//                case "bob":
//                    System.out.println("Case 1");
//                    break;
//                case "fred":
//                    System.out.println("Case 2");
//                    break;
//                default :
//                    System.out.println("Default case");
//                    break;
//            }





    }
}

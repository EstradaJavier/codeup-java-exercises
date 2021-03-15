//import java.text.DecimalFormat;
//import java.util.Date;
//import java.util.Scanner;
//import java.util.stream.IntStream;
//
//public class ControlFlowExercises {
//
//    public static void main(String[] args) {
//
//
////        While
////
////        Create an integer variable i with a value of 5.
////        Create a while loop that runs so long as i is less than or equal to 15
////        Each loop iteration, output the current value of i, then increment i by one.
////        Your output should look like this:
////
////        5 6 7 8 9 10 11 12 13 14 15
//
//        int i = 5;
//        while (i < 16) {
//            System.out.println( "The value of i is nlw: " + i );
//            i++;
//        }
//
//            for(int i = 5; i < 16; i++ ) {
//                System.out.println("The value of i is: " + i);
//            }
//
//
////        Do While
////
////        Create a do-while loop that will count by 2's starting with 0 and ending at 100.
////        Follow each number with a new line.
////        Alter your loop to count backwards by 5's from 100 to -10.
////        Create a do-while loop that starts at 2, and displays the number squared on each line while
////        the number is less than 1,000,000. Output should equal:
//
////        double i = 2;
////        do {
////            System.out.println((int) + i);
////            i = Math.pow(i, 2);
////        }
////            while(i < 1000000);
//
////                2
////                4
////                16
////                256
////                65536
//
////            for(double i = 2; i < 1000000; i= Math.pow(i, 2)) {
////                System.out.println((int) + i);
////            }
//
//        for (int i = 1; i < 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println(" -- FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println(" -- Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println(" -- Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//        // Here is my powers table
////        What number would you like to go up to? 5
////        Here is your table!
////
////        number | squared | cubed
////        ------ | ------- | -----
////        1      | 1       | 1
////        2      | 4       | 8
////        3      | 9       | 27
////        4      | 16      | 64
////        5      | 25      | 125
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Please enter your number : ");
////        int userInput = sc.nextInt();
////
////        System.out.print("Here is your table");
////        System.out.print(" ");
////        System.out.print("Number" + "   |   " + "Squared" + "   |   " + "   |   "Cubed);
////        System.out.print("Here is your table");
////
////        // for loop to build my table like the example
////        for(int i = 0; i < usertInput; i++) {
////            System.out.println();
////        }
//    }
//}
//

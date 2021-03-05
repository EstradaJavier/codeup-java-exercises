import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Bob {
    public static void main(String[] args) {

//      Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//            He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//            He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//            He answers 'Whatever.' to anything else.
//      Write the Java code necessary so that a user of your command line application can have a
//      conversation with Bob.


        System.out.println("Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)");

        System.out.println("He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)");

        System.out.println("He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)");

        System.out.println("He answers 'Whatever.' to anything else.");


            Scanner scan = new Scanner(System.in); //Creates a new scanner
            System.out.println("Who is on the 5 dollar bill?"); //Asks question
            String input = scan.nextLine(); //Waits for input
            if (input.equalsIgnoreCase("Lincoln")) { //If the input is Lincoln (or any case variant of Lincoln)
                System.out.println("Correct!");
            }
            else { //If the input is anything else
                System.out.println("Incorrect!");
            }


    }
}

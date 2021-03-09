import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        Create a class Bob for the following exercise with a main method.
//        Bob is a lackadaisical
//        teenager. In conversation, his responses are very limited.
//            Bob answers 'Sure.' if you ask him a question.
//            He answers 'Whoa, chill out!' if you yell at him.
//            He says 'Fine. Be that way!' if you address him without actually
//            saying anything.
//            He answers 'Whatever.' to anything else.

        Scanner scanner = new Scanner(System.in);       // First we declare a variable
                                                        // of type Scanner, and assign
                                                        // to it a new Scanner object.

        System.out.print("What will you say to Bob? "); // Prints the question "out" to the terminal.
        String userResponse = scanner.nextLine().trim();// Takes in the user response and removes the
                                                        // white spaces.
        System.out.println(userResponse);               // Prints out the typed response and the answer
                                                        // base on an (if / else if / else) statement.

        if (userResponse.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userResponse.endsWith("?")) {
            System.out.println("Sorry, what was the question?");
        } else if (userResponse.equals("")) {
            System.out.println("No answer... OK, fine. Be that way!");
        } else {
            System.out.println("For real!!!");
        }


    }
}

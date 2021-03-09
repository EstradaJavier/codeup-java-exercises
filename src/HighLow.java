import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        public static String checkGuest(int guest, int targetNum) {

            System.out.println(guess 35, targetNum 35);
        }
            public static void playGame (Scanner scanner) {

            System.out.println("Please guess a number vetween 1 and 100");

            int randomNumber = (Math.random() * 100) + 1)

                int userGuess = scanner.nextInt();

                if(userGuess < 1 || userGuess > 100) {
                    System.out.println("Please try again");
                } else {
                    String response = checkGuest(userGuess, randomNumber);


                }

            if (guess == targetNum) {
                return "You guessed the correct number!";
            } esle if(guess > targetNum) {
                return "Lower Please";
            } esle  if (guess < targetNum) {
                return "Higher, Please";
            }
            return "IDK Brother"
        }
    }
}

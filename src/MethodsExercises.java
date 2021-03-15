import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        Exercises
//        Create four separate methods. Each will perform an arithmetic operation:
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//        System.out.println (Addition (4,5));
//        System.out.println (Subtraction (1,4));
//        System.out.println (MultiplicationMethod (3,413));
//        System.out.println (DivisionMethod (4,121));
//        System.out.println (Mod (7,14));
    }
//
//        TODO: Addition
            public static double Addition(double one, double two) {
                return one + two;
            }

//        TODO: Subtraction
//            public static double Subtraction(double one, double two) {
//            return one - two;
//            }

//        TODO:Multiplication
//            public static double MultiplicationMethod(double one, double two) {
//                return one * two;
//            }

//        TODO: Division
//            public static double DivisionMethod(double one, double two) {
//                return one / two;
//            }

//        TODO: Mod - Add a modulus method that finds the modulus of two numbers.
//            public static double Mod(double one, double two) {
//                return one % two;
//            }

//        Bonus
//
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

//            public static double MultiplicationMethod(double one, double two) {
//
//                return ( );
//
//        Create a method that validates that user input is in a certain range
//          The method signature should look like this:

//            public static int getInteger(int min, int max) {
//                System.out.print("Enter a number between 1 and 10: ");
//                int userInput = getInteger(1, 10);
//            }

//          and is used like this:
//        If the input is invalid, prompt the user again.
//          Calculate the factorial of a number.
//
//                Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
//
//
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24
//        Bonus
//
//        Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//                Use recursion to implement the factorial.
//                Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the
//        user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//                Use the .random method of the java.lang.Math class to generate random numbers.
//        Game Development 101
//
//        Welcome to the world of game development!
//
//                You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//        The specs for the game are:
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//                If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//
//        Use the random method of the java.lang.Math class to generate a random number.
//        Bonus
//
//        Keep track of how many guesses a user makes.
//                Set an upper limit on the number of guesses.
//        codeycodey Pair programming exercise
//        Remember to follow our pair programming best practices and switch computers every once in a while.
//
//        Console Adventure Game!
//                Using what you've learned so far in the Java I module, we're going to create a classic text-based RPG game. These types of online role-playing games date back to the 70's and solely rely on a text-based interface. In this case, we'll be using Java to run this game in our console.
//
//        The idea is that your game will prompt the user, who will then input answers through the console (using the Scanner class). How the game changes depending on their answer is completely up to you! Below are a list of suggested features to get you started:
//
//        Ask if the user is ready to start. If they type in "yes", start the game.
//        Ask the user for their name. Store this as a variable to personalize the adventure.
//                A classic RPG will have the hero going through different scenarios and battling their enemies.
//        Display enemy stats and hero stats. Properties and values can be assigned by you.
//        For example: Health, Attack Points, etc.
//                Decide on what actions your hero can take.
//                Attack (decreases enemyHealth)
//        Drink potion (adds to heroHealth)
//        Run? (ends the game)
//        Keep asking for user input until the enemyHealth reaches 0, then end the game.
//                Bonuses
//
//        Allow the user to specify hero stats and enemy stats.
//        Automate an enemyAttack after each time the hero takes a turn.
//                End the game if either heroHealth or enemyHealth drops to 0.
//        Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.
//
//                Remember that these are only suggestions. Feel free to get creative and have fun!!



//        1  - Write a method named firstChar() that takes a string as an input and returns the
//            first letter as a character data type.



//        2  - Write a method named secondChar() that takes a string as an input and returns the
//              first letter as a character data type.


//        3  - Write a method named lastChar() that takes a string as an input and returns the last
//              letter as a character data type.


//        4  - Write a method named secondToLastChar() that takes a string as an input and returns
//              the second to letter as a character data type.


//        5  - Write a method named userWantsToContinue(). This method should prompt the user if
//              they want to continue and then return a boolean value if the user inputs "y" or "yes".


//        6  - Write a method named isEven() that takes in an integer and returns a boolean if the
//              input is even or not.


//        7  - Write a method named isOdd() that takes in an integer and returns a boolean if the
//              input is odd or not.


//        8  - Write a method named countOdds(start, end) that returns an integer containing the
//              integer that is the count of all odd numbers between the start and the end input integers.


//        9  - Write a method named countEvens(start, end) that returns an integer containing the
//              integer that is the count of all even numbers between the start and the end input integers.


//        10 - Write a method named isVowel() that accepts a String input of length 1 and returns
//              a boolean if that string is a vowel other than "y".


//        11 - Write a method named hasVowels() that accepts a string of any length and returns a
//              boolean if there are any vowels in that string.


//        12 - Write a method named countVowels() that accepts a string of any length and returns
//              an integer count of the number of vowels in the provided input String.


//        13 - Write a solution to FizzBuzz using recursion instead of a loop.


//        14 - Write a method named isPrime() that that accepts in an integer number and returns a
//              boolean if the number is evenly divisible only by either 1 or the number itself.


//        15 - Write a method named getTwentyPrimes() that returns a string containing the first 20
//              prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"...
//              until we have a total count of 20 primes in the string.
//
//

}

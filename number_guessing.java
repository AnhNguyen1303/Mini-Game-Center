import java.util.Scanner;
public class number_guessing {
    private static  int MAX_GUESSES = 10;
    public static void play(Scanner input) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess the secret number from 1 to 100.");
        while (attempts < MAX_GUESSES) {
            System.out.print("Guess " + (attempts + 1) + "/" + MAX_GUESSES + ": ");
            int guess = input.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100.");
                continue;
            }
            attempts++;
            if (compare(guess, secretNumber)) {
                System.out.println("You guessed it in " + attempts + " trial(s).");
                return;
            }
            System.out.println("Attempts remaining: " + (MAX_GUESSES - attempts));
        }
        System.out.println("No guesses left. The secret number was " + secretNumber + ".");
    }
    private static boolean compare(int guess, int secretNumber) {
        if (guess == secretNumber) {
            System.out.println("Yes, correct!");
            return true;
        } else if (guess < secretNumber) {
            System.out.println("Too low.");
        } else  {
            System.out.println("Too high.");
        }
        return false;
    }
}
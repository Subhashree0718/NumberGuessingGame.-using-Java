 import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to read user input
        Random random = new Random(); // Random object to generate random numbers
        
        int min = 1; // Minimum value for the random number
        int max = 100; // Maximum value for the random number
        int randomNumber = random.nextInt(max - min + 1) + min; // Generate a random number between min and max
        int guess; // Variable to store the user's guess
        int attempts = 0; // Variable to keep track of the number of attempts
        
        // Welcome message and instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("In this game, I have selected a random number between 1 and 100.");
        System.out.println("Your task is to guess the number within the fewest attempts possible.");
        System.out.println("After each guess, I will tell you if your guess is too high or too low.");
        System.out.println("Let's see how quickly you can guess the number!");

        // Loop until the user guesses the correct number
        do {
            System.out.print("Enter your guess (between 1 and 100): ");
            guess = scanner.nextInt(); // Read the user's guess
            attempts++; // Increment the number of attempts
            
            // Provide feedback based on the user's guess
            if (guess < randomNumber) {
                System.out.println("Too low! Try again."); // If the guess is too low
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again."); // If the guess is too high
            }
        } while (guess != randomNumber); // Repeat until the user guesses the correct number
        
        // Congratulatory message when the user guesses the correct number
        System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in " + attempts + " attempts!");
        if (attempts == 1) {
            System.out.println("Wow! You got it on your first try! You're a genius!");
        } else if (attempts <= 5) {
            System.out.println("Great job! You guessed the number in " + attempts + " attempts. That's impressive!");
        } else if (attempts <= 10) {
            System.out.println("Well done! You guessed the number in " + attempts + " attempts. Keep it up!");
        } else {
            System.out.println("You guessed the number in " + attempts + " attempts. Keep practicing to improve!");
        }

        // Offer to play again
        System.out.println("Would you like to play again? (yes/no)");
        String playAgain = scanner.next().toLowerCase();
        if (playAgain.equals("yes")) {
            // Reset the game
            randomNumber = random.nextInt(max - min + 1) + min;
            attempts = 0;
            // Start a new game
            System.out.println("Great! Let's play again.");
            main(null);
        } else {
            System.out.println("Thank you for playing!");
     
        }
        scanner.close();
    }
    
}
 
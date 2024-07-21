import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int totalRounds = 3; // Number of rounds to play

        for (int round = 1; round <= totalRounds; round++) {
            int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 5; // Maximum attempts per round

            System.out.println("Round " + round + ":");
            System.out.println("I've chosen a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    int score = maxAttempts - attempts + 1; // Calculate score based on attempts
                    totalScore += score;
                    System.out.println("You scored " + score + " points this round.");
                    break; // End the round if the user guessed correctly
                }

                if (attempts == maxAttempts) {
                    System.out.println("You ran out of attempts. The number was " + numberToGuess);
                }
            }
        }

        System.out.println("Game over! Your total score is " + totalScore);
    }
}

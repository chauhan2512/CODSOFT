import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxAttempts = 10; 
        int score = 0;
        boolean playAgain;
        
        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int numberToGuess = random.nextInt(100) + 1; 
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");
            
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
            }
            
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        } while (playAgain);
        
        System.out.println("Game over! Your score: " + score + " round(s) won.");
        scanner.close();
    }
}

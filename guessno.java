import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private int numberToGuess;
    private int numberOfTries;

    public NumberGuessingGame(int maxNumber, int maxTries) {
        Random random = new Random();
        numberToGuess = random.nextInt(maxNumber) + 1;
        numberOfTries = maxTries;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + numberOfTries + " attempts to guess the number.");

        for (int i = 0; i < numberOfTries; i++) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                scanner.close();
                return;
            }
        }

        System.out.println("Sorry! You've used all your attempts. The number was: " + numberToGuess);
        scanner.close();
    }

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame(100, 5);
        game.startGame();
    }
}

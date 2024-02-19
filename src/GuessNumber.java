import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberOfTries = 0;

        int numberToGuess = rand.nextInt(10) + 1;
        int usersGuess = -1; //erklæret uden fr scope

        while (usersGuess != numberToGuess) {
            System.out.println("indtast dit gæt som et tal mellem 1 og 10:");
            usersGuess = scanner.nextInt();

            if (usersGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number: " + numberToGuess);
            } else if (usersGuess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again");
            }
            numberOfTries++;
        }
        System.out.println("You used " + numberOfTries + " tries");
    }
}

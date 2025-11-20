import java.util.Random;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int answer = rand.nextInt(10) + 1;
        System.out.println("Guess the Number from 1 until 10. Type 0 to Exit.");
        int guess;
        int attempts = 0;

        while (true) {
            System.out.print("Enter Your Guess : ");
            if (!input.hasNextInt()) {
                input.next();
                System.out.println("The input must be a Number!");
                continue;
            }
            guess = input.nextInt();
            attempts++;

            if (guess == 0) {
                System.out.println("The Game is over. The answer is : " + answer);
                break;
            }

            if (guess == answer) {
                System.out.println("Correct! The Answer is : " + answer + ". Attempts " + attempts + " times.");
                break;
            } else if (guess < answer) {
                System.out.println("Too small.");
            } else {
                System.out.println("Too big.");
            }
        }
        input.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random random = new Random();

        int secret = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        int guess = 0;

        while(guess != secret) {

            System.out.print("Enter Guess: ");
            guess = sc.nextInt();

            if(guess > secret)
                System.out.println("Too High");

            else if(guess < secret)
                System.out.println("Too Low");

            else
                System.out.println("Correct! You Won!");

        }

        sc.close();
    }
}
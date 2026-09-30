import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main (String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int randomNum = random.nextInt(1,101);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100:");

        do{
            System.out.println("Enter your number: ");
            guess=scanner.nextInt();
            attempts++;

            if(guess<randomNum) {
                System.out.println("Your guess is too low! Try again");
            }
            else if(guess>randomNum){
                    System.out.println("Your guess is too high! Try again");
            }
            else{
                System.out.println("Excellent! The number was "+randomNum);
                System.out.println("It took you "+attempts+" attempts to guess it right!");

            }

        }while (guess != randomNum);

        scanner.close();
    }
}

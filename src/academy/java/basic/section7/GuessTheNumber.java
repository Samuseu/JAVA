package academy.java.basic.section7;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        /*//read source data
        System.out.println("Computer guessed the number from 0 to 9");
        int guesNumber = new Random().nextInt(10);
        System.out.println("Enter a number from 1 to 9");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //processing
        String result = " ";
        while (number != guesNumber) {
            if (number > guesNumber) {
                System.out.println("Number > guessNumber");
            } else {
                System.out.println(" Number < guessNumber");
            }
            System.out.println("Try again");
            number = scanner.nextInt();
        }
        //display result
        System.out.println("Congratulations, you guessed the number!");*/

        {//read source data
            var number = new Random().nextInt(10);

            //processing
            while (true) {
                var userCase = new Scanner(System.in).nextInt();
                if (number > userCase) {
                    System.out.println("Number > " + userCase + " Try again");
                } else if (number < userCase) {
                    System.out.println("Number < " + userCase + "Try again");
                } else {
                    System.out.println("Congratulations, you guessed the number!");
                    break;
                }
            }
        }
    }
}
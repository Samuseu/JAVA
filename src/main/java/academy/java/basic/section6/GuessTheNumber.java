package academy.java.basic.section6;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        //read source data
        System.out.println("Компьютер загадал число попробуй угадать от 0 - 9");
        var number = new Random().nextInt(10);
        System.out.println("Введите число от 0 - 9");
        var numberUsers = new Scanner(System.in).nextInt();

        //processing
        String results = (number == numberUsers ? "Congratulations, you guessed the number!" : "Sorry, but your number is invalid! Try again later...");
       /* if (number == numberUsers) {
           results = "Congratulations, you guessed the number!";
        } else {
            results = "Sorry, but your number is invalid! Try again later...";
        }
*/
        //display results
        System.out.println(results);
    }
}

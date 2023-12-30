package academy.java.basic.section7;

import java.util.Random;
import java.util.Scanner;

public class BreakValid {
    public static void main(String[] args) {
        //read source data
        var number = new Random().nextInt(10);
        //processing
        var guess = false;
        for (int i = 0; i <3 ; i++) {
            var userCase = new Scanner(System.in).nextInt();
            if (number > userCase) {
                System.out.println("Number > " + userCase + " Try again");
            } else if (number < userCase) {
                System.out.println("Number < " + userCase + "Try again");
            } else {
                guess = true;
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
        if(!guess){
            System.out.println();
            System.out.println("Limit attempts");
        }
    }
}

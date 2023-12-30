package academy.java.basic.section7;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        while (true){
            var number = new Scanner(System.in).nextInt();
            if (number == 0) {
                break;
            }
            System.out.println(number * number);
        }
        System.out.println("Bye");
    }
}

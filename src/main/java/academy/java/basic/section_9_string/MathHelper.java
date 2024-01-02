package academy.java.basic.section_9_string;

import java.util.Scanner;
public class MathHelper {
    public static void main(String[] args) {
        //Read source data
        double pi = Math.PI;
        double e = Math.E;
        //Processing
        while (true) {
            System.out.println("Enter cmd: {pi, e, exit or quit}");
            var enterCmd = new Scanner(System.in).nextLine();
            if (enterCmd.equals("pi")) {
                System.out.println(pi);
            } else if (enterCmd.equals("e")) {
                System.out.println(e);
            } else if (enterCmd.equals("exit") || enterCmd.equals("quit")) {
                break;
            } else {
                System.out.println(" Invalid cmd. Try again!");
            }
        }
    }
}

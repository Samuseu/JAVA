package academy.java.basic.section6;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        if (a > b) {
            var result = "a > b";
            System.out.println(result);
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        //
        boolean condition = a > b;
        if (condition){
            System.out.println("conition=true");
        }
        //
        if(condition || a < b && a > 1 || !(b < 8)){
            System.out.println("Complexext");
        }
    }
}



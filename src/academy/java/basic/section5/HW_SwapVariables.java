package academy.java.basic.section5;

import java.util.Scanner;

public class HW_SwapVariables {
    public static void main(String[] args) {
        //read source data
        System.out.println("Вести переменную А");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Вести переменную B");
        var b = new Scanner(System.in).nextInt();

        //processing
        var temp = a;
        a = b;
        b = temp;
        //results code
        System.out.println("Переменная А " + a);
        System.out.println("Переменная B " + b);
    }
}
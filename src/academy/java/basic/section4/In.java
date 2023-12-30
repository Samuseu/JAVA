package academy.java.basic.section4;

import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        var i = new Scanner(System.in).nextInt();// Считывание данных с консоли для int
        System.out.println(i);

        var b = new Scanner(System.in).nextDouble();// Считывание данных с консоли для double
        System.out.println(b);

        var c = new Scanner(System.in).nextBoolean();// Считывание данных с консоли для boolean
        System.out.println(c);

        var f = new Scanner(System.in).nextLine().charAt(0);// Считывание данных с консоли для boolean
        System.out.println(f);

        var g = new Scanner(System.in).nextLine();// Считывание данных с консоли для boolean
        System.out.println(g);
    }
}
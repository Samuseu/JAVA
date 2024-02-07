package com.youtube;

/**
 * Вид форматирования строк
 */
public class PrintF {
    public static void main(String[] args) {
        System.out.printf("String %10d \n",42);
        System.out.printf("String %-10d \n",42);
        System.out.printf("String %5d \n",42);
        System.out.printf("String %3d \n",42);
        System.out.printf("String %.2f \n",42.1234);
        System.out.printf("String %.5f \n",42.1234567);
    }
}

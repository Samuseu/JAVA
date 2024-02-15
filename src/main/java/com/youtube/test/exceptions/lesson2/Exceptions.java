package com.youtube.test.exceptions.lesson2;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int x = Integer.parseInt((sc.nextLine()));

            if( x!=0){
                try {
                    throw new IOException(); // попробуй выбросить input output exception
                } catch (IOException e) {
                    System.out.println();;
                }
            }
        }
    }
}

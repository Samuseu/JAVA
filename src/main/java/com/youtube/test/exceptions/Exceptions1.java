package com.youtube.test.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        File file = new File("ssasd");

        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}

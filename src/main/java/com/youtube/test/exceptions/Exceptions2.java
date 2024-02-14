package com.youtube.test.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("asd");

        Scanner sc = new Scanner(file);
    }
}

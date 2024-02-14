package com.youtube.test.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("asd");

        Scanner sc = new Scanner(file);
    }
}

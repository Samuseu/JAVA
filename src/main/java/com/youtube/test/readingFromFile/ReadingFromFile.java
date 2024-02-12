package com.youtube.test.readingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // меняет / или \ в зависимости от windows или linux
        String path = "src" + separator + "main" + separator + "resources" + separator + "file.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

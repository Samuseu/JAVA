package com.youtube.test.readingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFileWords {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // меняет / или \ в зависимости от windows или linux
        String path = "src" + separator + "main" + separator + "resources" + separator + "fileNew.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] words = line.split(" ");// сплитим по пробелу, то есть берем наш файл и разбиваем по пробелу на слова.

        System.out.println(Arrays.toString(words)); // массив напрямую не можем вызвать. Используем toString

        scanner.close();
    }
}

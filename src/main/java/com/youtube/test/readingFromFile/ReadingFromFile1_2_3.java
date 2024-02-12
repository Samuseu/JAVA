package com.youtube.test.readingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile1_2_3 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // меняет / или \ в зависимости от windows или linux
        String path = "src" + separator + "main" + separator + "resources" + separator + "fileNew1_2_3.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");// сплитим по пробелу, то есть берем наш файл и разбиваем по пробелу на слова.

        int[] numbers = new int[3];
        int counter = 0;
        for(String number:numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers)); // массив напрямую не можем вызвать. Используем toString

        scanner.close();
    }
}

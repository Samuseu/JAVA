package academy.java.basic.section_9_string;

import java.util.Arrays;

public class StringNewStringMethods {
    public static void main(String[] args) {
        String s = " hello world ";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println("==============");

        System.out.println(s.repeat(2));
//        s =s.repeat(2);// создать новую строку в старой

        System.out.println("==============");

        System.out.println(s.replace("l","s"));// Замена
        System.out.println(s.replace("hello","bye"));

        System.out.println("==============");

        System.out.println(s.substring(6));//вырезка слов
        System.out.println(s.substring(0,6));//вырезка слов от 0 до 6 индекса

        System.out.println("==============");

        System.out.println(Arrays.toString(s.split("")));//Разделяет на символы или можно сделать " " то будет разделять по пробеллу

        System.out.println("==============");

        System.out.println(s.strip());//убирает пробеллы
        System.out.println(s.trim());// убирает пробеллы

    }
}

package academy.java.basic.section_9_string;

import java.util.Arrays;

public class BasicMethod_String {
    public static void main(String[] args) {
        String s1 = "hello world";

        System.out.print(s1.length());
        System.out.println("\n" + s1.charAt(0));
        System.out.println("\n" + Arrays.toString(s1.toCharArray()));// выводит массив символов

        System.out.println(s1.contains("he"));
        System.out.println("s.contains(\"world\")==" + s1.contains("world"));
        System.out.println("s.contains(\"World\")==" + s1.contains("World"));

        System.out.println(s1.indexOf("o"));//с какого индекса начинается о
        System.out.println(s1.lastIndexOf("o"));//с какого индекса начинается последнее о

        System.out.println("---------");

        System.out.println(s1.startsWith("hello"));//Проверка начанется ли строка с этого значения
        System.out.println(s1.endsWith("world"));//Заканчивается ли строка с этого

        System.out.println("----------");

        System.out.println(s1.isEmpty());// пустая ли это строка
        System.out.println("".isEmpty());
    }
}

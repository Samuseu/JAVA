package com.youtube;

/**
 * Часто необходимо узнать содержимое того или иного объекта.
 * Для этого в классе Object языка Java определен специальный метод toString(), возвращающий символьную строку описывающую объект.
 * При создании нового класса принято переопределение  toString() таким образом,
 * чтобы возвращающая строка содержала в себе имя класса, имена и значения всех переменных.
 */
public class ToString {
    public static void main(String[] args) {
        Humans h1 = new Humans("Bob", 40);
        System.out.println(h1);    //вот что выводит стандартно com.youtube.Humans@28a418fc,
        // после добавления метода public String toString выводит Bob 40 ибо мы его переопределили.
    }
}

class Humans {
    private final String name;
    private final int age;

    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + age;

    }
}


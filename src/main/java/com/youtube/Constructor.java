package com.youtube;

public class Constructor {

}

class Human {
    private final String name;
    private int age;

    /**
     * Пример конструкторов, в первом это по умолчанию если параметры не заданы и тд
     */
    public Human() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package com.youtube.test.transformation;

public class Test {
    public static void main(String[] args) {

        //exp Upcasting - Восходящие преобразование
        Animal animal = new Dog();


        Dog dog = new Dog();
        //exp Upcasting - Восходящие преобразование
        Animal animal1 = dog;



        //exp Downcasting - Нисходящие преобразование
        Dog dog1 =(Dog)animal1;
        dog1.bark();

    }
}

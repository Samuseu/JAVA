package com.youtube.test.nasledie;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("Bob",2);
        dog.getInfo();
        System.out.println(dog);
    }
}

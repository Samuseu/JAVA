package com.youtube.test.nasledie;

public class Animal {
    String name;
    int age;

    protected void eat() {
        System.out.println("I am eating");
    }

    protected void sleep() {
        System.out.println("I am sleep");
    }


    protected void getInfo() {
        System.out.println(name + "," + age);
    }
}

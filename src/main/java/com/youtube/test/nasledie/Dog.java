package com.youtube.test.nasledie;

public class Dog extends Animal{
    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
}

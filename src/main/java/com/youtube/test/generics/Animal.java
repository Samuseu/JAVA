package com.youtube.test.generics;

public class Animal {
    public int id;

    public static void eat(){
        System.out.println("Animals is eating");
    }

    public Animal(){

    }
    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}

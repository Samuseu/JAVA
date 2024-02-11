package com.youtube.test.generics;

import java.util.ArrayList;
import java.util.List;

public class FirstGenerics {
    public static void main(String[] args) {
        //////////////Java5//////////////////
        List animals = new ArrayList();
        Animal animal = new Animal();
        animals.add("cat");
        animals.add("frog");
        animals.add("dog");
        animals.add(animal);

        String animal1 = (String) animals.get(1);
        System.out.println(animal1);

        //////////////Generics//////////////////
        List<String> animals1 = new ArrayList<String>();
        animals1.add("cat");
        animals1.add("frog");
        animals1.add("dog");

        System.out.println(animals1.get(1));

        //////////////////java7/////////////
        List<String> animals2 = new ArrayList<>();

    }
    static class Animal {
    }
}

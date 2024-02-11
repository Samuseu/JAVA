package com.youtube.test.generics;

import java.util.ArrayList;
import java.util.List;

public class SecondGenericsTest {
    public static void main(String[] args) {
        List listAnimals = new ArrayList();
        listAnimals.add(new Animal(1));
        listAnimals.add(new Animal(2));

        List listDogs = new ArrayList();
        listDogs.add(new Dog());
        listDogs.add(new Dog());

        test(listAnimals);
        test(listDogs);

                //exp Кр тут--- List<? extends Animal> list означает что ?- можем любой лист,
                // extends -- означает что можем использовать Родителя Animal и ниже(Animal,Dog),
                // а если будем использовать super что можем использовать Animal и выше(Animal,Object).
        /**
         *       Object
         *       Animal
         *       Dog
         */
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animallist : list) {
            Animal.eat();
        }
    }
}

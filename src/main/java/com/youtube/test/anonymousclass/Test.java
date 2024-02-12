package com.youtube.test.anonymousclass;


class Animals{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

public class Test {
    public static void main(String[] args) {
    Animals animal = new Animals();
    animal.eat();

    Animals animal1 = new Animals(){   //Анонимный клас
        @Override
        public void eat(){
            System.out.println("Other animal is eating");
        }
    };

    animal1.eat();
    }
}

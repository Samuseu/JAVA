package com.youtube.test.anonymousclass;

interface AbleToEat {
    public void eat();
}

//class AnimalsToImpements implements AbleToEat {
//
//    @Override
//    public void eat() {
//        System.out.println("Some text");
//    }
//}

public class InterfaceTest {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Some text2");
            }
        };
        ableToEat.eat();

        AbleToEat ableToEat1 = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Some text3");
            }
        };
        ableToEat1.eat();
    }
}
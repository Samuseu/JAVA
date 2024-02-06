package com.youtube;

public class StaticLesson21 {
    public static void main(String[] args) {
        Human h1 = new Human("Боб", 40);
        Human h2 = new Human("Vlad", 20);
        h2.printAllCountHuman();
    }

    static class Human {
        private static int countPeople;
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
            countPeople++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void printAllCountHuman() {
            System.out.println("Всего Человек: " + countPeople);
        }
    }
}
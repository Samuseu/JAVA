package com.youtube.test.polymarfism;

/**
 * Полиморфизм это множество форм. В IT это способность метода обрабатывать данные разных типов
 */
public class Test1 {
    public static void main(String[] args) {

        // здесь мы рассматриваем собаку как животное
        Animal dogAnimal = new Dog();
        //exp Тип Animal определяет ограничение тех методов которые мы можем вызвать,
        // но сама реалезация методода если она есть в потомке будет вызвана, если нет то будет вызван у родителя.
        dogAnimal.eat(); // тут вызывается метод у Dog если небыло этого метода у Dog вызывался у Animal
        dogAnimal.bark(); // тут и ошибка потому что мы рассматриваем Анимал как животное а у метода Animal нету метода Bark

        // Здесь мы рассматриваем собаку как собаку.
        // а тут можем обратиться к методу bark
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
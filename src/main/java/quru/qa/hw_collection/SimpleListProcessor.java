package quru.qa.hw_collection;

import java.util.ArrayList;
import java.util.List;

public class SimpleListProcessor {
    // Хранение элементов в АррайЛист
    List<String> elements;

    /* Конструктор Однако, конструкторы обычно используются для выполнения дополнительных действий при создании объекта.
   Например, вы можете добавить в конструктор логику, которая будет выполняться каждый раз при создании объекта этого класса.
    Это может быть полезно, например, если вы хотите предварительно заполнить список определенными элементами при создании объекта*/
    public SimpleListProcessor() {
        this.elements = new ArrayList<>();
    }


    // Метод для добавления элемента в список
    public void addElement(String element) {
        elements.add(element);
    }

    // Метод для поиска элемента в списке
    public boolean findElement(String targetElement) {
        // Метод contains проверяет, содержится ли элемент в списке
        return elements.contains(targetElement);
    }

    // Метод для удаления элемента из списка
    public boolean removeElement(String targetElement) {
        // Метод remove удаляет первое вхождение элемента в список
        return elements.remove(targetElement);
    }

    // Метод для вывода всех элементов списка
    public void displayElements() {
        System.out.println("Список элементов: " + elements);
    }

    public static void main(String[] args) {
        // Создание объекта SimpleListProcessor
        SimpleListProcessor listProcessor = new SimpleListProcessor();

        // Добавление элементов в список
        listProcessor.addElement("Элемент 1");
        listProcessor.addElement("Элемент 2");
        listProcessor.addElement("Элемент 3");

        // Поиск элемента в списке
        System.out.println("Найден ли 'Элемент 2': " + listProcessor.findElement("Элемент 2"));

        // Удаление элемента из списка
        System.out.println("Удален ли 'Элемент 2': " + listProcessor.removeElement("Элемент 2"));

        // Вывод всех элементов списка
        listProcessor.displayElements();
    }
}

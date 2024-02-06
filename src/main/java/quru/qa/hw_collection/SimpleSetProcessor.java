package quru.qa.hw_collection;

import java.util.Set;
import java.util.TreeSet;

public class SimpleSetProcessor {
    Set<String> elements;

    public SimpleSetProcessor() {
        this.elements = new TreeSet<>();
    }

    public void addElement(String element) {
        elements.add(element);
    }

    //добавление через запятую ... означает принимает множество строк
    public void addElements(String... newElements) {
        for (String element : newElements) {
            elements.add(element);
        }
    }

  /* или так
    public void addElements(String...newElements) {
        Collections.addAll(elements, newElements);
    }*/

    public boolean findElement(String targetElement) {
        return elements.contains(targetElement);
    }

    public boolean deleteElement(String targetElement) {
        return elements.remove(targetElement);
    }

    public void displayElements() {
        System.out.println("Список элементов" + elements);
    }

    public static void main(String[] args) {
        SimpleSetProcessor simpleSetProcessor = new SimpleSetProcessor();

        simpleSetProcessor.addElements("1", "2", "3");

        simpleSetProcessor.displayElements();

        System.out.println("Поиск '2' " + simpleSetProcessor.findElement("2"));
        System.out.println("Удаление 2 " + simpleSetProcessor.deleteElement("2"));
        simpleSetProcessor.deleteElement("2");

        simpleSetProcessor.displayElements();


    }
}

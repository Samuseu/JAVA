package quru.qa.hw_collection;

import java.util.Map;
import java.util.TreeMap;

public class SimpleMapProcessor {
    // Хранение данных в элемент
    Map<Integer, String> elements;

    public SimpleMapProcessor() {
        this.elements = new TreeMap<>();

    }

    //Метод добавления
    public void addElements(Integer key, String value) {
        elements.put(key, value);
    }


    //Метод поиска
    public boolean findElementByKey(String targetKey) {
        return elements.containsKey(targetKey);
    }

    public boolean findElementByValue(String targetValue) {
        return elements.containsValue(targetValue);
    }

    //Метод удаления
    public boolean deleteElements(Integer key) {
        String removedElement= elements.remove(key);
        return removedElement !=null;
    }

    //Метод displayElements
    public void displayElements() {
        System.out.println(elements);
    }

    public static void main(String[] args) {
        SimpleMapProcessor simpleMapProcessor = new SimpleMapProcessor();
        simpleMapProcessor.addElements(2, " Цифра 2 ");
        simpleMapProcessor.addElements(21, " Цифра 21 ");
        simpleMapProcessor.addElements(1, " Цифра 1 ");
        simpleMapProcessor.displayElements();

        simpleMapProcessor.deleteElements(21);

        simpleMapProcessor.displayElements();
    }
}

package quru.qa.hw;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //1. Списки (List)
        //ArrayList
        /*
        Особенности:
    Упорядоченный набор элементов (сохраняется порядок добавления).
    Позволяет дублирование элементов.
    Доступ к элементам по индексу.
    Примеры реализаций:
    ArrayList: Быстрый доступ к элементам, но медленные операции вставки и удаления в середине списка.
    LinkedList: Быстрые операции вставки и удаления, но медленный доступ к элементам в середине списка.
        */
        List<String> myList = new ArrayList<>();
        myList.add("VLad");
        myList.add("Vika");
        myList.add("Vadim");
        System.out.println("Список" + myList);
        //LinkedList
        List<String> myList1 = new LinkedList<>();
        myList1.add("VLadik");
        myList1.add("Vika4ka");
        myList1.add("Vadimka");
        System.out.println("Список" + myList1);

        //2. Множества (Set)
           /*
        Особенности:
        Неупорядоченный набор элементов.
        Не допускает дублирование элементов.

        Примеры реализаций:
        HashSet: Быстрый поиск, но не гарантирует порядок элементов.
        TreeSet: Упорядоченный по элементам набор, основанный на их естественном порядке или определенном компараторе.
        */
        //HashSet
        Set<String> mySet = new HashSet<>();
        mySet.add("1");
        mySet.add("2");
        mySet.add("3");
        System.out.println("HeashSet" + mySet);
        //TreeSet
        Set<String> mySet1 = new TreeSet<>();
        mySet1.add("1");
        mySet1.add("2");
        mySet1.add("3");
        System.out.println("TreeSet" + mySet1);

        //3. Отображения Map
           /*
        Особенности:
        Представляет отображение ключ-значение.
        Ключи уникальны в рамках отображения.

        Примеры реализаций:
        HashMap: Быстрый доступ к значениям, но не гарантирует порядок элементов.
        TreeMap: Упорядоченное отображение по ключам.
        LinkedHashMap: Поддерживает порядок добавления элементов.
        */
        //HashMap
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, " Значение 1");
        myMap.put(2, " Значение 2");
        myMap.put(3, " Значение 3");
        System.out.println("HashMap" + myMap);
        //ThreeMap
        Map<Integer, String> myMap1 = new TreeMap<>();
        myMap1.put(5, " Значение 5");
        myMap1.put(2, " Значение 2");
        myMap1.put(4, " Значение 4");
        System.out.println("HashMap" + myMap1);

        //4. Очереди Queue
           /*
       Особенности:

        Представляет структуру данных в виде очереди, где элементы добавляются в конец и извлекаются из начала.
        Обычно FIFO (First-In-First-Out).

        Примеры реализаций:
        LinkedList (используемый как Queue): Быстрые операции вставки и удаления, но медленный доступ к элементам в середине списка.
        PriorityQueue: Использует приоритетность для определения порядка элементов.
        */
        //LinkedList
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Three");
        myQueue.add("Two");
        myQueue.add("One");
        System.out.println("Queue(LinkedList): " + myQueue);

    }
}

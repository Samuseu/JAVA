package academy.java.basic.section8_massive;

public class ArrayIterator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) { // array.fori
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {//array.forr
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

package academy.java.basic.section8_massive;

public class CheckAllNumber {
    public static void main(String[] args) {
        int[] array = {8, 2, 2, 4, 5};
        var allPositive = true;// Предположение
        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
            if (array[i] <= 0) {
                allPositive = false;
                break;
            }
        }
        if (allPositive) {
            System.out.println("ALL positive");
        } else {
            System.out.println("Not all positive");
        }
    }
}

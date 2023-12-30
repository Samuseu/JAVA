package academy.java.basic.section8_massive;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
      /*  //Read source data
        int[] array = {1, 2, 3, 4, 5};

        //Processing
        var result = 0;
        for (int j : array) {
            result = j;
//            System.out.print(result);
        }
        var number = result;
        var res= 0;
        var temp = number;
        while (temp != 0){
            var digit = temp % 10;
            res = res * 10 +digit;
            temp /= 10;
        }

        //Display results
        System.out.println(res);*/
        // Исходный массив

        // Исходный массив
        int[] array = {1, 2, 3, 4, 5};

        // Произведен переворот массива с использованием цикла
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // Вывод результата
        System.out.println(Arrays.toString(array));
    }
}

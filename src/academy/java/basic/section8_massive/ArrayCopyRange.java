package academy.java.basic.section8_massive;

import java.util.Arrays;



public class ArrayCopyRange {
    public static void main(String[] args) {
        //Read source data
        int[] array = {1, 2, 3, 4, 5};
        var startIndex = 1;
        var endIndex = 3;

        //Processing
        int[] result = new int[endIndex - startIndex];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i + startIndex];
        }
        System.arraycopy(array,startIndex,result,0, result.length); // (Какой массив копируем,с какого элемента,куда,c какого элемента в новом массиве,длина)
        //Display results
        System.out.println(Arrays.toString(result));
    }
}

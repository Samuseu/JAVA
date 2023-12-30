package academy.java.basic.section8_massive;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        //read source datat
        int[] array = {8, 3, 3, 4, 5};

        //processing
        int[] result = new int[array.length];
        System.out.println(Arrays.toString(result));
       /*for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }*/
        System.arraycopy(array, 0, result, 0, array.length);

        //display result
        System.out.println(Arrays.toString(result));
    }
}

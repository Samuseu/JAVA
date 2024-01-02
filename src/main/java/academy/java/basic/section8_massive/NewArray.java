package academy.java.basic.section8_massive;

import java.util.Arrays;

public class NewArray {
    public static void main(String[] args) {
        int[] arrayWihtValues1 = {1, 2, 3, 4, 5};
        double[] arrayWithValues2 = {1., 2., 3., 4., 5.};
        boolean[] arrayWithValues3 = {true, false, true, false, true};
        char[] arrayWithValues24 = {'1', '2', '3', '4', '5'};
        String[] arrayWithValues5 = {"1", "2", "3", "4", "5"};

        int[] arrayWithSize1 = new int[5];          //0
        double[] arrayWithSize2 = new double[5];    //0.0
        boolean[] arrayWithSize3 = new boolean[5];  //false
        char[] arrayWithSize4 = new char[5];        //\u0000
        String[] arrayWithSize5 = new String[5];    //null

        //Пустой массив
        int[] emptyArray1 = {};
        int[] emptyArray2 = new int[0];

        //Выввод массива
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[5];
        System.out.println(Arrays.toString(array1));//[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(array2));//[0, 0, 0, 0, 0]
        System.out.println(array1);// [I@3feba861
        System.out.println(array1[0]);

        array1[0] = 45;
        System.out.println(Arrays.toString(array1));


        //длина массива
        System.out.println(array1.length); // длина массива 5
        System.out.println(array1[array1.length - 1]); // длина массива 5


    }
}

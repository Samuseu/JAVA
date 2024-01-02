package academy.java.basic.section8_massive;

public class FindMinElement {
    public static void main(String[] args) {
        //Read source data
        int[] array = {-7, -2, 8, -18, 5};

        //Processing
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        //Display results
        System.out.println(min);
    }
}

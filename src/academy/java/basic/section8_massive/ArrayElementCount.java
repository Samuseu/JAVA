package academy.java.basic.section8_massive;

public class ArrayElementCount {
    public static void main(String[] args) {
        //Read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2,2};

        //Processing
        int two = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                two = two + 1; // two++
            }
        }
        //Display results
        System.out.println(two);
    }
}

package academy.java.basic.section8_massive;

public class ArrayElementSum {
    public static void main(String[] args) {
//Read source data
        int[] array = {1, 2, 3, 4, 5};

//Processing
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        //Display results
        System.out.println(sum);
    }
}

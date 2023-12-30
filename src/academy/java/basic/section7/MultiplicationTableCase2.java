package academy.java.basic.section7;

public class MultiplicationTableCase2 {
    public static void main(String[] args) {
        /*//read source data
        var two = 2;
        for (int i = 0; i <=9; i++) {
            System.out.println(two + " * " + i + " = " + i * two);*/
        //read source data
        var to = 9;
        //display results
        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= to; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

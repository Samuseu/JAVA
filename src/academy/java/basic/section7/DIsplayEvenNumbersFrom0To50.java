package academy.java.basic.section7;

public class DIsplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        //read source data
        var from = 1;
        var to = 50;
        var even = 2;
        //processing

        //display result
        for (int i = from; i <= to; i++) {
            if (i % even == 0) {
                System.out.print(i + " ");
       //example 2
       /*f var step = 2;
        or (int i = from; i <= to; i+=step) {
            System.out.print(i + " ");        */
            }
        }
    }
}

package academy.java.basic.section7;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        //read source dara
        var from = 100;
        var to = 1;
        var step = 1;
        //processing

        //display result
        for (int i = from; i >= to; i -= step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

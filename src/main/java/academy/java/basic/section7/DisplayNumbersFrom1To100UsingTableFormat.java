package academy.java.basic.section7;

public class DisplayNumbersFrom1To100UsingTableFormat {
    public static void main(String[] args) {
        //read source data
        int from = 1;
        int to = 100;
        int cols = 10;
        //display result
        for (int i = from; i <= to; i++) {
            System.out.print(i + "\t");
            if (i % cols == 0) {
                System.out.println();
            }
        }
    }
}

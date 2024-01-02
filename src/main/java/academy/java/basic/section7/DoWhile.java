package academy.java.basic.section7;

public class DoWhile {
    public static void main(String[] args) {
        //read source data
        var from = 100;
        var to = 1;
        //processing
        //display results

        do {                                        // Хотя бы 1 раз тело выполнится это и есть отличие от for и while
            System.out.print(from + " ");
            from--;
        } while (from >= to);
        System.out.println();

    }
}

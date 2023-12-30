package academy.java.basic.section7;

public class HW_4 {
    public static void main(String[] args) {

        //read source data
        var from = 0;
        var to = 50;
        var even = 2;
        //processing

        //display result
        do {
            System.out.println(from);
            from+=even;
        }while (from <= to);
    }
}

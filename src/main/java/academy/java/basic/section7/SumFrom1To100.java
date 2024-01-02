package academy.java.basic.section7;

public class SumFrom1To100 {
    public static void main(String[] args) {
        //read source data
        int sum = 0;
        int from = 1;
        int to = 100;
        //processing
        for (int i = from; i <= to; i++) {
            sum +=i; // sum = sum + i;
        }
        //display results
        System.out.println(sum);
    }
}

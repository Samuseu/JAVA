package academy.java.basic.section7;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //read source data
        System.out.println("Enter number please");
        var number = new Scanner(System.in).nextInt();
        //processing
        String finalResult;
        if (number < 0) {
            finalResult = "Value should be >=0";
        } else {
            var result = 1;
            for (int i = 1; i <=number; i++) {
                var oldResult = result;
                result *= i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
            }
            finalResult = result == 0 ? "Int overflow" : String.valueOf(result);
        }
        System.out.println(finalResult);
    }
}
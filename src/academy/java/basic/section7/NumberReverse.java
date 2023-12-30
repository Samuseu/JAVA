package academy.java.basic.section7;
/*сходное число:     123456789
Реверсивная версия: 987654321
        -------------------------
Исходное число:     12
Реверсивная версия: 21
        -------------------------
Исходное число:     123454321
Реверсивная версия: 123454321*/


public class NumberReverse {
    //           10 % 1 12 % 10;
    public static void main(String[] args) {
    /*   //read source data
        int number = 123456789;
        var reverse = 0;
        //processing
        for (int i = number; i != 0; i /= 10) {
            int result = i % 10;
            reverse = reverse * 10 + result;
        }
        //display results
        System.out.print(number + "\n" + reverse);*/

        {
            var number = 12345678;
            var result = 0;
            var temp = number;
            while (temp != 0){
                var digit = temp % 10;
                result = result * 10 +digit;
                temp /= 10;
            }
            System.out.println(result);
        }
    }
}


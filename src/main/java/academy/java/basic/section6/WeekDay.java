package academy.java.basic.section6;

import java.util.Scanner;

//Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
public class WeekDay {
    public static void main(String[] args) {
        //read source data
        System.out.println("Введите цифру от 1 -7 и будет вам день недели");
        var day = new Scanner(System.in).nextInt();

        //processing
        String results = "";
        if (day == 1) {
            results = "Monday";
        } else if (day == 2) {
            results = "Tuesday";
        } else if (day == 3) {
            results = "Wednesday";
        } else if (day == 4) {
            results = "Thursday";
        } else if (day == 5) {
            results = "Friday";
        } else if (day == 6) {
            results = "Saturday";
        } else if (day == 7) {
            results = "Sunday";
        }else{
            System.out.println("Ввели некоретное значение");
        }
        //display results
        System.out.println(results);
    }
}



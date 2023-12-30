package academy.java.basic.section6;

import java.util.Scanner;

public class UniversalWeekDay {
    //Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    public static void main(String[] args) {
        //read source data
        var day = 1;
        var isMondayFirst = false;

        //processing
        var internalDay = day;
        if (!isMondayFirst) {
            internalDay--;
            if (internalDay == 0) {
                internalDay = 7;
            }
        }
        String results = "" ;
        if (internalDay == 1) {
            results = "Monday";
        } else if (internalDay == 2) {
            results = "Tuesday";
        } else if (internalDay == 3) {
            results = "Wednesday";
        } else if (internalDay == 4) {
            results = "Thursday";
        } else if (internalDay == 5) {
            results = "Friday";
        } else if (internalDay == 6) {
            results = "Saturday";
        } else if (internalDay == 7) {
            results = "Sunday";
        } else {
            System.out.println("Ввели некоретное значение");
        }
        //display results
        System.out.println(results);
    }
}

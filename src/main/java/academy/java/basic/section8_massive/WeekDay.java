package academy.java.basic.section8_massive;

import java.util.Arrays;

public class WeekDay {
    public static void main(String[] args) {
        //read source data
        var day = 40;
        //processing
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        var result = day >= 1 && day <= 7 ? days[day - 1] : "Invalid day";
        //display result
        System.out.println(result);
    }
}

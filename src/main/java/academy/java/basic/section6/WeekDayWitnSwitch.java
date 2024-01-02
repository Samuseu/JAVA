package academy.java.basic.section6;

import java.util.Scanner;

public class WeekDayWitnSwitch {
    public static void main(String[] args) {
//        "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        //read source data
        System.out.println("Enter please number day 1 to 7 ");
        var day = new Scanner(System.in).nextInt();
        //processing
        String result;
        switch (day) {
            case 1: {
                result = "Monday";
                break;
            }
            case 2: {
                result = "Tuesday";
                break;
            }
            case 3: {
                result = "Wednesday";
                break;
            }
            case 4: {
                result = "Thursday";
                break;
            }
            case 5: {
                result = "Friday";
                break;
            }
            case 6: {
                result = "Saturday";
                break;
            }
            case 7: {
                result = "Sunday";
                break;
            }
            default: {
                result = "Default";
            }
        }
        //display results
        System.out.println(result + " " + day);
    }
}

package academy.java.basic.section6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //read source data
        System.out.println("Enter please year to testing leap year or not.");
        var year = new Scanner(System.in).nextInt();

        //processing
        String result;
        if (year % 400 == 0) {
            result = "Leap year";
        } else if (year % 100 == 0) {
            result = "Not leap year";
        } else if (year % 4 == 0) {
            result = "Leap year";
        } else {
            result = "Not leap year";
        }
        //Display results
        System.out.println(result + " " + year);
        {
            //read source data
            System.out.println("Enter please year to testing leap year or not");
            var year1 = 2024;
            //processing
            boolean isleap;
            if (year % 400 == 0) {
                isleap = true;
            } else if (year % 100 == 0) {
                isleap = false;
            } else if (year % 4 == 0) {
                isleap = true;
            } else {
                isleap = false;
            }
            //display result
            System.out.println(isleap ? "leap year" +" "+ year1 : "Not leap year" + " " + year1 );
        }
        {
            //read source data
            System.out.println("Please enter year to testing leap year or not");
            var year2 = new Scanner(System.in).nextInt();
            //processing
            boolean isLeap1;
            isLeap1 = (year2 % 400== 0 || year2 % 100 !=0 || year2 % 4==0);
            //display result
            System.out.println(isLeap1 ? "Leap year":"Not leap year");
            /*
            //read source data
            System.out.println("Please enter year to testing leap year or not");
            var year2 = new Scanner(System.in).nextInt();
            //processing
            boolean isLeap1;
           if(year2 % 400== 0 || year2 % 100 !=0 || year2 % 4==0){
            isLeap1 = true;
            }else{
               isLeap1 = false;
            }
            //display result
            System.out.println(isLeap1 ? "Leap year":"Not leap year");
            */
        }
    }
}

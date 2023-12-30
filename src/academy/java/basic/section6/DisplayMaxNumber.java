package academy.java.basic.section6;

public class DisplayMaxNumber {
    public static void main(String[] args) {
        //read source data
        var a = 7;
        var b = 3;

        //processing
        var result = a > b ? a : b;

        /*int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }*/
        //display results
        System.out.println(result);
    }
}

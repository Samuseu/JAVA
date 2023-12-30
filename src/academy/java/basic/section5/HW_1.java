package academy.java.basic.section5;

public class HW_1 {
    public static void main(String[] args) {
        var a = 1;

        var b = ++a;
 /*
        var b = ++a;
        a = a + 1;
        var b = a;
        */

        var c = a++;
/*      var c = a++;
        var c = a;
        a = a + 1;
        */

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}



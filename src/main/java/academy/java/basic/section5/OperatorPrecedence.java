package academy.java.basic.section5;

public class OperatorPrecedence {
    public static void main(String[] args) {
        var a = 4;
        var b = 2 + -4 * 5 - a++ / 4 + a++;

        a = 4;
        var c = 2 + ((-4) * 5) - ((a++) / 4) + (a++);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Hello " + 1 + 1);// сложение левострочное Hello 11
        System.out.println( 1 + 1 + " Hello");// 2 Hello
    }
}

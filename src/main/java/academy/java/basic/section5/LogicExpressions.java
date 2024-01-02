package academy.java.basic.section5;

public class LogicExpressions {
    public static void main(String[] args) {
        var a = true;
        var b = false;
        var c = 2 > 1;
        var d = 2 == 1;

        System.out.println(!a);// инверссия
        System.out.println(!b);

        System.out.println(a && b);// 2 амперсанта
        System.out.println(a || b);// или
    }
}
